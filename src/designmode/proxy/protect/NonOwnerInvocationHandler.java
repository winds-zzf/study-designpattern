package designmode.proxy.protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;          //我们需要保持对Person的引用
    public NonOwnerInvocationHandler(PersonBean person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(person,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();         //非法访问异常
            }else if(method.getName().startsWith("set")){
                return method.invoke(person,args);
            }
        }
        catch(InvocationTargetException e){e.printStackTrace();}
        return null;
    }
}

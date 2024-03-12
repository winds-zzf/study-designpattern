package designmode.iterator.genericity;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        testThis();
        //testThat();
    }
    private static void testThis(){
        System.out.println("测试自定义的Iterator");
        ConcreteAggregate<Element> arrayList = new ConcreteAggregate();
        arrayList.add(new Element("A"));
        arrayList.add(new Element("B"));
        arrayList.add(new Element("C"));
        arrayList.add(new Element("D"));
        arrayList.add(new Element("E"));
        Iterator<Element> it = arrayList.iterator();
        while(it.hasNext()){
            Element element = it.next();
            System.out.println("读取:"+element);
            it.remove();
        }
        System.out.println(arrayList.size());
    }
    //测试类库的ArrayList的Iterator<E>方法
    private static void testThat(){
        System.out.println("测试类库里面的Iterator");
        ArrayList<Element> arrayList = new ArrayList<>();
        arrayList.add(new Element("A"));
        arrayList.add(new Element("B"));
        arrayList.add(new Element("C"));
        arrayList.add(new Element("D"));
        arrayList.add(new Element("E"));
        java.util.Iterator<Element> it = arrayList.iterator();
        while(it.hasNext()){
            Element element = it.next();
            System.out.println(element);
            it.remove();
        }
        System.out.println(arrayList.size());
    }
}

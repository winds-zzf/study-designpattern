package designmode.composite.template;

import java.util.ArrayList;
import java.util.Iterator;

class Branch extends Composite{
    /**
     * 新增属性：私有且独有的属性
     */
    private String name;
    private ArrayList<Composite> children;      //对于分支节点，使用ArrayList存储孩子节点有必需的
    //more private fields

    public Branch(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }

    /**
     * 实现共有方法
     */
    @Override
    public String getName(){
        return name;
    }

    @Override
    protected void traverseDFS(String prefix) {
        Iterator<Composite> it = children.iterator();
        while(it.hasNext()){
            Composite child = it.next();
            if(it.hasNext()) System.out.println(prefix+"├────⿻"+child.getName());
            else System.out.println(prefix+"└────⿻"+child.getName());
            if(it.hasNext()) child.traverseDFS(prefix+"│    ");        //四个空格
            else child.traverseDFS(prefix+"     ");                    //5个空格
        }
    }

    /**
     * 拓展功能：独有的方法，这个类在父类的基础上拓展的方法
     * public Composite remove(String name){}   移除组件（容器）
     * public Composite[] getChildren(){}       获取容器中所有组件（容器）
     */
    public void add(Composite composite){
        this.children.add(composite);
    }
    //more unique methods
}

package designmode.composite.template;

class Leaf extends Composite{
    /**
     * 新增属性：私有且独有的属性
     */
    private String name;
    //more private fields

    public Leaf(String name){
        this.name = name;
    }

    /**
     * 实现共有方法
     */
    @Override
    protected void traverseDFS(String prefix) {
        ;
    }

    @Override
    public String getName(){
        return name;
    }

    /**
     * 拓展功能：独有的方法，这个类在父类的基础上拓展的方法
     */

    //more unique methods
}

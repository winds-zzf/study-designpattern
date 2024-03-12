package designmode.composite.example;

abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    /**
     * 默认不能添加节点，除非重写重写add方法
     */
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public void printList(){
        printList("");  //递归入口
    }

    /**
     * 递归方法：用于遍历树形的目录结构，当遇到文件节点时返回
     */
    protected abstract void printList(String prefix);

    public void traverse(){
        System.out.println("/root");
        traverse("");
    }

    protected abstract void traverse(String prefix);

    @Override
    public String toString() {
        return getName()+" ("+getSize()+") ";
    }
}

package designmode.composite.example;

import java.util.ArrayList;
import java.util.Iterator;

class Directory extends Entry{
    private String name;
    private ArrayList<Entry> entries;   //保存文件夹中的子目录条目

    public Directory(String name){
        this.name = name;
        this.entries = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = entries.iterator();
        while(it.hasNext()){    //依次将所有项的大小加起来
            size +=it.next().getSize();
        }
        return size;
    }

    @Override   //对于目录可以执行add方法()，因此需要重写该方法
    public Entry add(Entry entry) throws FileTreatmentException {
        entries.add(entry);
        return this;        //返回当前类，这种方式便于级联式调用
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator<Entry> it = entries.iterator();
        while(it.hasNext()){
            it.next().printList(prefix+"/"+name);
        }
    }

    @Override
    protected void traverse(String prefix) {
        Iterator<Entry> it = entries.iterator();
        while(it.hasNext()){
            Entry entry = it.next();
            if(it.hasNext()) System.out.println(prefix+"├────⿻"+entry.getName());
            else System.out.println(prefix+"└────⿻"+entry.getName());
            if(it.hasNext()) entry.traverse(prefix+"│    ");        //四个空格
            else entry.traverse(prefix+"     ");                    //5个空格
        }
    }

    @Override
    public String toString() {
        return name+":"+getSize();
    }
}

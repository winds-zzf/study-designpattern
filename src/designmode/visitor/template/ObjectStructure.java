package designmode.visitor.template;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 结构对象角色(数据结构：如树形结构或链表等)
 * 该角色需要具备枚举它元素的功能(这里使用了Iterator()功能)，可以提供一个高层接口以允许访问者访问他的元素
 */
class ObjectStructure {
    private ArrayList<Element> elements;
    public ObjectStructure() {
        elements = new ArrayList<>();
    }

    public void add(Element element){
        elements.add(element);
    }

    /**
     * 提供结构对象角色所必需的枚举方法
     */
    public Iterator<Element> iterator(){
        return elements.iterator();
    }
}

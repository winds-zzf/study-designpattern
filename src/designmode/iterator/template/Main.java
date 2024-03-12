package designmode.iterator.template;

class Main {
    public static void main(String[] args) {
        ConcreteAggregate arrayList = new ConcreteAggregate(5);
        arrayList.add(new Element("A"));
        arrayList.add(new Element("B"));
        arrayList.add(new Element("C"));
        arrayList.add(new Element("D"));
        arrayList.add(new Element("E"));
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            Element element = (Element) it.next();
            System.out.println(element);
        }
    }
}

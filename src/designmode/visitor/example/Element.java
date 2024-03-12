package designmode.visitor.example;

interface Element {
    //使用accept的是便于将处理转交给Visitor进行，这样就能分理出单独处理的代码
    void accept(Visitor visitor);
}

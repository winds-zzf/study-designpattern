package designmode.template.example;

class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('H');
        AbstractDisplay stringDisplay = new StringDisplay("Hello, world.");
        AbstractDisplay stringDisplay1 = new StringDisplay("你好，世界");
        charDisplay.display();
        stringDisplay.display();
        stringDisplay1.display();
    }
}

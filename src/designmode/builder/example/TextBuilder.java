package designmode.builder.example;

/**
 * 构造器子类：
 * 构造器中规定了构造器需要完成的功能，这些功能交给子类来具体实现
 */
class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();

    @Override
    void makeTile(String title) {
        buffer.append("=============================\n");
        buffer.append("["+title+"]\n");
        buffer.append("\n");
    }

    @Override
    void makeString(String str) {
        buffer.append("■"+str+"\n");
        buffer.append("\n");
    }

    @Override
    void makeItems(String[] items) {
        for(int i=0;i<items.length;i++){
            buffer.append(" ·"+items[i]+"\n");
        }
        buffer.append("\n");
    }

    @Override
    void close() {
        buffer.append("=============================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}

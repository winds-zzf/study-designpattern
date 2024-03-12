package designmode.builder.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 具体构造器：实现了抽象构造器里面生命的方法
 */
class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;

    @Override
    void makeTile(String title) {
        filename = title+".html";
        try {
            writer = new PrintWriter(new FileWriter("src/designmode/builder/example/"+filename));
        } catch (IOException e) {e.printStackTrace();}
        writer.println("<html><head><title>"+title+"</title></head><body>");
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    void makeString(String str) {
        writer.println("<p>"+str+"</p>");
    }

    @Override
    void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i=0;i< items.length;i++){
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult(){
        return filename;
    }
}

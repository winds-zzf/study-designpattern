package designmode.flyweight.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 表示大型字符的类
 */
class BigChar {
    //字符名称
    private char name;
    //大型字符对应的字符串
    private String date;

    public BigChar(char name) {
        this.name = name;
        try {
            StringBuffer str = new StringBuffer();
            FileInputStream fis = new FileInputStream("src/designmode/flyweight/example/nums/big"+name+".txt");
            FileChannel channel = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate((int)channel.size());
            while(channel.read(buffer)!=-1){
                buffer.flip();  //翻转缓冲区，进入读模式
                str.append(new String(buffer.array(),0,buffer.remaining()));
            }
            this.date = str.toString();
            fis.close();
        } catch (Exception e) {
            this.date = name+"?";
        }
    }

    public void print(){
        System.out.print(date);
    }

    @Override
    public String toString() {
        return date;
    }
}
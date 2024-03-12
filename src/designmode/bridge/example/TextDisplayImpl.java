package designmode.bridge.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class TextDisplayImpl extends DisplayImpl{
    private String filepath = "src/designmode/bridge/example/";
    FileInputStream in = null;

    public TextDisplayImpl(String filename ){
        this.filepath+=filename;
    }

    @Override
    void rawOpen() {
        System.out.println(filepath+":");
        try {
            in = new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("无法打开文件；"+filepath);
        }
    }

    @Override
    void rawPrint() {
        FileChannel channel = in.getChannel();  //从IO服务中获取文件通道
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try {
            while(channel.read(buffer)!=-1){
                buffer.flip();  //翻转缓冲区，进入读取模式
                System.out.print(new String(buffer.array(),buffer.position(),buffer.remaining()));
                buffer.clear(); //清空缓冲区，进入写入模式
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    void rawClose(){
        try {
            in.close();
        } catch (IOException e) {e.printStackTrace();}
    }
}

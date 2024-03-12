package designmode.adapter.test;

import java.io.*;
import java.util.Properties;

/**
 * Adapter：适配旧功能，实现新功能
 * 类型：对象适配器：使用委托的适配器
 */
class FileProperties extends Properties implements FileIO{

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream in = new FileInputStream(filename);
        load(in);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        OutputStream out = new FileOutputStream(filename);
        String header = "written by FileProperties";
        store(out,header);
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}

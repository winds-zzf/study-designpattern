package designmode.adapter.test;

import java.io.IOException;

/**
 * Target：目标接口功能
 * 1.load():加载属性
 * 2.store():存储属性
 */
interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key,String value);
    String getValue(String key);
}

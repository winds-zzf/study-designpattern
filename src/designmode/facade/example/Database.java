package designmode.facade.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 从邮件中获取用户名的类
 */
class Database {
    private Database() {}
    public static Properties getProperties(String dbName){
        String filename = "src/designmode/facade/example/"+dbName+".txt";
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: "+filename+" is not found.");
        }
        return props;
    }
}

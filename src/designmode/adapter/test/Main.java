package designmode.adapter.test;

import java.io.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("src/designmode/adapter/test/file.txt");
            fileIO.setValue("year","2004");
            fileIO.setValue("month","4");
            fileIO.setValue("day","21");
            fileIO.writeToFile("src/designmode/adapter/test/newfile.txt");
        } catch (IOException e) {e.printStackTrace();}
    }
}

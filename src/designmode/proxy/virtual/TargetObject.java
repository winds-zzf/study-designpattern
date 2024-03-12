package designmode.proxy.virtual;

class TargetObject implements TargetInterface{
    public TargetObject(){         //初始化比较费时
        loadFile();
    }

    @Override
    public void display() {
        System.out.println("Displaying the file");
    }

    @Override
    public String getFileName() {
        return "filename";
    }

    private void loadFile(){       //simulate the procedure of loading file
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {e.printStackTrace();}
    }
}

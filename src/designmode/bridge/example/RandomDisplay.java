package designmode.bridge.example;

import java.util.Random;

class RandomDisplay extends Display{
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void randomDisplay(int times){
        int count = new Random().nextInt(times);
        open();
        for(int i=0;i<count;i++){
            print();
        }
        close();
    }
}

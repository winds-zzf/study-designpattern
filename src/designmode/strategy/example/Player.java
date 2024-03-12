package designmode.strategy.example;

class Player {
    private Strategy strategy;  //使用的策略
    private String name;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name,Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose(){
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even(){
        gamecount++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "strategy=" + strategy +
                ", name='" + name + '\'' +
                ", wincount=" + wincount +
                ", losecount=" + losecount +
                ", gamecount=" + gamecount +
                '}';
    }
}

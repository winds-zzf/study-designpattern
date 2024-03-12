package designmode.strategy.example;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Winning",new WinningStrategy());
        Player player2 = new Player("Prob",new ProbStrategy());
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player1.nextHand();
            switch (nextHand1.compare(nextHand2)){
                case 0:
                    System.out.println("Winner:"+player1.getName());
                    player1.win();
                    player2.lose();
                    break;
                case 1:
                    System.out.println("Winner:"+player2.getName());
                    player2.win();
                    player1.lose();
                    break;
                case 2:
                    System.out.println("Even...:");
                    player1.even();
                    player2.even();
                    break;
            }
        }
    }
}

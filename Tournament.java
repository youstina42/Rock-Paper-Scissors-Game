public class Tournament {
    private Player p1;
    private Player p2;
    private final int limit = 3;

    public Tournament(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start(){
        System.out.println("Welcome to the Tournament");

        while(p1.getScore() < limit && p2.getScore() < limit){ 
            playRound();
            System.out.println("Score -> " + p1.getName() + ": " + p1.getScore() + " | " + p2.getName() + ": " + p2.getScore());
        }
        String winner = (p1.getScore() == limit) ? p1.getName() : p2.getName();
        System.out.println("The Winner is " + winner);
    }

    private void playRound(){
        String s1 = p1.makeMove();
        String s2 = p2.makeMove();

        if(s1.equals(s2)){
            System.out.println("No one wins this round");
        }
        else if((s1.equals("rock") && s2.equals("scissors")) || (s1.equals("paper") && s2.equals("rock")) || (s1.equals("scissors") && s2.equals("paper")) ){
            System.out.println(p1.getName() + " Win this round!");
            p1.addPoints();
        }
        else{
            System.out.println(p2.getName() + " Wins this round!");
            p2.addPoints();
        }
    }


}

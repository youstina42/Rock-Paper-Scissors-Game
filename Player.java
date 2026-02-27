public abstract class Player {
    private String name;
    private int score;

    public Player(String name){
        this.name = name;
        this.score = 0;
    }
    public abstract String makeMove();

    public void addPoints(){
        this.score++;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    public static void main(String[] args){
        Player human = new HumanPlayer("You");
        Player computer = new ComputerPlayer("computer");

        Tournament game = new Tournament(human, computer);
        game.start();
    }
    
}
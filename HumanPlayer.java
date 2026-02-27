import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name){
        super(name);
    }

    @Override
    public String makeMove(){
        System.out.println(getName() + " Enter move (Rock, Paper, Scissors): ");
        String move = scanner.nextLine().trim().toLowerCase();
        
        while (!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")){
            System.out.println("Invalid move, try again");
            move = scanner.nextLine().trim().toLowerCase();
        }
        return move;
    }
}

import java.util.Random;

public class ComputerPlayer extends Player {
    private String[] options = {"rock", "paper", "scissors"};
    private Random random = new Random();

    public ComputerPlayer(String name){
        super(name);
    }

    @Override
    public String makeMove(){
        int index = random.nextInt(options.length); 
        String move = options[index];
        System.out.println(getName() + " chose: " + move);
        return move;
    }
}


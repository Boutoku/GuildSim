import java.util.Random;

public class Dice {
    private static int sides;
    private static Random randomGen;

    public Dice(int sides){
        this.sides=sides;
        randomGen = new Random();
    }

    public int rollDice(int diceCount) {
        int totalRoll=0;
        for (int i = 0; i < diceCount; i++) {
            int dieRoll = randomGen.nextInt(sides) + 1;
            //System.out.println(dieRoll);
            totalRoll+=dieRoll;
        }
        return totalRoll;
    }

}

import java.util.Random;

public class Die {
    private int[] probabilities;
    public int value;
    private final int sides;

    Random random = new Random();
    public Die(int sides) {
        this.sides = sides;
    }

    public Die(int sides, int[] probabilities) {
        this.sides = sides;
        this.probabilities = probabilities;
    }
    public void setProbabilities() {
        if (probabilities.length == sides){
            int sum = 0;
            for (int probability : probabilities) {
                sum += probability;
            }
            double [] fractions = new double[probabilities.length];
            for (int k = 0; k< fractions.length; k++){
                fractions[k] = (probabilities[k]/(sum*1.0));
            }
            double rand = Math.random();
            for (int i = 0; i<fractions.length; i++){
                if(rand< fractions[i]){
                    value = i+1;
                    break;
                }
            }
        }
    }
    public void roll() {
        value = random.nextInt(sides) +1;
        setProbabilities();
    }
}

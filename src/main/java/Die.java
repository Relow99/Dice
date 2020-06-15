import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;

public class Die {
    private static final Logger logger = LogManager.getLogger(mainDie.class.getName());
    private int[] probabilities;
    public int value;
    Random r = new Random();
    double random = Math.random();
    private final int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public Die(int sides, int... probabilities) {
        this.sides = sides;
        this.probabilities = probabilities;
    }
    private void setProbabilities(int[] probabilities){
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
        value = r.nextInt(sides )+1;
        try {
            setProbabilities(probabilities);
        }catch (NullPointerException e){

            logger.error(""+e);}
    }

}

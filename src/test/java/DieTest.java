import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {
        public int value;
        Random r = new Random();
        private int sides;
        private int [] probabilities;
        double random = Math.random();

        @Test
   public void setProbabilities(int[] probabilities) {
            this.probabilities = this.probabilities;
            sides = 6;
            this.probabilities = new int[]{6};
            int result = 0;
            for (int probability : this.probabilities) result += probability;

            double [] np = new double[result];
            if(this.probabilities.length ==sides){
                for (int i = 0; i < this.probabilities.length ; i++) {
                    np[i] = (this.probabilities[i])/(result*1.0);
                }
                for (int i = 0; i < this.probabilities.length ; i++) {
                    if (random< np[i]) {
                        value = i+1;
                        break;
                    }
                }
            }
            Assert.assertEquals(6, result);
        }

    @Test
  public void roll() {
        sides = 6;
        value = r.nextInt(sides )+1;
        try {
            setProbabilities(probabilities);
        }catch (NullPointerException e){

            Assert.assertFalse(value ==0);
        }

    }
}

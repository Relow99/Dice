import java.util.Random;

public class DieFactory {
    private int side;
    private int value;

    public int makeDie(int a) throws Exception {
        this.side =a;
        if(a ==6 || a ==20 ){
            roll();
        }else
            throw new Exception  ("We do not create that die in our factory\n" +
                    "we will have to have it custom made\n" +
                    "if you want it you must order in bulk.");
        return value;
    }
    public void roll() {
        Random random = new Random();
        value = random.nextInt(side)+1;
    }
}

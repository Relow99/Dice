public class mainDie {
    public static void main(String[] args) {

        Die die6 = new Die(6);
        try {
            die6.roll();
        }catch (NullPointerException e){}

        Die die20 = new Die(20);
        try {
            die20.roll();
        }catch (NullPointerException e){}


        Die dieDodgy6 = new Die(6,new int[]{1,1,1,1,1,2});
        dieDodgy6.roll();

        System.out.println(die6.value); // this would print a number between 1 and 6 inclusive
        System.out.println(die20.value); // this would print a number between 1 and 20 inclusive
        System.out.println(dieDodgy6.value); // this would print a number between 1 and 6 inclusive with greater odds of appearance
    }
}

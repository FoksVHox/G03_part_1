package src;
import java.util.ArrayList;


public class Raffle {
    private final ArrayList<Die> dice;

    public Raffle() {
        dice = new ArrayList<>();
        for (int i=0;i<2;i++){
            dice.add(new Die());
        }


    }
    public int[] RaffleDices(){
        int [] points = new int[2];
        int counter = 0;
        for (Die indiviualDie : dice){
            points[counter] = indiviualDie.Roll();
            counter++;

        }
        return points;
    }

}

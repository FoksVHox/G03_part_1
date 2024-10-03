package src;

public class Die {
    private int faceValue;
    private void Shuffle(){
        int max = 6;
        int min = 1;
        faceValue = (int)(Math.random()*(max-min+1)+min);


    }

    public int Roll(){
        Shuffle();
        return faceValue;
    }
}

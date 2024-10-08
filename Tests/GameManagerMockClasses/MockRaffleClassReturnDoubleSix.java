package Tests.GameManagerMockClasses;

import src.Raffle;

import java.util.ArrayList;

public class MockRaffleClassReturnDoubleSix extends Raffle {

    int currentIndOfListArray = 0;
    ArrayList<int[]> ListOfInputs;

    public MockRaffleClassReturnDoubleSix (){
        ListOfInputs = new ArrayList<>();

        ListOfInputs.add(new int[]{6,6}); //player 1, 8 points
        ListOfInputs.add(new int[]{6,6}); //player 1, 8 points
    }
    public int[] RaffleDices(){
        int[] returnResults = ListOfInputs.get(currentIndOfListArray);
        currentIndOfListArray++;
        return returnResults;
    }

}

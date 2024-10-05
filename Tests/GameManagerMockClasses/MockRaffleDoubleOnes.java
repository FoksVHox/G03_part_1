package Tests.GameManagerMockClasses;

import src.Raffle;

import java.util.ArrayList;

public class MockRaffleDoubleOnes extends Raffle {

    int currentIndOfListArray = 0;
    ArrayList<int[]> ListOfInputs;

    public MockRaffleDoubleOnes() {
        ListOfInputs = new ArrayList<>();

        ListOfInputs.add(new int[]{6,5}); //player 1, 11 points
        ListOfInputs.add(new int[]{6,5});//player 2, 11 points
        ListOfInputs.add(new int[]{6,5});//player 1, 22 points
        ListOfInputs.add(new int[]{6,5});//player 2, 22 points
        ListOfInputs.add(new int[]{6,5});//player 1, 33 points
        ListOfInputs.add(new int[]{6,5});//player 2, 33 points
        ListOfInputs.add(new int[]{1,1});//player 1, 0 points
        ListOfInputs.add(new int[]{6,6}); // player 1 should not win
        ListOfInputs.add(new int[]{5,4});//player 2, 42 points
        ListOfInputs.add(new int[]{5,3});
        ListOfInputs.add(new int[]{6,6});// player 2 should win



    }
    @Override
    public int[] RaffleDices (){
        if (currentIndOfListArray >= ListOfInputs.size()) {
            throw new IllegalStateException("No more mock inputs available.");
        }
        int[] returnResults = ListOfInputs.get(currentIndOfListArray);
        currentIndOfListArray++;
        return returnResults;
    }
}

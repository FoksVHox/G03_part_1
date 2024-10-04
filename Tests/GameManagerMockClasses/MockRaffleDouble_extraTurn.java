package Tests.GameManagerMockClasses;

import src.Raffle;

import java.util.ArrayList;

public class MockRaffleDouble_extraTurn extends Raffle {

    int currentIndOfListArray = 0;
    ArrayList<int[]> ListOfInputs;

    public MockRaffleDouble_extraTurn() {
        ListOfInputs = new ArrayList<>();

        ListOfInputs.add(new int[]{4,4}); //player 1, 8 points
        ListOfInputs.add(new int[]{4,4});//player 1, 16 points
        ListOfInputs.add(new int[]{4,4});//player 1, 24 points
        ListOfInputs.add(new int[]{4,4});//player 1, 32 points
        ListOfInputs.add(new int[]{4,4});//player 1, 40 points
        ListOfInputs.add(new int[]{4,4});//player 1 should win


    }
    public int[] Raffle (){
        currentIndOfListArray++;
        return ListOfInputs.get(currentIndOfListArray);
    }
}

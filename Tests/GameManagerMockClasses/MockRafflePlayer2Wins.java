package Tests.GameManagerMockClasses;

import src.Raffle;

import java.util.ArrayList;

public class MockRafflePlayer2Wins extends Raffle {

    int currentIndOfListArray = 0;
    ArrayList<int[]> ListOfInputs;

    public MockRafflePlayer2Wins() {
        ListOfInputs = new ArrayList<>();

        ListOfInputs.add(new int[]{2,1});
        ListOfInputs.add(new int[]{6,6});
        ListOfInputs.add(new int[]{3,3});
        ListOfInputs.add(new int[]{6,6});

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

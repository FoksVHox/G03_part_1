package Tests.Utility;

public class DistributionOfRolls {
    int[] AmountFaceValue = {1,2,3,4,5,6};




    public void addValue(int FaceValue){
        AmountFaceValue[FaceValue-1]++;
    }
    public double[] calculateDistribution(){
        double[] distribution = new double[AmountFaceValue.length];


         //TODO implement a way to return the distribution of

        return distribution;
    }

    private int calculateSumOfAmountFaceValue(){

        int sum = 0;
        

    }
}

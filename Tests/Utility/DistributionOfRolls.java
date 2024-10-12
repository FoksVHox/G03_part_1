package Tests.Utility;

public class DistributionOfRolls {

    int[] AmountFaceValue = {0,0,0,0,0,0};




    public void addValue(int FaceValue){
        AmountFaceValue[FaceValue-1]++;
    }
    public double[] calculateDistribution(){
        double[] distribution = new double[AmountFaceValue.length];

        int sum = calculateSumOfAmountFaceValue();

        for (int i = 0; i < AmountFaceValue.length; i++) {
            distribution[i] = (double) AmountFaceValue[i] /sum*100;
        }


        return distribution;
    }

    private int calculateSumOfAmountFaceValue(){

        int sum = 0;
        for( int faceValue : AmountFaceValue ){
            sum += faceValue;
        }
        return sum;
    }
}

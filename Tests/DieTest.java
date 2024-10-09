package Tests;

import Tests.Utility.DistributionOfRolls;
import org.junit.jupiter.api.Test;
import src.Die;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DieTest {

    @Test
    void roll() {
        Die individiulDie = new Die();
        int faceValue = individiulDie.Roll();

        int lowerBound = 1;
        int upperBound = 6;


        assertTrue(faceValue >= lowerBound && faceValue <= upperBound, "Value is not in range!");
    }

    @Test
    void Roll1000Times(){
        Die individiulDie = new Die();
        DistributionOfRolls utilityClass = new DistributionOfRolls();



        for (int i=0;i<1000;i++ ){
            utilityClass.addValue(individiulDie.Roll());
        }
        double[] distributions = utilityClass.calculateDistribution();


        for (double PercentageDistribution : distributions){
            assertTrue(12<PercentageDistribution&& PercentageDistribution<20);

        }

    }
    @Test
    void rollTime() {
        Die individiulDie = new Die();
        long maxTime = 333;
        long startTime = System.currentTimeMillis();
        individiulDie.Roll();
        long endTime = System.currentTimeMillis();
        assertTrue(endTime-startTime < maxTime, "Time too roll die, took too long");
    }


}
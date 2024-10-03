package Tests;

import Tests.Utility.DistributionOfRolls;
import org.junit.jupiter.api.Test;
import src.Die;

import static org.junit.jupiter.api.Assertions.*;
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


        for (double PercentageDistribution : utilityClass.calculateDistribution()){
            assertTrue(20<PercentageDistribution&& PercentageDistribution<30);

        }

    }





}
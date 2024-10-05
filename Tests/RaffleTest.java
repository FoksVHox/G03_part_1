package Tests;

import Tests.Utility.DistributionOfRolls;
import org.junit.jupiter.api.Test;
import src.Raffle;

import static org.junit.jupiter.api.Assertions.*;
class RaffleTest {

    @Test
    void raffle() {

        Raffle sut = new Raffle();

        int[] DieValues = sut.RaffleDices();

        int lowerBound = 1;
        int upperBound = 6;


        for (int faceValue : DieValues) {
            assertTrue(faceValue >= lowerBound && faceValue <= upperBound, "Value is not in range!");
        }
    }

    @Test
    void raffle1000Times() {

        Raffle sut = new Raffle();

        DistributionOfRolls utilityClass = new DistributionOfRolls();



        for (int i=0;i<1000;i++ ){
            int[] DieValues = sut.RaffleDices();
            utilityClass.addValue(DieValues[0]);
            utilityClass.addValue(DieValues[1]);
        }


        for (double PercentageDistribution : utilityClass.calculateDistribution()){
            assertTrue(12<PercentageDistribution&& PercentageDistribution<20);

        }
    }



}
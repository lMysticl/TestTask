package com.sumac;

import com.sumac.service.Impl.PavloMyFunctionsImpl;
import com.sumac.service.PavloMyFunctions;

import java.util.Random;
/**
 * @author Pavel Putrenkov
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        PavloMyFunctions mf = new PavloMyFunctionsImpl();
        long timeStart, timeEnd;

        int arraySize = 5000;
        int rangeOfValues = 2000;
        int targetSum = 100;


        int[] ia = new int[arraySize];

        Random rand = new Random();
        for (int i = 0; i < ia.length; i++) {
            ia[i] = rand.nextInt(rangeOfValues);
        }

        System.out.println("Search second largest");
        timeStart = System.currentTimeMillis();

        System.out.println("Second largest integer in array = " + mf.secondLargest(ia));
        timeEnd = System.currentTimeMillis();
        System.out.println("Total time: " + (timeEnd - timeStart) + " ms\n");


        System.out.println("Find Pairs (sum = " + targetSum + ")");
        timeStart = System.currentTimeMillis();
        System.out.println("All pairs: " + mf.findPairs(ia, targetSum));

        timeEnd = System.currentTimeMillis();
        System.out.println("Total time: " + (timeEnd - timeStart) + " ms\n");

    }

}

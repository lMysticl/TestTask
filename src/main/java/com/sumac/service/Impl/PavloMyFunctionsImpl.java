package com.sumac.service.Impl;

import com.sumac.model.Pair;
import com.sumac.service.PavloMyFunctions;

import java.util.*;
/**
 * @author Pavel Putrenkov
 * @version 1.0
 */
public class PavloMyFunctionsImpl implements PavloMyFunctions {

    /**
     * find the second largest integer in an array.
     *
     * @param ia an array of integers
     * @return the second largest number in ia or a default value of 0
     */
    public int secondLargest(int[] ia) {
        if (ia.length < 2)
            return 0;
        int firstMax = ia[0];
        int secondMax = ia[0];

        for (int item : ia) {

            if (item > firstMax) {
                secondMax = firstMax;
                firstMax = item;
            } else if (item > secondMax & (item != firstMax) || (firstMax == secondMax)) {
                secondMax = item;
            }
        }

        secondMax = (firstMax == secondMax) ? 0 : secondMax;

        return secondMax;

    }

    /**
     * Find all pairs of numbers chosen from ia, such that each pair of numbers adds
     * up to target.
     *
     * @param ia     an array of integers
     * @param target the target integer
     * @return a List of Pairs of numbers that add up to a specified target
     */
    public List<Pair> findPairs(int[] ia, int target) {
        List<Pair> result = new LinkedList<>();
        Map<Integer, Boolean> pairs = new TreeMap<>();


        Arrays.stream(ia)
                .sorted()
                .parallel()
                .filter(anIa -> !validateValue(target, anIa))
                .forEachOrdered((int anIa) -> {

                    if (pairs.containsKey(anIa) && !pairs.get(anIa)) {

                        result.add(new Pair(anIa, target - anIa));

                        if (anIa != target - anIa) {
                            result.add(new Pair(target - anIa, anIa));
                        }
                        pairs.put(anIa, true);

                    } else {
                        pairs.putIfAbsent(target - anIa, false);
                    }

                });
        return result;

    } // findPairs

    public boolean validateValue(long target, long anIa) {
        return target - anIa < Integer.MIN_VALUE || target - anIa > Integer.MAX_VALUE;
    }

    /**
     * Find all pairs of numbers from pa, such that each both numbers in the pair
     * are divisible by the divisor.
     *
     * @param pa      an array of pairs of integers
     * @param divisor the divisor integer
     * @return a List of Pairs of integers that are divisible by the divisor
     * parameter
     */
    public List<Pair> divisible(Pair[] pa, int divisor) {
        List<Pair> result = new ArrayList<>();
        for (Pair p : pa) {
            if ((p.first % divisor == 0) && (p.second % divisor == 0)) {
                result.add(p);
            }
        }
        return result;
    } // divisible

   
}
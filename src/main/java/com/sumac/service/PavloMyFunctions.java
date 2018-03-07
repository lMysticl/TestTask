package com.sumac.service;

import com.sumac.model.Pair;

import java.util.List;

/**
 * @author Pavel Putrenkov
 * @version 1.0
 */
public interface PavloMyFunctions {

    int secondLargest(int[] ia);

    List<Pair> findPairs(int[] ia, int target);

    boolean validateValue(long target, long anIa);

    List<Pair> divisible(Pair[] pa, int divisor);
}

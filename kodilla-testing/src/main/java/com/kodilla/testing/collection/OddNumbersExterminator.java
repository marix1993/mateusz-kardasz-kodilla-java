package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();

        for(Integer exterminateNew : numbers) {
            if(exterminateNew % 2 == 0) {
                newList.add(exterminateNew);
            }
        }
        return newList;
    }
}
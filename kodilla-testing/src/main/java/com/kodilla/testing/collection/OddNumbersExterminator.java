package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        Integer divisionResult = null;
        for(Integer number : numbers) {
            divisionResult = number % 2;
            if(divisionResult == 0) {
                evenNumberList.add(number);
            }
        }
        return evenNumberList;
    }
}

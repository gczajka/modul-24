package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge obj = new SecondChallenge();
        try {
            obj.probablyIWillThrowException(3,2);
        } catch (Exception exc) {
            System.out.println("Exception occured: " + exc);
        }

    }
}

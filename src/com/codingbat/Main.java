package com.codingbat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WarmUp proctor = new WarmUp();

        System.out.println("The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.");
        System.out.println(" We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. ");

        System.out.println("weekday and not on vacation -> " + proctor.sleepIn(false, false));
        System.out.println("weekend and not on vacation -> " + proctor.sleepIn(true, false));
        System.out.println("weekday and on vacation -> " + proctor.sleepIn(false, true));


    }
}

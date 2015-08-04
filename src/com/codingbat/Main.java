package com.codingbat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WarmUp proctor = new WarmUp();

//        System.out.println("===sleepIn===");
//        System.out.println("weekday and not on vacation -> " + proctor.sleepIn(false, false));
//        System.out.println("weekend and not on vacation -> " + proctor.sleepIn(true, false));
//        System.out.println("weekday and on vacation -> " + proctor.sleepIn(false, true));
//
//        System.out.println();
//
//        System.out.println("===diff21===");
//        System.out.println("diff21(19) -> " + proctor.diff21(19));
//        System.out.println("diff21(10) -> " + proctor.diff21(10));
//        System.out.println("diff21(21) -> " + proctor.diff21(21));
//
//        System.out.println();
//
//        System.out.println("===nearHundred===");
//        System.out.println("nearHundred(93) -> " + proctor.nearHundred(93));
//        System.out.println("nearHundred(90) -> " + proctor.nearHundred(90));
//        System.out.println("nearHundred(89) -> " + proctor.nearHundred(89));
//        System.out.println();

//        System.out.println("===missingChar===");
//        System.out.println("kitten, 1 -> " + proctor.missingChar("kitten", 1));
//        System.out.println("kitten, 0 -> " + proctor.missingChar("kitten", 0));
//        System.out.println("kitten, 4 -> " + proctor.missingChar("kitten", 4));
//        System.out.println();

        System.out.println("===backAround===");
        System.out.println("cat -> " + proctor.backAround("cat"));
        System.out.println("Hello -> " + proctor.backAround("Hello"));
        System.out.println("a -> " + proctor.backAround("a"));

    }
}

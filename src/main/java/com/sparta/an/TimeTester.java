package com.sparta.an;

public class TimeTester {
    static String timeCalculator(double startTime, double endTime) {
        double totalTime = endTime - startTime;

        return "The action took " + (totalTime / 1000000) + "ms to complete.";
    }
}

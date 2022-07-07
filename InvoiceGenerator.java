package com.assignment.practice30;

public class InvoiceGenerator {
    private static final int COST_PER_MINUTE = 1;
    private static final double COST_PER_KILOMETER = 10.0;
    double fare;
    private static final double MINIMUM_FARE =5.0 ;

    public double totalFare(double distance, int time)
    {
        return distance*COST_PER_KILOMETER + time*COST_PER_MINUTE;
    }

    public double calculateFare(double distance, int time) {

        if(fare < 5) {
            return MINIMUM_FARE;
        } else {
            return fare;
        }
    }
}

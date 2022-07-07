package com.assignment.practice30;

import org.junit.Assert;
import org.junit.Test;



public class TestCabService {
    @Test
    public void givenDistanceAndTime_returnTotalFare() {
       InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
       double distance = 3.0;
       int time = 10;
       double totalFare = invoiceGenerator.totalFare(distance,time);

       Assert.assertEquals(40,totalFare,0.0);


    }

    @Test
    public void givenLessDistanceAndTime_returnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);

        Assert.assertEquals(5,fare,0.0);

    }

    @Test
    public void givenMultipleRide_returnAggregateFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Rides rides =new Rides(0.1,1);

    }
}

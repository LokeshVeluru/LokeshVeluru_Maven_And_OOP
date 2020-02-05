package com.lokesh.NewYearGift;

import com.lokesh.NewYearGift.Sweets.*;

import java.util.ArrayList;

public class Application {

    private GiftController giftController;

    ArrayList<Sweet> sweets;

    public Application() {
        giftController = new GiftController();
    }

    public void start() {
       process();
    }

    private void process() {
    	int noOfTimes = (int) (Math.random() * (10 - 1)) + 1 ;
        giftController.generateGift(noOfTimes);
    }

}
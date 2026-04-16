package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int n = 10; n >= 1; n = n - 1){
            System.out.println(n);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}

//I will send you an array of integers that contain 5 numbers 
//return the average of them (as integer if its double round to nearest integer)
//Example: [1,2,3,4,5] -> 3package com.mycompany.averageminiproject;

public class Average {

    public static double calculate(double[]grade){

        double sum = 0;

        for (int i=0;i<5;i++) {
            sum+= grade[i];
        }

        return sum/5;
    }

}
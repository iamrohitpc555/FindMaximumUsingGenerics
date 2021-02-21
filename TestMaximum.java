package com.testmaximum;

public class TestMaximum {
   
    public Integer findMaximumInteger(Integer num1, Integer num2, Integer num3) {
        //num1 is largest so far
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            //num2 is largest so far
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            //num3 is largest so far
            max = num3;
        }
        return max;
    }

    
    public Float findMaximumFloat(Float num1, Float num2, Float num3){
        Float max = num1;
        if(num2.compareTo(num1) > 0){
            max = num2;
        }
        if(num3.compareTo(num2) > 0){
            max = num3;
        }
        return max;
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        int [] digits = {3, 5, 0, 4, 8, -18, -20};
        int sum2 = 0;
        int i = 0;
        while (i < digits.length){
            if(digits[i] % 2 ==0)
                sum2 ++;
            i++;
        }
        System.out.println(sum2);
    }
}
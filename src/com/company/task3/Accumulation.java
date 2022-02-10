package com.company.task3;

public class Accumulation {
   private int i = 0;
   private double sum = 0;
   private int[] tut = new int[5];
      
   public int getI (){
       return i;
   }
   
   public double getSum (){
       return sum;
   }

    public void accumulate (int y) {
        if (i == 5) {
            while (i > 1) {
                tut[5 - i] = tut[5 - i + 1];
                i--;
            }
            i = 4;
        }
        tut[i] = y;
        i++;
    }

    public void printAverage() {
        for (int t = 0; t < i; t++) {
            sum += tut[t];
        }
        System.out.println(sum / i);
    }
}

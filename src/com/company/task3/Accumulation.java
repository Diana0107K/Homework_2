package com.company.task3;

public class Accumulation {
    int i = 0;
    int sum = 0;
    int[] tut = new int[5];

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

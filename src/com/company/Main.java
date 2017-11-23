package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final int N = 10;
        int i, j, c;
        int a[] = new int[N];

        Random r = new Random();

        for (i = 0; i < N; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i]);
        }
System.out.println();
        for (i = 0; i < N - 1; i++) {
            for (j = N - 2; j >= i; j--) {
                if (a[j] > a[j + 1]) {
                    c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                }
            }
        }

        for (i = 0; i < N; i++) {
            System.out.print(a[i]);
        }
    }

    }




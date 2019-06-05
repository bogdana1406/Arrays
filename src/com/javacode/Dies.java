package com.javacode;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i= 0; i<1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }

       for (int i = 1; i < frequency.length; i++){
           System.out.println("Side "+i+ " : "+frequency[i]);
       }

        multidimArrayLauncher();

    }

    private static void multidimArrayLauncher() {
        int[][] a = {{1, 2},
                     {1, 8, 12, 9},
                     {1, 7, 48, 13, 7}};
        int[][] b = new int[3][3];
        int[][] c = new int[2][];
        c[0] = new int[3];
        c[1] = new int[1];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}

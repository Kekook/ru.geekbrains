package dz2.geekgrains;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        findArray();
        createDiagonal();
//        createDiagonal2();
        maxAndMinArray();


    }

    public static void invertArray() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else arr1[i] = 1;
            System.out.print(arr1[i] + " ");

        }
        System.out.println();


    }

    public static void fillArray() {
        int[] arr2 = new int[8];
        int k = 0;

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = k;
            k += 3;


            System.out.print(arr2[i] + " ");

        }
        System.out.println();
    }

    public static void findArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
                System.out.print(arr3[i] + " ");
            }


        }
        System.out.println();

    }

    static void createDiagonal() {
        int[][] arr5 = new int[5][5];

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5.length; j++) {
                if ((i == j) || (i == arr5.length - 1 - j)) {
                    arr5[i][j] = 1;
                    //    }
                    // }
                }
                //for (int i = 0; i < arr5.length; i++) {       не понял нужно ли второй раз выводить цикл или нет ????

                //  for (int j = 0; j < arr5.length; j++) {
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void maxAndMinArray() {
        int[] arr6 = {56, -47, -99, -150, -8, 11, 45};
        int min = arr6[0];
        int max = arr6[0];

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < min)
                min = arr6[i];

            if (arr6[i] > max)
                max = arr6[i];

            System.out.println("min : " + min + "; max : " + max);

        }

    }
}
//    public static void createDiagonal2() {
//    int[][] arr = new int[3][3];
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
//            if (i == j || i == x) arr[i][j] = 1;
//            else arr[i][j] = 0;
//            System.out.print(arr[i][j] + " ");
//            // второй способ нарисовать диагональ
//        }
//        System.out.println();

//        }
//    }
//}









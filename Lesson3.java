package lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5(10, 5);
        Task6() ;
        int[] arr = {2, 0, 3, 1, 4, 7, 10, 5};
        System.out.println(Task7(arr));
        Task8(arr, -3);
    }

    private static void Task1() {
        int[] data = new int[5];
        data[0] = 1 ;
        data[1] = 0 ;
        data[2] = 0 ;
        data[3] = 1 ;
        data[4] = 1 ;
        System.out.println("Task1 result:");
        System.out.println("Первоначальный массив:");
        System.out.println(Arrays.toString(data));
        for(int i=0; i<data.length;i++){
            if (data[i] == 0) {
                data[i] = 1 ;
            }
            else data[i] = 0 ;

        }
        System.out.println("Измененный массив:");
        System.out.println(Arrays.toString(data));
    }

    private static void Task2() {
        int[] data = new int[100];
        System.out.println("Task2 result:");
        for(int i=0; i<data.length;i++){
             data[i] = i +1 ;

        }
        System.out.println(Arrays.toString(data));
    }

    private static void Task3() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Task3 result:");
        System.out.println("Первоначальный массив:");
        System.out.println(Arrays.toString(data));
        for(int i=0; i<data.length;i++){
            if (data[i] < 6) {
                data[i] = data[i] * 2 ;
            }

        }
        System.out.println("Измененный массив:");
        System.out.println(Arrays.toString(data));
    }

    private static void Task4() {
        final int SIZE = 5;
        int[][] data = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i==j || i+j == SIZE-1){
                    data[i][j] = 1 ;
                }

            }

        }
        System.out.println("Task4 result:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(Arrays.toString(data[i]));
        }

    }

    private static void Task5(int len, int initialValue) {
        final int SIZE = len;
        int[] data = new int[SIZE];
        System.out.println("Task5 result:");
        for(int i=0; i<SIZE;i++){
            data[i] = initialValue ;
        }
        System.out.println(Arrays.toString(data));
    }


    private static void Task6() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = data[0];
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min){
                min = data[i] ;
            }
            if (data[i] > max){
                max = data[i] ;
            }
        }
        System.out.println("Task6* result:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static boolean Task7(int[] data){
        int leftSum = 0;
        for(int i = 0; i < data.length; i++){
            leftSum += data[i];
            int rightSum = 0;
            for (int j = 0; j < data.length; j++){
                rightSum += (j > i)? data[j] : 0;
            }
            if(leftSum == rightSum){
                System.out.println("Task7** result:");
                return true;
            }
        }
        System.out.println("Task7** result:");
        return false;
    }

    private static void Task8(int[] data, int n) {
           System.out.println("Task8*** result:");
           System.out.println("Первоначальный массив:");
           System.out.println(Arrays.toString(data));
           System.out.println("Число для сдвига:" + n);
            boolean FlgDir = n < 0;
            n = (n < 0) ? -n : n;
            n %= data.length;
            int LastVal = data.length - 1;
            for (int i = 0; i < n; i++) {
                int A = (FlgDir) ? data[0] : data[LastVal];

                for (int j = 0; j < LastVal; j++) {
                    if (FlgDir)
                        data[j] = data[j + 1];
                    else
                        data[LastVal - j] = data[LastVal - j - 1];
                }

                if (FlgDir)
                    data[LastVal] = A;
                else
                    data[0] = A;
            }
            System.out.println("Измененный массив:");
            System.out.println(Arrays.toString(data));



    }
}

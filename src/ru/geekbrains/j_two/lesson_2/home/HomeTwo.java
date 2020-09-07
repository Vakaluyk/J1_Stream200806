package ru.geekbrains.j_two.lesson_2.home;

import java.util.Arrays;

public class HomeTwo {

    private static void swap(int [] arr ){
        for (int i=0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] =0;
            }else {
                arr[i]=1;
            }
        }
    }
    private static void fill(int[]arr){
        for (int i=0; i < arr.length; i++){
            arr[i]=i*3+1;
        }
    }

    private  static void raise(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr [i]>6)
                arr[i] *=2;
        }
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min)
                min = arr[i];
        }
        return min;
    }

    private static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> max)
                max = arr[i];
    }
        return  max;
    }




    public static void main(String[] args){
        int [] ar0= {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
         System.out.println(Arrays.toString(ar0));
         swap(ar0);
        System.out.println(Arrays.toString(ar0));

        int[] ar1 = new int[8];
        fill(ar1);
        System.out.println(Arrays.toString(ar1));

        int [] ar2= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        raise(ar2);
        System.out.println(Arrays.toString(ar2));

        int [] ar3= {13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        findMin(ar3);
        findMax(ar3);
        System.out.println(Arrays.toString(ar3));
        System.out.println(findMin(ar3));
        System.out.println(findMax(ar3));





    }
}

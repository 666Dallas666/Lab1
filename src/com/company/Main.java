package com.company;
public class Main {
    public static void main(String[] args) {
	int[] nums = new int[10];
	for (int i = 0; i < 10; i++){
	    nums[i] = (int)(Math.random()*100);
    }
        System.out.println("Массив целых чисел:");
        for (int i = 0; i < 10; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        int sum1 = 0;
        for (int i = 0; i < 10; i++){
            sum1 += nums[i];
        }
        System.out.print("Сумма элементов через цикл for: ");
        System.out.println(sum1);
        int sum2 = 0;
        int j = 0;
        while(j != 10){
            sum2 += nums[j];
            j++;
        }
        System.out.print("Сумма элементов через цикл while: ");
        System.out.println(sum2);
        int sum3 = 0;
        int z = 0;
        do{
            sum3 += nums[z];
            z++;
        }
        while(z != 10);
        System.out.print("Сумма элементов через цикл do while: ");
        System.out.println(sum3);
    }
}
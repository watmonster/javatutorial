package HelloJava;

import java.util.ArrayList;

//Write a program that uses the Scanner class to ask for numbers
//from the user. After every number,
//print out the total of all of the entered numbers,
//as well as the min, max, and average.

import java.util.Scanner;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Type a number and press enter: ");
            String num = scanner.nextLine();
            Integer intnum = Integer.parseInt(num);
            nums.add(intnum);
            //System.out.println(nums);
            printStats(nums);
        }

        scanner.close();
    }

    public static void printStats(ArrayList<Integer> nums){
        System.out.println(nums);
        System.out.println("Min: " + Collections.min(nums));
        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Sum: " + sum(nums));
        float avg = (float)(sum(nums))/nums.size();
        System.out.println("Avg: " + avg);
    }

    public static int sum(ArrayList<Integer> nums){
        int total = 0;
        for(Integer num : nums){
            total += num;
        }
        return total;
    }
}

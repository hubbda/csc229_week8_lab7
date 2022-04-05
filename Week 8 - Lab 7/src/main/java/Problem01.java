/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        int sum = 0;
        for(int i=2; i <= n; i++)
            if(isPrim(i)) {
                sum = sum + i;
            }
        return sum;
    }

     public static boolean isPrim(int x) {
        for(int i=2; i<x; i++)
            if(x%i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(5));
    }

}

//Time and Space Complexity is 0(n)

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        int i = 0, location = 0;
        while(i <= n && x != arr[i]) {
            i = i + 1;
            if(i <= n) location = i;
            else location = -1;
        }
        return location;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
    }

    public static void main(String[] args) {
        int[] myArr = {5,10,15,20,25,30,35,40,45,50};
        System.out.println(search(myArr,20));
    }

    //
    
}

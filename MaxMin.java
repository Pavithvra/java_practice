//Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.
//
//Example 1:
//
//Input:
//N = 5
//A[] = {-2, 1, -4, 5, 3}
//Output: 1
//Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
//
//
//Example 2:
//
//Input:
//N = 4
//A[]  = {1, 3, 4, 1}
//Output: 5
//Explanation: min = 1, max = 4. Sum = 1 + 4 = 5
//
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function findSum() which takes the array
// A[] and its size N as inputs and returns the summation of minimum and maximum element of the array.
//
//
//
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//
//
//
//Constraints:
//1 <= N <= 105
//-109 <= Ai <= 109

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static int sum(int arr[]){
        int l = arr.length;
        Arrays.sort(arr);
        int sum = arr[0]+arr[l-1];
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i =0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }
}

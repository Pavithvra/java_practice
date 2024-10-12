//Given an array arr containing only 0s, 1s, and 2s. Sort the array in ascending order.
//
//Examples:
//
//Input: arr[] = [0, 2, 1, 2, 0]
//Output: 0 0 1 2 2
//Explanation: 0s 1s and 2s are segregated into ascending order.
//Input: arr[] = [0, 1, 0]
//Output: 0 0 1
//Explanation: 0s 1s and 2s are segregated into ascending order.
//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)
//
//Constraints:
//1 <= arr.size() <= 106
//0 <= arr[i] <= 2

import java.util.Arrays;
import java.util.Scanner;

public class Sort0s1s2s {
    public static void check(int arr[]){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []= new int [n];
        for(int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        check(arr);

    }
}

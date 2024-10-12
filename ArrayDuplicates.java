//Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements
// occurring more than once in the given array. Return the answer in ascending order. If no such element is found,
// return list containing [-1].
//
//Examples:
//
//Input: n = 4, arr[] = [0,3,1,2]
//Output: -1
//Explanation: There is no repeating element in the array. Therefore output is -1.
//Input: n = 5, arr[] = [2,3,1,2,3]
//Output: 2 3
//Explanation: 2 and 3 occur more than once in the given array.
//Expected Time Complexity: O(n).
//Expected Auxiliary Space: O(n).
//
//Constraints:
//
//1 <= n <= 105
//0 <= arr[i] <= 105, for each valid i

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicates {
    public static ArrayList<Integer> dupli(int n , int arr[]){
        int flag = 0;
        int count = 0;
        Arrays.sort(arr);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 0; i < n-1; i++) {
            if (i != 0) {
                if (arr[i - 1] == arr[i]) {
                    continue;
                }
            }
            count = 0;
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count == 1) {
                    arr2.add(arr[i]);
                }
                flag = 1;
            }
        }
        if(flag ==1){
            return arr2;
        }
        arr2.add(-1);
        return arr2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(dupli(n, arr));
    }
}

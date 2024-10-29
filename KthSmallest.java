//Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth
// smallest element in the given array.
//
//Follow up: Don't solve it using the inbuilt sort function.
//
//Examples :
//
//Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
//Output:  7
//Explanation: 3rd smallest element in the given array is 7.
//Input: arr[] = [2, 3, 1, 20, 15], k = 4
//Output: 15
//Explanation: 4th smallest element in the given array is 15.
//Expected Time Complexity: O(n+(max_element) )
//Expected Auxiliary Space: O(max_element)
//Constraints:
//1 <= arr.size <= 106
//1<= arr[i] <= 106
//1 <= k <= n

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static int ksmall(int arr[], int k){
        int l = arr.length;
        Arrays.sort(arr);
        return arr[k-1]; // for largest arr[l-k]
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(ksmall(arr,k));
    }
}

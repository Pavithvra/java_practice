import java.util.Scanner;

//Given a sorted array arr and an integer k, find the position(0-based indexing) at which
// k is present in the array using binary search.
//
//Examples:
//
//Input: k = 4, arr= [1, 2, 3, 4, 5]
//Output: 3
//Explanation: 4 appears at index 3.
//Input: k = 445, arr= [11, 22, 33, 44, 55]
//Output: -1
//Explanation: 445 is not present.
//Expected Time Complexity: O(logn)
//Expected Space Complexity: O(logn)
//
//Note: Try to solve this problem in constant space i.e O(1)
//
//Constraints:
//1 <= arr.size() <= 105
//1 <= arr[i] <= 106
//1 <= k <= 106
public class BinarySearch {
    public static int search(int n, int k, int arr[]){
        int res =0;
        for(int i =0;i<n;i++) {
            if (arr[i] == k) {
                res = i;
                return res;
            }
        }
        return  -1;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(n, k, arr));
}
}

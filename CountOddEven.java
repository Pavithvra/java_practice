//Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements
// in the array.
//
//Note: Return an array of two elements where the first one in the count of odd & second one is the count of even.
//
//Examples:
//
//Input: arr[] = [1, 2, 3, 4, 5]
//Output: 3 2
//Explanation: There are 3 odd elements (1, 3, 5) and 2 even elements (2 and 4).
//Input: arr[] = [1, 1]
//Output: 2 0
//Explanation: There are 3 odd elements (1, 1) and no even elements.
//Expected Time Complexity: O(n)
//Expected Space Complexity: O(1)
//
//Constraints:
//1 <= arr.size <= 106
//1 <= arr[i] <= 106

import java.util.Arrays;
import java.util.Scanner;

public class CountOddEven {
    public static int[] count(int arr[]){
        int l = arr.length;
        int counte=0;
        int counto=0;
        for (int i=0;i<l;i++){
            if(arr[i]%2 ==0){
                counte++;
            }
            else{
                counto++;
            }
        }
        int res[]=new int[2];
        res[0] = counto;
        res[1] = counte;
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(count(arr)));
    }
}

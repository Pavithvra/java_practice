import java.util.Arrays;
import java.util.Scanner;

//Given two arrays arr1 and arr2 of equal size, the task is to find whether the given arrays are equal. Two arrays are
// said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be
// different though.
//Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.
//
//Examples:
//
//Input: arr1[] = [1, 2, 5, 4, 0], arr2[] = [2, 4, 5, 0, 1]
//Output: true
//Explanation: Both the array can be rearranged to [0,1,2,4,5]
//Input: arr1[] = [1, 2, 5], arr2[] = [2, 4, 15]
//Output: false
//Explanation: arr1[] and arr2[] have only one common value.
//Expected Time Complexity: O(n)
//Expected Space Complexity: O(n)
//
//Constraints:
//1<= arr1.size, arr2.size<=107
//0<=arr1[], arr2[]<=109
public class CheckEqualArrays {
    public static boolean checkEqual(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int l1 = arr1.length;
        int l2 = arr2.length;
        if(l1 != l2){
            return false;
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i =0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i =0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(checkEqual(arr1,arr2));
    }
}

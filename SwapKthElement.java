import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given an array arr, swap the kth element from the beginning with the kth element from the end.
//
//Note: 1-based indexing is followed.
//
//Examples :
//
//Input: k = 3, arr = [1, 2, 3, 4, 5, 6, 7, 8]
//Output: [1, 2, 6, 4, 5, 3, 7, 8]
//Explanation: 3rd element from beginning is 3 and 3rd element from end is 6, so we replace 3 & 6.
//Input: k = 2, arr = [5, 3, 6, 1, 2]
//Output: [5, 1, 6, 3, 2]
//Explanation: 2nd element from beginning is 3 and from end is 1.
//Expected Time Complexity: O(1)
//Expected Auxiliary Space: O(1)
//
//Constraints:
//1 ≤ k ≤ arr.size() ≤ 106
//-109 ≤ arr[i] ≤ 109
public class SwapKthElement {
    public static List<Integer> swapk(int k, List<Integer> arr){
        int l = arr.size();
        int temp = arr.get(k-1);
        arr.set(k-1, arr.get(l-k));
        arr.set(l-k,temp);
        return arr;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> arr=new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int temp = sc.nextInt();
            arr.add(temp);
        }
        int k = sc.nextInt();
        System.out.println(swapk(k,arr));
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given an array arr. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
//
//Note: There can be more than one element in the array which have the same value as its index. You need to include
// every such element's index. Follows 1-based indexing of the array.
//
//Examples:
//
//Input: arr[] = [15, 2, 45, 4 , 7]
//Output: 2 , 4
//Explanation:
//Here, arr[2] = 2 exists here.
//and arr[4] = 4 exists here.
//Input: arr[] = [1]
//Output: 1
//Explanation: Here arr[1] = 1 exists.
//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(k)
//
//Constraints:
//1 ≤ arr.size ≤ 105
//1 ≤ arr[i] ≤ 106
public class ValueEqualsIndexValue {
    public static List result (List<Integer> arr){
        List <Integer> res = new ArrayList<>();
        int l = arr.size();
        for(int i =0;i<l;i++){
            if(i+1 == arr.get(i)){
                res.add(i+1);
            }
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            int temp = sc.nextInt();
            arr.add(temp);
        }
        System.out.println(result(arr));
    }
}

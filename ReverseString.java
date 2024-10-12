import java.util.Scanner;

//You are given a string s. You need to reverse the string.
//
//Examples:
//
//Input: s = "Geeks"
//Output: "skeeG"
//Input: s = "for"
//Output: "rof"
//Expected Time Complexity: O(|s|)
//Expected Auxiliary Space: O(1)
//
//Constraints:
//1 <= |s| <= 104
public class ReverseString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer res = new StringBuffer();
        res.append(str);
        res.reverse();
        res.toString();
        System.out.println(res);

    }
}

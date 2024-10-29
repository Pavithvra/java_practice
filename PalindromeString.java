import java.util.Scanner;

//Given a string S, check if it is palindrome or not.
//
//Example 1:
//
//Input:
//S = "abba"
//Output:
//1
//Explanation:
//S is a palindrome
//Example 2:
//
//Input:
//S = "abc"
//Output:
//0
//Explanation:
//S is not a palindrome
//Your Task:
//You don't need to read input or print anything. Complete the function isPalindrome() which takes string S as parameter
// and returns an integer value 1 if it is palindrome else 0.
//
//Constraints:
//1 <= Length of S<= 2*105
public class PalindromeString {
    public static boolean palindrome(String str){
        char ch;
        String ans ="";
        for(int i = 0;i < str.length();i++){
            ch = str.charAt(i);
            ans = ch+ans;
        }
        return ans.equals(str);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindrome(str));
    }
}

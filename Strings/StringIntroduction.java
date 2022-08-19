/*
Writer - Kushagra Gupta 19 Aug 2022

Question - You are given a user input string which is in lower case. You need to count each character present in the string and print them in increasing order.

Test Case -1 User Input String="Kushagra";(consider)
                  Output       a = 2
                               g = 1
                               h = 1
                               k = 1
                               r = 1
                               s = 1
                               u = 1
 */
import java.util.Arrays;
import java.util.Scanner;
public class Kushagra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[]= new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;

        }
        //System.out.println(Arrays.toString(arr)); for checking the result

        for (int i = 0; i < 26; i++) {
            if(arr[i]>0){
                System.out.println((char)(i+'a') + " " + arr[i]);
            }

        }
    }
}

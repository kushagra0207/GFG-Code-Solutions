/*
* Writer - Kushagra Gupta  21 Aug 2022
*
* Question- Write a program in java to check whether a subsequence is present or not in the first string.
* input s = "kushagra"
*       s2 = "aga"
* output : True
*
* input s = "Amangramer"
*       s2 ="arg"
* output : False
 */
import java.util.Scanner;
public class Kushagra {
    static boolean kg(String A, String B){
        int i=0,j=0;
        while(i<A.length() && j<B.length()){
            if (A.charAt(i) == B.charAt(j)) {

                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j==B.length()){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean gu = kg(A,B);
        if(gu==false){
            System.out.println("False");

        }
        else {
            System.out.println("True");
        }
    }
}

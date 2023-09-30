

//Palindrome using Strings

import java.util.*;

public class Palindrome {


    public static void main(String[] args) {
         String reverse = "";
        System.out.println("enter your palindrome statement :");

//getting value from users
        Scanner l=new Scanner(System.in);
        String n=l.nextLine();

//finds the statements length
        int name=n.length();

//reverse the statement using loop and find the positioned characters

        for (int i=name-1;0<=i;i--){
             reverse= reverse+n.charAt(i);     //charAt()- is a method used to find the charcter
        }


//comparing the original character and reversed character
        if (n.equals(reverse)){
            System.out.println(n+" is a palindrome");
        }else {
            System.out.println(n+" is not a palindrome");
        }

    }

}

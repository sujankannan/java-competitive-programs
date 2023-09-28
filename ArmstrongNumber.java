import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,orgnum,numb,no=0;
        System.out.println("Enter your number :");
        Scanner o=new Scanner(System.in);
         n =o.nextInt();          //changed or accepted as integer
         orgnum=n;               // having original number as a isolate to check with calculate no.

        while (n!= 0){          //checks untill the numbers goes 0
         numb=n % 10;           //to get the last number
         no+=Math.pow(numb,3);  //cube calculation
         n/=10;                 // to get the balance value

        }
        if (orgnum==no){
            System.out.println(no + "is a ARMSTRONG NUMBER");
        }else {
            System.out.println(no + "is not a ARMSTRONG NUMBER");
        }

    }
}

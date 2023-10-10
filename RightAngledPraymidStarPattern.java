//right angled praymid Star Pattern

public class RightAngledPraymidStarPattern {
    public static void main(String[] args) {

        int n = 5, i, j, s,r=4;

        for (i = 0; i < n; i++) {

            for (j = 0; j <n+i-4; j++) {      //upper side
                System.out.print("* ");
            }
            System.out.println("");
        }


        for (i = 0; i < n; i++) {
            for (int q = 0; q < r - i; q++) {       //lower side 
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}

//praymid Star Pattern

public class praymidStarPattern {
    public static void main(String[] args) {

        int n = 5, i, j, s;

        for (i = 0; i < n; i++) {
            for (s = 0; s <=n-i-1; s++)    // for spacing
            {
                System.out.print(" ");
            }
            for (j = 0; j <i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
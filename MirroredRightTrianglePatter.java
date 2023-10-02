//Mirrored Right Triangle Star Pattern

public class Mirrored RightTrianglePattern {
    public static void main(String[] args) {

        int n = 5, i, j, s;

        for (i = 0; i < n; i++) {
            for (s = 0; s <= 4-i; s++)    // for spacing
            {
                System.out.print(" ");
            }
            for (j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

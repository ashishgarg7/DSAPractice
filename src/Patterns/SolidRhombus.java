package Patterns;

public class SolidRhombus {

    public static void main(String [] args) {

        int n = 5;
        for(int i = n; i > 0; i--) {

            for(int j = 0; j < i - 1; j++) {
                System.out.print("^");
            }

            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }

            for(int j = n; j > i; j--) {
                System.out.print("^");
            }

            System.out.println();
        }
    }
}

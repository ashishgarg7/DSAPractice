package Patterns;

public class Butterfly {

    public static void main(String [] args) {

        int n = 6;
        // Pattern 1st
        for(int i = 1; i <= n; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for(int j = i; j  < n; j++) {
                System.out.print(" ");
            }

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 2nd
        for(int i = n; i > 0; i--) {

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for(int j = i; j  < n; j++) {
                System.out.print(" ");
            }

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

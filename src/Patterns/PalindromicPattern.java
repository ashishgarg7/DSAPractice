package Patterns;

public class PalindromicPattern {

    public static void main(String [] args) {

        int n = 5;
        for(int i = 1; i <= 5; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int j = i; j > 0; j--) {
                System.out.print(j);
            }

            for(int j = 2; j < i + 1; j++) {
                System.out.print(j);
            }

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

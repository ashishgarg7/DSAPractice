package Patterns;

public class NumberPyramid {

    public static void main(String [] args) {

        int n = 5;
        for(int i = 1; i <= 5; i++) {

            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }

            for(int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

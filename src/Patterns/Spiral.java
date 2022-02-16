package Patterns;

import java.util.Scanner;

public class Spiral {

    public static void main(String [] args) {

        /*
        * 1  2  3  4  5
        * 16 17 18 19 6
        * 15 24 25 20 7
        * 14 23 22 21 8
        * 13 12 11 10 9
        * */
        // Print above pattern

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        spiralPattern(n);
    }

    public static void spiralPattern(int n) {

        int count = 1;
        int numbersInEachLine = (n - 1);
        while(true) {

            if(numbersInEachLine == 2) {

            }

            if(numbersInEachLine <= 0) {
                break;
            }
        }
    }
}

package Patterns;

public class HollowRectangle {

    public static void main(String [] args) {

        /*
        * ^ ^ ^ ^ ^
        * ^       ^
        * ^       ^
        * ^ ^ ^ ^ ^
        * */

        int n = 5;
        int m = 4;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                //First Solution
                /*if((i == 0) || (i == (m - 1))) {

                    System.out.print("^ ");
                } else if((j == 0) || j == (n - 1)) {
                    System.out.print("^ ");
                } else {
                    System.out.print("  ");
                }*/

                //Second
                /*if((i == 0) || (i == (m - 1)) || (j == 0) || (j == (n - 1))) {
                    System.out.print("^ ");
                } else {
                    System.out.print("  ");
                }*/
            }
            System.out.println();
        }
    }
}

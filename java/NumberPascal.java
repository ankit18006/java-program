
import java.util.Scanner;

class NumberPascal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();

        int t = 1;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j)
                    t = 1;
                else
                    t = t * (i - j + 1) / j;

                System.out.print(t + " ");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) { 
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j)
                    t = 1;
                else
                    t = t * (i - j + 1) / j;

                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}

/*

C:\Users\User1\Desktop\java programs>java NumberPascal
Enter value of n: 7
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 5 10 10 5 1
 1 6 15 20 15 6 1
  1 5 10 10 5 1
   1 4 6 4 1
    1 3 3 1
     1 2 1
      1 1
       1


*/



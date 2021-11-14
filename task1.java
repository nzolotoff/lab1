import java.util.Scanner;

public class task1 {

    public static void main (String [] args) {

        System.out.println("Hello,user!");
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the first number");
        int a = s.nextInt();

        Scanner f = new Scanner(System.in);
        System.out.println("Please, enter the second number");
        int b = f.nextInt();


        Scanner h = new Scanner(System.in);
        System.out.println("Please, enter the third number");
        int c = h.nextInt();

        Scanner j = new Scanner(System.in);
        System.out.println("Please, enter the fourth number");
        int d = j.nextInt();

        int min = Math.min(Math.min(a,b),Math.min(c,d));
        System.out.println("The min number is "+ min);

    }
}


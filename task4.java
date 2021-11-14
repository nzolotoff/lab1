import java.util.Scanner;

public class task4 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter month number");
        int time = s.nextInt();
        String timeString;
        switch (time) {
            case 12,1,2: timeString = "Winter";
                break;
            case 3,4,5: timeString = "Spring";
                break;
            case 6,7,8: timeString = "Summer";
                break;
            case 9,10,11: timeString = "Autumn";
                break;
            default: timeString = "Error";
                break;
        }
        System.out.println(timeString);
    }
}

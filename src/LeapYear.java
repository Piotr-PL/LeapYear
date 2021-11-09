import java.util.Scanner;
public class LeapYear {
    public  static void  main(String[] args)
    {
        int year;
        System.out.println("Enter any year");
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();
        scan.close();
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0)
        {
            System.out.println(year + " it's the Leap Year");
        }
        else
            System.out.println(year + " is not the Leap Year");
    }
}
import java.util.Scanner;
public class Main {
    public static String username;
    public static String password;


    public static void main(String[] args) {
        System.out.println("Welcome to the Josiah's Online Currency Converter!");
        System.out.println("lets first start by making a user name and password");
        System.out.println("please enter your username now");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();
        System.out.println("please enter your password now");
        password = scanner.nextLine();
        System.out.println("Now lets have you Login in now, please enter your username");
        String userName = scanner.nextLine();
        while (userName != password) {
            System.out.println("that password is incorrect, please try again");
            userName = scanner.nextLine();
        }
        System.out.println("now enter your password");
        String passWord = scanner.nextLine();
        while (userName != password) {
            System.out.println("that password is incorrect, please try again");
            userName = scanner.nextLine();
        }
        System.out.println("trying to login....");
        System.out.println("Succesful Login");
        System.out.println("~~~~~~ Welcome to Currency Converter ~~~~~~~");
        System.out.println("please select from one of the options");
        boolean exitRequested = false;
        while (!exitRequested) {
            int choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:

                    break;
                case 2:
                    System.out.println("Please enter deposit amount:");

                    break;
                case 3:
                    System.out.println("Please enter withdrawal amount:");

                    break;
                case 4:
                    System.out.println("Please enter the phone number of the account you want to transfer to: ");

                    break;

                case 5:
                    exitRequested = true;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }


        }
        System.out.println("Thank you for using the Currency Converter");
        System.out.println("Goodbye");
    }
}
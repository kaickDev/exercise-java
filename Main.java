import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num = input.nextInt();

        if (num < 0){
           System.out.println("your number is negative");
        }
        else if (num > 0){

            System.out.println("your number is positive");
            if (num == 0){

                System.out.println("your number is zero");

            }
        }
    }
}

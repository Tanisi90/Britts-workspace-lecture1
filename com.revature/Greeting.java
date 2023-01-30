import java.util.Scanner;

public class Greeting{

	public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number..");
        int num = input.nextInt();
        System.out.println("You enter the number " + num);

        if(num >= 0){
            System.out.println("You entered a positive number");
        }else{
            System.out.println("You entered a negative number");
        }

       input.nextLine();
        System.out.println("Enter a color");
        String colors = input.nextLine();

        System.out.println("You entered the color " + colors);

            // System.out.println("hello");

            // System.out.print("Hope you learned alot!");

		// System.out.println("Hello");


	}


}
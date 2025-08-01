package JavaProgramming;
import java.util.Scanner;

public class MySecond {
    //  Scanner scanner1 = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =  scanner.nextInt();
        if(num>0)
        {
            System.out.println("Positive numner");
        }
        else {
            System.out.println("Negative Number");
        }
        scanner.close();
        
    }

    
}


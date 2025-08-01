package JavaProgramming;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        boolean isPrime =true;
        // if number is less than or equal to 1
        if(num<=1)
        {
              isPrime=false;
        }
        // more than 1
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num +" is a prime number");
        }
        else 
        {
             System.out.println(num +"is not a prime number");
        }

    }
    
}

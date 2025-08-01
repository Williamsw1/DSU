package JavaProgramming;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num =sc.nextInt();
        int sum =0;
        //num =123
        while(num!=0){
            sum+=num%10;//3
            num/=10;
        }
        System.out.println("Sum of digits: "+sum);

    }
    
}

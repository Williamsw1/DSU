package JavaProgramming;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num =sc.nextInt();
        int count =0;
        //num =123
        while(num!=0){
        
            num/=10;
            count++;
        }
        System.out.println("Sum of digits: "+count);

    
    }
}

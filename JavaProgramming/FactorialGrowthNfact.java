package JavaProgramming;

public class FactorialGrowthNfact {
    static int count=0;

    static void generate(int n){
        if(n==0){
            count++;
            return;
        }
        for(int i=0;i<n;i++)
        {
            generate(n-1);//recursive call
        }

    }

    public static void main(String[] args) {
        int n=4;
        generate(n);
        System.out.println("Total calls (approx n!) for n="+n+"is"+count);;
        
    }
    
}

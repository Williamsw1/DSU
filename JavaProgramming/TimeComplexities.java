package JavaProgramming;
//O(log n)-time complexity - halves input each time
//O(n log n)-time complexity - halves input each time

public class TimeComplexities {
    public static void main(String[] args) {

        int n=4;
        for(int i=1;i<=n;i++){
            int x=n;
            while(x>1)
            {
                x=x/2;
                System.out.println("Element"+i+"divided step");
            }

        }
    //     int n=16;
    //     int count=0;
    //     while(n>1){
    //         n=n/2;
    //         count++;
    //     }
    //     System.out.println("Divided"+count+"times");
    
    }
    
}
//if there are available of only 2 variable we can say that 
//O(1) for space complexity-there is no array available

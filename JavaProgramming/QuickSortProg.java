package JavaProgramming;


class QuickSortProg
{

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

    private static void quickSort(int[] arr,int low,int high){
        if(low<high){
            // partition the array and get the pivot value
            int pi =partition(arr,low,high);
            
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);


        }
    }
    private static int partition(int[] arr,int low,int high){
        int pivot =arr[high];
        int i =low-1;
        for(int j=low;j<high;j++){
            if(arr[j] <=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

          
        }
          //swap pivot with element at i+1 
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;

            return i+1;
    }



    public static void main(String[] args) {
        int[] arr = { 10, 7, 89, 5 };
        int n = arr.length;

        System.out.println("Original Array");
        //before sorting
        printArray(arr);

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted Array");
        //after sorting
        printArray(arr);
    }

}
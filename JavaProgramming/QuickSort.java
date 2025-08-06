package JavaProgramming;

class QuickSort
{

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 89, 5 };
        int n = arr.length;

        System.out.println("Original Array");
        printArray(arr);

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted Array");
        printArray(arr);
    }

}
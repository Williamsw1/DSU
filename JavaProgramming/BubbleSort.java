package JavaProgramming;

public class BubbleSort {
      public static void main(String[] args) {
        int[] arr = {40, 20, 10, 30, 50};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int n : arr)
            System.out.print(n + " ");
    }
    
}

// public class ArrayDeque<E> extends AbstractCollection<E>
//     implements Deque<E>, Cloneable, Serializable


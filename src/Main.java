public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 11, 1, 8, 6, 17, 5, 2567, 44};
        int n = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("после сортировки:");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

    }
}

class HeapSort {
    static int count = 0;

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            count++;
            System.out.println(count);
            heapify(arr, n, largest);
        }
    }
}



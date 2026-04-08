package DSA;

public class sort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 67, 2, 3, 11, 81, 4 };
        // QUICK SORT ALOGITHM

        // recursion is to create a function that will get called.

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

// bubble sorting method
// for (int i = 0; i < size; i++) {
// for (int j = 0; j < size - 1; j++) {
// if (nums[j] > nums[j + 1]) {
// temp = nums[j];
// nums[j] = nums[j + 1];
// nums[j + 1] = temp;
// }
// }
// }

// int nums[] = { 6, 5, 2, 8, 9, 4 };
// int size = nums.length;
// int temp = 0;
// int minIndex = -1;
// System.out.println("Before sorting");
// for (int num : nums) {
// System.out.print(num + " ");
// }

// // selection sorting method

// for (int i = 0; i < size - 1; i++) {
// minIndex = i;
// for (int j = i + 1; j < size; j++) {
// if (nums[minIndex] > nums[j])
// minIndex = j;
// }

// temp = nums[minIndex];
// nums[minIndex] = nums[i];
// nums[i] = temp;

// System.out.println();
// for (int num : nums) {
// System.out.print(num + " ");
// }

// }

// System.out.println();
// System.out.println("After sorting");
// for (int num : nums) {
// System.out.print(num + " ");
// }

// insertion sort method

// for (int i = 1; i < arr.length; i++) {
// int key = arr[i];
// int j = i - 1;

// while (j >= 0 && arr[j] > key) {
// arr[j + 1] = arr[j];
// j--;
// }
// arr[j + 1] = key;
// }

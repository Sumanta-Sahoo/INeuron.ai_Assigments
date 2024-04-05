
// 1.WAP to find the duplicates present in an array.
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 3};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates in the array: " + duplicates);
    }
}

// 2.WAP to sort an array using Quick Sort Algorithm.
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

// 3.WAP to sort an array using Bubble Sort Algorithm.
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// 4.WAP to sort an array using Merge Sort Algorithm.
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}

// 5.WAP to sort an array using Selection Sort Algorithm.
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        selectionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}

// 6.WAP to check whether an array is a subset of another array.
import java.util.HashSet;

public class SubsetChecker {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 6};

        if (isSubset(array1, array2)) {
            System.out.println("Array2 is a subset of Array1");
        } else {
            System.out.println("Array2 is not a subset of Array1");
        }
    }

    public static boolean isSubset(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        for (int num : array2) {
            if (!set.contains(num)) {
                return false;
            }
        }
        return true;
    }
}

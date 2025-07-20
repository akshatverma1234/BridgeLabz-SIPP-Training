package Day4_5_LinearAndBinarySearch;

public class FirstLastOccurrence {
    public static int firstOccurrence(int[] arr, int target) {
        int res = -1, left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return res;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int res = -1, left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,72,17,7,8};
        System.out.println("First: " + firstOccurrence(arr, 4)); 
        System.out.println("Last: " + lastOccurrence(arr, 4));   
    }
}

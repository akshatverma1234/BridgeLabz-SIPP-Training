package Day4_5_LinearAndBinarySearch;

public class PeakElement {
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {13,5,7,8,2,1};
        System.out.println(findPeak(arr)); 
    }
}

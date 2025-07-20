package Day4_5_LinearAndBinarySearch;

public class RotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {3,57,8,2,3,7};
        System.out.println(findRotationPoint(arr)); 
    }
}


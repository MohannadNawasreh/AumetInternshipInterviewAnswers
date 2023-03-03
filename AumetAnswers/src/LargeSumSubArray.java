import java.util.Scanner;

public class LargeSumSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }

        int[] result = maxSubArraySum(arr1);
        System.out.print("the contiguous subarray with the largest sum is ");
        for (int i = result[0]; i <= result[1]; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("with sum " + result[2]);
    }

    static int[] maxSubArraySum(int[] arr) {
        int size = arr.length;
        int max_so_far = 0;
        int max_ending_here = 0;
        int start = 0, end = 0, s = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here += arr[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        int[] result = {start, end, max_so_far};
        return result;
    }
}


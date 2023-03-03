import java.util.Arrays;
import java.util.Scanner;

public class ArrayChecker {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the size of the first array: ");
                int size = scanner.nextInt();
                System.out.print("Enter the size of the Second array: ");
                int size2 = scanner.nextInt();

                int[] arr1 = new int[size];
                int[] arr2 = new int[size2];

                System.out.println("Enter the elements of the first array:");
                for (int i = 0; i < size; i++) {
                    arr1[i] = scanner.nextInt();
                }

                System.out.println("Enter the elements of the second array:");
                for (int i = 0; i < size2; i++) {
                    arr2[i] = scanner.nextInt();
                }
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1,arr2)) {
                    System.out.println("The two arrays contain the same elements.");
                } else {
                    System.out.println("The two arrays do not contain the same elements.");
                }
            }
        }
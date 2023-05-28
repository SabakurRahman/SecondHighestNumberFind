import java.util.*;

public class SecondHighest {

    public static int secondHighestNumberInArray(int arr[]) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];

            }
        }

        return secondHighest;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements: ");
        int n = input.nextInt();
        if (n < 2) {
            System.out.println("Please Enter At Least 2 Number");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Unique Number");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // int arr[] = { 7, 4, 3 };
        int secondMaxNumberInArray = secondHighestNumberInArray(arr);

        System.out.println("The Second Highest Number is: " + secondMaxNumberInArray);

    }

}
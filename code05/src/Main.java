import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] students = new String[3];
        int[] arr1 = new int[5];

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);

        students[0] = scanner.nextLine();
        students[1] = scanner.nextLine();
        students[2] = scanner.nextLine();


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static void main2(String[] args) {
        int[][] arr = new int[5][3];

        arr[0][0] = 1;
        arr[0][1] = 2;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = i * 10 + j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] row = arr[0];
        for (int i = 0; i < row.length; i++) {
            System.out.println(i + " " + row[i]);
        }
    }

    public static void main(String[] args) {
        int[][][] arr = new int[5][2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = i * 100 + j * 10 + k;
                }
            }
        }

        int[] arr2 = {1, 4, 7, 2, 17, 9, 13, -1, 8, 0};
        Arrays.sort(arr2);
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2, 9));

    }
}
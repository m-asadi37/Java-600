import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        int count = 1;
        for (int i = left; i <= right; i++) {
            arr[bottom][i] = count++;
        }
        bottom -= 1;

        for (int i = bottom; i >= top; i--) {
            arr[i][right] = count++;
        }
        right -= 1;



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ",  arr[i][j]);
            }
            System.out.println();
        }

    }
}

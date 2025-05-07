public class Main {
    public static void main (String[] args) {
        int[][] arr = {
        {2, 1, 0},
        {1, 3, 2},
        {0, 0, 0},
        {4, 5, 6}
        };

        System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
        System.out.println(ArrayResizer.isNonZeroRow(arr, 3));

        int[][] smaller = ArrayResizer.resize(arr);
        for (int[] row : smaller) {
            for (int i : row) {
                System.out.println(i + " ");
            }
        }
    }
}

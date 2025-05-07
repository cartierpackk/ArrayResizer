public class ArrayResizer
{
    /** Returns true if and only if every value in row r of array2D is non-zero.
    * Precondition: r is a valid row index in array2D.
    * Postcondition: array2D is unchanged.
    */
    public static boolean isNonZeroRow(int[][] array2D, int r)
    {
        for (int i : array2D[r]) {
            if (i == 0) return false;
        }
        return true;
    }
    /** Returns the number of rows in array2D that contain all non-zero values.
    * Postcondition: array2D is unchanged.
    */
    public static int numNonZeroRows(int[][] array2D)
    {
        int r = 0;
        int count = 0;
        for (int[] row : array2D) {
            if (isNonZeroRow(array2D, r)) count++;
            r++;
        }
        return count;
    }
    /** Returns a new, possibly smaller, two-dimensional array that contains only rows
    * from array2D with no zeros, as described in part (b).
    * Precondition: array2D contains at least one column and at least one row with no zeros.
    * Postcondition: array2D is unchanged.
    */
    public static int[][] resize(int[][] array2D)
    {
        int r = 0;
        int[][] list = new int[numNonZeroRows(array2D)][array2D[0].length];
        for (int row = 0; row < array2D.length; row++) {
            if (isNonZeroRow(array2D, row)) {
                for (int col = 0; col < array2D[0].length; col++) {
                    list[r][col] = array2D[row][col];
                }
                r++;
            }
        }
        return list;
    }
}

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int x = 1;
        int j, k, l, m;
        for (int i = 0; i < n; i++) {
            for (j = i; j < n - i; j++) {
                arr[i][j] = x;
                x++;
            }
            for (k = i + 1; k < n - i; k++) {
                arr[k][n - i - 1] = x;
                x++;
            }
            for (l = n - i - 2; l >= i; l--) {
                arr[n - i - 1][l] = x;
                x++;
            }
            for (m = n - i - 2; m > i; m--) {
                arr[m][i] = x;
                x++;
            }
        }
        return arr;
    }
}

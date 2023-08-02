class Solution {
    public int diagonalSum(int[][] arr) {
        int a=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            a+=arr[i][i];
            a+=arr[i][n-1-i];
        }
        if(n%2!=0){
            a-=arr[n/2][n/2];
        }
        return a;
    }
}
class Solution {
    public int kthSmallest(int[][] arr, int k) {
        int n=arr.length;
        int arr2[]=new int [n*n];
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[x]=arr[i][j];
                x++;
            }
        }
        Arrays.sort(arr2);
        return arr2[k-1];

    }
}

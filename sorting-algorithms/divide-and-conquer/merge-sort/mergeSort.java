class Main {
    public static void main(String[] args) {
        int[] arr = {8,2,3,5,4,9,1,6,7};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        }
    
    private static void mergeSort(int[] arr){
        // base case
        if (arr.length <= 1) return;
        
        int mid = arr.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];
        
        int i = 0; 
        int j = 0;
        
        for (; i < arr.length; i++) {
            if (i < mid){
                leftArr[i] = arr[i];
            } else {
                rightArr[j] = arr[i];
                j++;
            }
        }
        
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
        
    }
    
    private static int[] merge(int[] leftArr, int[] rightArr, int[] arr){
        
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;
        
        while (l < leftSize && r < rightSize){
            if (leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        
        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        
        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
        
        return arr;
        
    }
    
}

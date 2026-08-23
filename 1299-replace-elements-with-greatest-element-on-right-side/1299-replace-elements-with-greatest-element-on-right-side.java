class Solution {
    public int[] replaceElements(int[] arr) {

// forward approach
        // for(int i =0;i<arr.length-1;i++){
        //     int max = -1;

        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[j] > max){
        //             max = arr[j];
        //         }
        //     }
        //     arr[i] = max;
        // }
        // arr[arr.length -1 ] = -1;
        // return arr;

//backward approach
        int n = arr.length;
        int max = -1;
        for(int i=n-1;i>=0;i--){
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
            else{
                arr[i] = max;
            }
        }
        return arr;
    }
}
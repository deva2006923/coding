class Solution {
    public int[] replaceElements(int[] arr) {
        int[] dparr=new int[arr.length];
        dparr[arr.length-1]=-1;
       // dparr[arr.length-2]=arr[arr.length-1];
        for(int i=arr.length-2;i>-1;i--){
            dparr[i]=Math.max(dparr[i+1],arr[i+1]);
        }
        
        return dparr;
        
    }
}

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int s=0;
        int e=0;
        int sum=0;
        while(e<arr.length){
            sum+=arr[e];
            
            while(sum>target&&s<=e){
                sum-=arr[s];
                s++;
            }
            if(sum==target){
                ans.add(s+1);
                ans.add(e+1);
                return ans;
            }
            
            e++;
            
                
            
        }
        ans.add(-1);
        
        return ans;
        
    }
}

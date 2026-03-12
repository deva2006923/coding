class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] helper=new int[26];
        for(int i=0;i<s.length();i++){
            helper[s.charAt(i)-'a']+=1;
            helper[t.charAt(i)-'a']-=1;


        }
        for(int ele:helper){
            if(ele!=0){
                return false;
            }
        }
        return true;

    }
}

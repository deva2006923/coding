class Solution {
        public int lengthOfLastWord(String s){
            int i=s.length()-1;
            int c=0;
            while(i>-1){
                if(s.charAt(i)==' '){
                    i--;
                }
                else{
                    break;
                }
            }
            while(i>-1){
                if(s.charAt(i)==' '){
                    break;
                }
                c++;
                i--;
            }
            return c;

        }
}

class Solution {
    public String digitSum(String s, int k) {

        if(s.length()<=k) return s;

        StringBuilder stb = new StringBuilder();
         
        int curr =0;
        for(int i=0;i<s.length();i++){
            curr += s.charAt(i)-'0';
            if((i+1)%k==0 ||  i==s.length()-1){
                stb.append(curr);
                curr =0;
            }
        }

        return digitSum(stb.toString(),k);

        
    }
}
class Solution {
    public boolean checkString(String s) {
        boolean bool = false;

        for(char c:s.toCharArray()){
            if(c=='b') bool = true;
            if(bool && c=='a') return false;
        }

        return true;
    }
}
class Solution {
    public String[] createGrid(int m, int n) {
        String[] str = new String[m];
        StringBuilder st = new StringBuilder();
        StringBuilder st2 = new StringBuilder();
        for(int i=0;i<n;i++){
            st.append(".");
            if(i==n-1) st2.append(".");
            else st2.append("#");
        }
        str[0] = st.toString();
        for(int i=1;i<m;i++){
            str[i] = st2.toString();
        }
        return str;
    }
}
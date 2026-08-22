class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long prod = 1;
        int x = n;
        while(n>0){
            int a = n%10;
            n /= 10;
            sum +=a;
            prod *=a;
        }
        if(x%(sum+prod)==0) return true;
        else return false;
    }
}
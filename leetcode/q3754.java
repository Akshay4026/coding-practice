class q3754 {
    public long sumAndMultiply(int n) {
        String str = Integer.toString(n);
        StringBuilder stb = new StringBuilder();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                stb.append(str.charAt(i));
            }
        }
        if(stb.length()==0) return 0;
        long a = Integer.parseInt(stb.toString());
        long b = Integer.parseInt(stb.toString());
        long sum = 0;
        while(a>0){
            sum +=a%10;
            a=a/10;
        }
        return b*sum;
    }
}
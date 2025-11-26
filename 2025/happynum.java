public class happynum {
    public static void main(String[] args) {
        happynum hpy = new happynum();
        System.out.println(hpy.isHappy(7));
    }
    public boolean isHappy(int n) {
        StringBuilder str = new StringBuilder(Integer.toString(n));
        boolean swt = false;
        if(n==1){
            return true;
        }
        if(n==2 || n==3){
            return false;
        }
        int re = n;
        while(str.length()>1 || re>3){
            swt = true;
            int a =0;
            for(int i =0;i<str.length();i++){
                int x = str.charAt(i) -'0';
                a +=x*x;
            }
            str = new StringBuilder(Integer.toString(a));
            re = Integer.parseInt(str.toString());
            if(re==n || re==4) {
                return false;
            }
        }
        System.out.println(str);
        return str.toString().equals("1");
    }
}

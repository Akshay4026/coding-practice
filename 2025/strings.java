public class strings {
    
    public static void main(String[] args){
        Main obj = new Main();
        // int[] ans = obj.minMAx(new int[]{2,4,5,1,4,6,7});
        // System.out.println(Arrays.toString(ans));
        // System.out.println(obj.rev("Akshay"));
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                st1.append(c);
            }
        }
        String str = st1.toString().toLowerCase();
        for(int i =str.length()-1;i>=0;i--){
            st2.append(str.charAt(i));
        } 
        System.out.println(str);
        System.out.println(st2);
        return str.equals(st2.toString());
    }
    // public String rev(String str){
    //     StringBuilder stb = new StringBuilder();
    //     for(int i =str.length()-1;i>=0;i--){
    //         stb.append(str.charAt(i));
    //     }
    //     return stb.toString();
    // }
    // public int[] minMAx(int arr[]){
    //     int max =Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;
    //     for(int i :arr){
    //         if(i>max){
    //             max=i;
    //         }
    //         if(i<min){
    //             min =i;
    //         }
    //     }
    //     return new int[]{min,max};
    // }
}

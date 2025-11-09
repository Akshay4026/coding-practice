import java.util.Arrays;

public class leet14 {
    public static void main(String[] args) {
        String res =str(new String[] {"flower","flow","flight"});
        System.out.println(res);
    }
    public static String str(String[] strs){
        Arrays.sort(strs);
        String frstStr = strs[0];
        String lstStr = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();
    
        for(int i =0;i<Math.min(frstStr.length(),lstStr.length());i++){
            if(frstStr.charAt(i)==lstStr.charAt(i)){
                sb.append(frstStr.charAt(i));
            }
            else{
                break;
            }
        }
        
        return sb.toString();
    }
}

import java.util.HashMap;

public class evenOddPal {
    public static void main(String[] args) {
        String s= "yzyyys";
        System.out.println(maxDifference(s));
    }
  
    public static int maxDifference(String s) {
         int[] freq = new int[26];
        int n = s.length();
        int maxOdd =0;
        int minEven = n+1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int d = c-'a';
            freq[d]++;
            if(freq[d]%2==0){
                minEven = Math.min(minEven , freq[d]);
            }
            else maxOdd = Math.max(maxOdd,freq[d]);
        }
        System.out.println(minEven);
        System.out.println(maxOdd);
        return maxOdd-minEven;
        // HashMap <Character , Integer> hsh= new HashMap<>();
        // int n = s.length();
        // for(int i =0;i<n;i++){
        //     char c = s.charAt(i);
        //     if(hsh.containsKey(c)){
        //         hsh.put(c,hsh.get(c)+1);
        //     }
        //     else hsh.put(c,1);
        // }
        // System.out.println(hsh.keySet());
        // System.out.println(hsh.get('a'));
        // System.out.println(hsh.get('b'));
        // System.out.println(hsh.get('c'));

        // int minEven = n+1;
        // int maxOdd =0;
        // int even = n+1 ;
        // int odd=0;
        // for(int i =0;i<n;i++){
        //     char c =  s.charAt(i);
        //     if(hsh.get(c)%2==0){
        //         even = hsh.get(c);
        //     }
        //     else{
        //         odd = hsh.get(c);
        //     }
        //     minEven = Math.min(minEven , even);
        //     maxOdd = Math.max(maxOdd,odd);
        // }
        // System.out.println(minEven);
        // System.out.println(maxOdd);

        // return maxOdd-minEven;
    }
}


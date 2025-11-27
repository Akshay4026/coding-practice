class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        return new String(c).equals(new String(d));
    //     Set<Character> set = new HashSet<>();
    //     for(char i:s.toCharArray()) set.add(i);

    //     for(int i =0;i<s.length();i++){
    //         if(!set.contains(t.charAt(i))) return false;
    //     }
    //     return true;
    }
}
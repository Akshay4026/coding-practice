class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // int[] arr = new int[366];
        int []  arr = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        int frstAlice = arr[Integer.parseInt(arriveAlice.substring(0,2))-1]+Integer.parseInt(arriveAlice.substring(3,5));
        int lastAlice = arr[Integer.parseInt(leaveAlice.substring(0,2))-1]+Integer.parseInt(leaveAlice.substring(3,5));
        int frstBob = arr[Integer.parseInt(arriveBob.substring(0,2))-1]+Integer.parseInt(arriveBob.substring(3,5));
        int lastBob = arr[Integer.parseInt(leaveBob.substring(0,2))-1]+Integer.parseInt(leaveBob.substring(3,5));

        int ans =Math.min(lastAlice , lastBob) - Math.max(frstAlice ,frstBob) ;
        return Math.max(0, ans+1);
        
    } 
}
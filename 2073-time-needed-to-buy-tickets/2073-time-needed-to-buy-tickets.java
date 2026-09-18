class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0;
        int n=tickets.length;
        int sec=0;
        while(tickets[k]>0){
            i=i%n;
            if(tickets[i]!=0){
                tickets[i]--;
            sec++;
            }
            
            i++;
        }
        return sec;
    }
}
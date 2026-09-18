class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int key=tickets[k];
        int n=tickets.length;
        int sec=0;
        if(key>1){
        for(int i=0;i<n;i++){
            sec+=Math.min(tickets[i],key-1);

        }

    }
     for(int i=0;i<=k;i++){
            if(tickets[i]>=key)sec++;

        }
        return sec;
    }
}
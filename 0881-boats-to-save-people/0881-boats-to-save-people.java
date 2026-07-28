class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);

        int i=0;
        n--;
        int res=0;
        while(i<=n){
            if(people[i]<=limit-people[n]){
                i++;
            }
            res++;
            n--;
        }
        return res;
    }
}
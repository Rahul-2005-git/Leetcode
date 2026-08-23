class Solution {
    public boolean sumGame(String num) {
        
        int n=num.length();
        int []nums =new int[n];
        int j=0;
        for(char ch:num.toCharArray()){
            nums[j]=ch-'0';
        j++;
        }

        int turn=1;
        int lq=0;
        int rq=0;
        int rs=0,ls=0;

        for(int i=0;i<n/2;i++){
            if(nums[i]>10){
            lq++;
            nums[i]=0;
            }

            ls+=nums[i];
        }
        for(int i=n/2;i<n;i++){
            if(nums[i]>10){ 
                rq++;
                nums[i]=0;
                }
                rs+=nums[i];

        }

            // if(lq==rq && rs==ls)return false;

        int q=rq-lq;
        int s=rs-ls;
        // if(q>0 && s>0)return true;
        // if(q<0 && s<0 )return true;
        // if(s<0)s=-s;
        // if(q<0)q=-q;

        if(s + 9 * (q / 2) == 0){
            if(q%2==0)return false;
        }






        return true;
    }
}
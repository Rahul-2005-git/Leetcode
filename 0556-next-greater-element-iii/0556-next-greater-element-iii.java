class Solution {
    public int nextGreaterElement(int n) {
        long m=n;
        int []count=new int[10];
        int currR=-1;
        int preR=-1;

        while(m>0){

            currR=(int)m%10;
            m/=10;
            count[currR]++;


            if(currR<preR){
                int num=currR+1;

                while(count[num]==0)num++;

                count[num]--;

                m=m*10+num;

                for(int i=0;i<10;i++){
                    while(count[i]>0){
                        count[i]--;
                        m=m*10+i;
                    }
                }

                return m>Integer.MAX_VALUE?-1:(int)m;

            }
            preR=currR;

        }
            return -1;

    }
}
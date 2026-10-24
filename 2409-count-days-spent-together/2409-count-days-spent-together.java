class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int [] month={31,28,31,30,31,30,31,31,30,31,30,31};

        String [] aa=arriveAlice.split("-");
        String [] la=leaveAlice.split("-");
        String [] ab=arriveBob.split("-");
        String [] lb=leaveBob.split("-");

        int aam=Integer.parseInt(aa[0]);
        int aad=Integer.parseInt(aa[1]);
        int lam=Integer.parseInt(la[0]);
        int lad=Integer.parseInt(la[1]);
        int abm=Integer.parseInt(ab[0]);
        int abd=Integer.parseInt(ab[1]);
        int lbm=Integer.parseInt(lb[0]);
        int lbd=Integer.parseInt(lb[1]);

        int [] prefix=new int[13];
        prefix[0]=0;
        for(int i=1;i<=12;i++){
            prefix[i]=prefix[i-1]+month[i-1];
        }

        int res=0;
        int lm,hm;
        int ld,hd;
        if(lam<lbm){
            hm=lam;
            hd=lad;
        }
        else if(lam>lbm){
            hm=lbm;
            hd=lbd;
        }else{
            hm=lbm;
            hd=Math.min(lad,lbd);
        }

        if(aam>abm){
            lm=aam;
            ld=aad;
        }else if(aam<abm){
            lm=abm;
            ld=abd;
        }
        else{
            lm=abm;
            ld=Math.max(aad,abd);
        }

        

            res=prefix[hm-1]-prefix[lm-1];
            // System.out.println(res);
            res+=hd-ld+1;
        
        // System.out.println(lm+"-"+ld+"   "+hm+"-"+hd);
        
        return res>0?res:0;
    }
}
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(deck.length<=1)return false;
        for(int d:deck){
            map.put(d,map.getOrDefault(d,0)+1);
        }
            int temp=map.get(deck[0]);
            if(temp<=1)return false;
            int gcd=temp;
            

        for(int value:map.values()){
            gcd=findGCD(gcd,value);
            if(gcd==1)return false;
        }
        return true;
    }

     public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
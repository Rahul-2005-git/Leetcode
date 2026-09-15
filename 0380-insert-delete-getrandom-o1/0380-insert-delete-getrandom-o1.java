class RandomizedSet {

    HashSet<Integer> set;
    Random ran;
    public RandomizedSet() {
        set=new HashSet<>();
        ran=new Random();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
        
    }
    
    public int getRandom() {
            int index = ran.nextInt(set.size());
        // return list.get(index);
        int ind=0;
        int ans=0;
        for(int i:set){
           ans=i;
           ind++;
           if(ind==index)
           break;
        }
        return ans;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
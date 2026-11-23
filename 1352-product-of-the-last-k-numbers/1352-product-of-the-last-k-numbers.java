class ProductOfNumbers {
    List<Integer> arr;

    public ProductOfNumbers() {
         arr=new ArrayList();

    }
    
    public void add(int num) {
        arr.add(num);
        
    }
    
    public int getProduct(int k) {

        int size=arr.size();
        int res=1;
        for(int i=size-1;i>=0 && i>size-k-1;i--){
            res*=arr.get(i);
        }
        return res;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
class Solution {
    public int reverseDegree(String s) {
        int product=0;
        for(int i=0;i<s.length();i++){

            // int num=26-s.charAt(i)-'a';
            
            // System.out.println(num);
            product+=(26-(s.charAt(i)-'a'))*(i+1);

        }
        return product;
    }
}
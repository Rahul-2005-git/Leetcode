class Solution {
    public int reverseDegree(String s) {
        int product=0;
        for(int i=0;i<s.length();i++){

            int num=s.charAt(i)-'a';
            num=26-num;
            // System.out.println(num);
            product+=num*(i+1);

        }
        return product;
    }
}
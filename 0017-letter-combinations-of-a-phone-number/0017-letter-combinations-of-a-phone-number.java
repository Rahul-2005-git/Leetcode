class Solution {
    public List<String> letterCombinations(String digits) {
        

         String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        // for(char ch:digits){
        //     if(ch=='7' && ch=='9'){
        //         len*=4;
        //     }
        //     else{
        //         len*=3;
        //     }
        // }

        List<String> res=new ArrayList<>();

        backtracking(digits, "", 0,res,map);

      

        return res;
    }

    private void backtracking(String digits , String str,int index,List<String> res, String[] map){

        if(index==digits.length()){
            res.add(str);
            return ;
        }

        String letters=map[digits.charAt(index)-'0'];

        for(char ch:letters.toCharArray()){
            backtracking(digits,str+ch, index+1, res,map);
        }

    }
}
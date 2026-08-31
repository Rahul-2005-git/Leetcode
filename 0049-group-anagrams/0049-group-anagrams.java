class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map=new HashMap<>();

        for(String str:strs){

            char[] temp=str.toCharArray();
          Arrays.sort(temp);
          String key = new String(temp);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
           
                List<String> arr= new ArrayList();
               arr= map.get(key);
               arr.add(str);
               map.put(key, arr);

          
        } 
        
        List<List<String>> res=new ArrayList();
        for(List<String> resp:map.values()){
            res.add(resp);
        }

        return res;

    }
}
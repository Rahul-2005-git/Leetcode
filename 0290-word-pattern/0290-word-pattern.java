class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] str=s.split(" ");
        if(pattern.length()!=str.length) return false;

        HashMap<Character,String> map=new HashMap<>();

        for(int i=0;i<str.length;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(str[i]))return false;

            }
            else if(map.containsValue(str[i])){
            return false;
            }
            else{
                map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
        
    }
}
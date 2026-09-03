class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        

        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
int i=0;
StringBuilder sb=new StringBuilder();



        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            
                sb.append(ch);
            // if(map1.size()>maxLetters || sb.length()>minSize){
            //     map1.put(s.charAt(i),map1.get(Character.valueOf(s.charAt(i)))-1);
                
            //     if(map1.get(s.charAt(i))==0) map1.remove(Character.valueOf(s.charAt(i)));
            //     sb.deleteCharAt(0); 
            //     i++;
            // }

               if (sb.length() > minSize) { 

                char left = s.charAt(i);

                map1.put(left, map1.get(left) - 1); 

                if (map1.get(left) == 0) {
                    map1.remove(left); 
                }

                sb.deleteCharAt(0);  
                i++; 
            } 

            if(sb.length() == minSize && map1.size() <= maxLetters){
                map2.put(sb.toString(),map2.getOrDefault(sb.toString(),0)+1);
            }

        }
        int res=0;
        for(int r:map2.values()){
            res=Math.max(r,res);
        }
        return res;
    }
}
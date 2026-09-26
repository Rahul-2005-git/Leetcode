class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String,String> map=new HashMap<>();

        for(List<String> list:knowledge){
            String key=list.get(0);
            String value=list.get(1);
            map.put(key,value);
        }
              StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();
        
        // 2. Scan the string character by character
        while (i < n) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                // Find the closing parenthesis
                int j = i + 1;
                while (j < n && s.charAt(j) != ')') {
                    j++;
                }
                
                // Extract the key inside the brackets
                String key = s.substring(i + 1, j);
                
                // Append the value if found, otherwise append "?"
                result.append(map.getOrDefault(key, "?"));
                
                // Move the pointer past the closing parenthesis ')'
                i = j + 1;
            } else {
                // Plain text outside brackets, append directly
                result.append(ch);
                i++;
            }
        }
        return result.toString(); 
    }
}
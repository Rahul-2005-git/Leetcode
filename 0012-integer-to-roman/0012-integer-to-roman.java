class Solution {
    public String intToRoman(int num) {
        
        StringBuilder res =new StringBuilder();

        HashMap<Integer, String> map=new HashMap<>();

        while(num>0){

            if(num/1000>0){
                for(int i=0;i<num/1000;i++){
                    res.append("M");
                }
                int temp=num/1000;
                num=num%(temp*1000);
            }
            else if(num/500>0){
                for(int i=0;i<num/500;i++){
                    res.append("D");
                }
                int temp=num/500;
                num=num%(temp*500);
            }

            else if(num/100>0){
                int temp=num/100;

                if(temp<4){
                for(int i=0;i<num/100;i++){
                    res.append("C");
                }
                }
                else{

                    if(res.length()>0 && res.charAt(res.length()-1)=='D'){
                        res.deleteCharAt(res.length() - 1);
                        res.append("CM");
                    }
                    else{
                        res.append("CD");
                    }
                }
                
                num=num%(temp*100);
            }
            else if(num/50>0){
                for(int i=0;i<num/50;i++){
                    res.append("L");
                }
                int temp=num/50;
                num=num%(temp*50);
            }
            else if(num/10>0){

                int temp=num/10;
                if(temp<4){
                for(int i=0;i<num/10;i++){
                    res.append("X");
                }
                }
                 else{

                    if(res.length()>0 && res.charAt(res.length()-1)=='L'){
                        res.deleteCharAt(res.length() - 1);
                        res.append("XC");
                    }
                    else{
                        res.append("XL");
                    }
                }
                
                num=num%(temp*10);
            } 
            else if(num/5>0){
                for(int i=0;i<num/5;i++){
                    res.append("V");
                }
                int temp=num/5;
                num=num%(temp*5);
            }
            else if(num/1>0){
                int temp=num;
                if(temp<4){

                for(int i=0;i<temp;i++){
                    res.append("I");
                }
                }
                else{

                    if(res.length()>0 && res.charAt(res.length()-1)=='V'){
                        res.deleteCharAt(res.length() - 1);
                        res.append("IX");
                    }
                    else{
                        res.append("IV");
                    }
                }
                
                num=num%(temp);
            }
        }
        return res.toString();
    }
}
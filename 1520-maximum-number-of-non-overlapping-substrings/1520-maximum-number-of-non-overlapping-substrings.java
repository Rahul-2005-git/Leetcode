class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n=s.length();
        int [] first =new int[26];
        int []last=new int[26];

        Arrays.fill(first,n);
        Arrays.fill(last,-1);

        for(int i=0;i<n;i++){
            int c=s.charAt(i)-'a';
            first[c]=Math.min(first[c],i);
            last[c]=i;
        }
List<int []> intervals=new ArrayList();
        for(int i=0;i<n;i++){

                int c=s.charAt(i)-'a';
            if(first[c]!=i){
                continue;
            }

            int start=first[c];
            int end=last[c];
            boolean valid=true;

            int j=start;
            while(j<=end){

                int current=s.charAt(j)-'a';
                if(first[current]<start){
                    valid=false;
                    break;
                }
                end=Math.max(end,last[current]);
                j++;
            }
            if(valid ){
                intervals.add(new int[]{start,end});
            }


        }

        intervals.sort((a,b)->a[1]-b[1]);

      List<String> answer = new ArrayList<>();
        int previousEnd=-1;
        for(int [] interval:intervals){
            int start=interval[0];
            int end=interval[1];
            if(interval[0]>previousEnd){
                answer.add(s.substring(start, end + 1));
            previousEnd=end;
            }
        }
        return answer;
    }
}
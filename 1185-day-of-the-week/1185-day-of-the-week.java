class Solution {
    public static boolean isLeap(int y){
        if(y%400==0 || (y%4==0 && y%100!=0))return true;
        return false;
    }
    public String dayOfTheWeek(int day, int month, int year) {

        String [] week={
            "Friday",
            "Saturday",
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday"
        };

        int [] months={
            31,28,31,30,31,30,31,31,30,31,30,31
        };
        int days =0;

        for(int i=1971;i<year;i++){
            days += isLeap(i) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            if (m == 2 && isLeap(year))
                days += 29;
            else
                days += months[m - 1];
        }
 days+=day-1;

        return week[days%7];

        
    }
}
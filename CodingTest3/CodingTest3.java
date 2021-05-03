package CodingTest3;

import java.util.Calendar;

public class CodingTest3{
    public static void main(String[] args){
        
        int ready = 14000605;
        solution(ready);

    }

    public static void solution(int ready){
        int startDate = 0;

        for(int i = 10; i > 0; i--){
            startDate += (int)Math.pow(2, i);
        }

        int readyDay = ready / 1200;
        int year = readyDay / startDate;
        int restDay = readyDay % startDate;
        int month = 0;

        for(int i = 10; i > 0; i--){
            month++;
            if(restDay < (int)Math.pow(2, i)){
                break;
            }
            restDay -= (int)Math.pow(2, i);
        }

        int day = restDay;
        int lastRest = ready % 1200;
        int hour = lastRest / 100 + 9;
        int[] startMin = {25, 40, 55, 70, 85, 100};
        int goTime = lastRest % 100 +1;
        int todayStartMin =0;

        for (int i =0; i < startMin.length; i++){
            if (startMin[i] > goTime){
                todayStartMin = i * 10;
                break;
            }
        }

        Calendar todayTime = Calendar.getInstance();
        int min = todayTime.get(Calendar.MINUTE) + todayStartMin;

        if (min > 60){
            min = min - 60;
            hour++;
        }

        System.out.println((year + 2020)+ "년" + month + "월" + day +"일" +hour + "시" + min + "분");


    }
}
package CodingTest3;

import java.util.Scanner;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CodingTest3t {

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        System.out.print("대기 인원? ");
        int ready = sc.nextInt();

        
        solution1(ready);

    }

    public static void solutionD(){



    }

    private static void solution1(int ready) throws Exception{

        String sdNewFormat;
        String sdNewFormat2;
        Date fDate2;
        try {
            String sd = "20200100010900";
            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMddddHHmm");
            SimpleDateFormat newFormat = new SimpleDateFormat("yyyy년MM월dddd일 a HH:mm");
            

            



            //Date fDate = sdFormat.parse(sd);
           //sdNewFormat = newFormat.format(fDate);
            // System.out.println("포맷 전 : " + sd);
            // System.out.println("포맷 후 : " + sdNewFormat);            
        
            int oneHourShip = 25;
            int temMinShip = 15;
           
            int count=0;

            String sd2=sd;
            
            

            for(int i = 0; i<ready; i=i+40){

                fDate2 = sdFormat.parse(sd2);
                sdNewFormat2 = newFormat.format(fDate2);


            // 정시일 때만 조건 활성화
            // 다음 정시 때 sdNewFormat2 값 변경
            System.out.println("시간 :: " + sdNewFormat2);
            System.out.println("대기 인원 " + ready);
            System.out.println();

            
            String addDay2 = AddDate(sd2, +10);
            sd2=addDay2;

            fDate2 = sdFormat.parse(sd2);
            sdNewFormat2 = newFormat.format(fDate2);
            
            ready = ready - oneHourShip;
            System.out.println("정시 이동 후 인원 " + ready);
            System.out.println("10분 후 : " + sdNewFormat2);
            
            ready = ready - temMinShip;
            System.out.println("10분 후 인원 " + ready);
            count++;
            System.out.println(count + "바꾸");

            
            }
            } catch (ParseException e){
                        e.printStackTrace();
            }            


    }

    private static String AddDate(String strDate, int minute) throws Exception{
    
        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMddddHHmm");
        Calendar cal = Calendar.getInstance();
        Date dt = dtFormat.parse(strDate);
    
    cal.setTime(dt);
    cal.add(Calendar.MINUTE, minute);
    
    return dtFormat.format(cal.getTime()); }
}


    


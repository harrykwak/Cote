import java.util.ArrayList;
public class CodingTest4t {
    public static void main(String[] args) {
        String[] page = {"척추동물", "어류", "척추동물", "무척추동물", "파충류", "척추동물", "어류", "파충류"};

        System.out.println(solution(page));        
    }

    public static String solution(String[] page){
        ArrayList<String> chair = new ArrayList<String>();
        int answer = 0;                     // 시간 계산 변수, 초 단위

        for (String i : page) {
            if (chair.contains(i)) {
                chair.remove(i); // chair 리스트에 page의 요소인 i가 미리 있을 경우 삭제  
                chair.add(i); // 이미 있는 것을 삭제 한 후 다시 넣기(무릎 앉기 표현)
                answer += 1; // 같은 동물이 앉았기에 +1초
                System.out.print(chair + "\n");
            }
            else {
                if (chair.size() >= 3) {
                    System.out.println(chair.get(0));
                    chair.remove(0);
                }
                chair.add(i);
                answer += 60;
                System.out.print(chair + "\n");
            }
        }
        

           

        return answer / 60 + "분 " + answer % 60 + "초";
    }
    
    
}

import java.util.ArrayList;
public class CodingTest4t {
    public static void main(String[] args) {
        String[] page = {"척추동물", "어류", "척추동물", "무척추동물", "파충류", "척추동물", "어류", "파충류"};

        System.out.println(solution(page));        
    }

    public static String solution(String[] page){
        ArrayList<String> chair = new ArrayList<String>();
        int answer = 0;

        for (String i : page){
            if(chair.contains(i)){
                chair.remove(i);
                chair.add(i);
                answer += 1;

            }

            else {
                if (chair.size() >= 3) {
                    chair.remove(0);
                }

                chair.add(i);
                answer += 60;
            }
        }

        return answer / 60 + "분 " + answer % 60 + "초";
    }
    
    
}

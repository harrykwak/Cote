
import java.util.ArrayList;

public class CodingTest2 {
    public static void main(String[] args) {

        int[] stone = { 1, 2, 3, 4 }; // 돌 내구도 

        Dog[] dogs = { new Dog("댕댕이1", "95년생", 1, 3), new Dog("멍멍이2", "89년생", 5, 1), new Dog("뭉뭉이3", "99년생", 3, 3),
                new Dog("월워리4", "08년생", 4, 2) };
        // 댕댕이 네 마리

        solution(stone, dogs);

    }

    public static void solution(int[] stone, Dog[] dogs) {

        ArrayList<String> answer = new ArrayList<String>();

        for (Dog i : dogs) {
            int dogLocation = 0;
            boolean flag = true;

            while (dogLocation < stone.length) {
                dogLocation += i.jump;

                if (dogLocation > stone.length) {
                    break;
                }

                stone[dogLocation - 1] -= i.weight;
                if (stone[dogLocation - 1] < 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                answer.add(i.name);
            }
        }

        System.out.println(answer);

    }
}

class Dog {
    String name;
    String age;
    int jump;
    int weight;

    public Dog(String name, String age, int jump, int weight) {
        this.name = name;
        this.age = age;
        this.jump = jump;
        this.weight = weight;

    }
}
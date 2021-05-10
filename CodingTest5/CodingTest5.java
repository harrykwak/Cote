package CodingTest5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class CodingTest5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer[]> graph = new HashMap<Integer, Integer[]>();

        graph.put(100, new Integer[] { 67, 66 });
        graph.put(67, new Integer[] { 100, 82, 63 });
        graph.put(66, new Integer[] { 100, 73, 69 });
        graph.put(82, new Integer[] { 67, 61, 79 });
        graph.put(63, new Integer[] { 67 });
        graph.put(73, new Integer[] { 66 });
        graph.put(69, new Integer[] { 66, 65, 81 });
        graph.put(61, new Integer[] { 82 });
        graph.put(79, new Integer[] { 82, 87, 77 });
        graph.put(65, new Integer[] { 69, 84, 99 });
        graph.put(81, new Integer[] { 69 });
        graph.put(87, new Integer[] { 79, 31, 78 });
        graph.put(77, new Integer[] { 79 });
        graph.put(84, new Integer[] { 65 });
        graph.put(99, new Integer[] { 65 });
        graph.put(31, new Integer[] { 87 });
        graph.put(78, new Integer[] { 87 });

        System.out.println();
        getMax(graph, 100);
        System.out.println();
        getMin(graph, 100);
    }

    public static void getMax(HashMap<Integer, Integer[]> graph, int start) {
        ArrayList<Integer> visit = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(start);

        while (!stack.isEmpty()) { // 스택이 빌 때까지 반복
            int top = stack.pop(); // top에 스택 데이터 pop

            if (!visit.contains(top)) { // 방문 리스트에 top이 포함되어 있는가?
                if (top != start) { // top이 start와 같은가?
                    System.out.print((char)top);
                }

                visit.add(top); // visit 리스트에 top 추가

                ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(graph.get(top))); // top키를 가지는 값을 가진 리스트
                list.removeAll(visit); // 다음 수와 비교하며 최대값을 구하기 위해서 이전에 있던 값들을 제외하는 식

                if (list.size() == 0) {
                    break; // 리스트가 더 없으면 반복문 종료
                }
                stack.push(Collections.max(list)); // 최대값 구하기

            }
        }
    }

    public static void getMin(HashMap<Integer, Integer[]> graph, int start) {
        ArrayList<Integer> visit = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int top = stack.pop();

            if (!visit.contains(top)) {
                if (top != start) {
                    System.out.print((char) top);
                }

                visit.add(top);

                ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(graph.get(top)));
                list.removeAll(visit);

                if (list.size() == 0) {
                    break;
                }
                stack.push(Collections.min(list));
            }
        }

    }
}

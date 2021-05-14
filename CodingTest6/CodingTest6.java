package CodingTest6;

public class CodingTest6 {
    public static void main(String[] args) {

        int[][] a = {
            { 1, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 1 },
            { 0, 0, 1, 0, 1 },
            { 0, 0, 1, 0, 1 },
            { 0, 0, 1, 0, 1 }
        };

        int[][] b = {
            { 0, 0, 0, 0, 1 },
            { 0, 0, 0, 0, 3 },
            { 0, 0, 0, 0, 4 },
            { 0, 2, 0, 0, 2 },
            { 4, 5, 0, 2, 0 },
        };

        solution(a, b);
    }

    public static void solution(int[][] a, int[][] b) {

        int len = a.length;
        int[][] sample = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                sample[i][j] = b[j][len - 1 - i];
                sample[i][j] += a[i][j];

            }
        }

        for (int i = 0; i < len; i++) {
            String str = "";
            for (int j = 0; j < len; j++) {
                str += sample[i][j];
            }
            System.out.println((char) Integer.parseInt(str, 8));
        }

    }
}

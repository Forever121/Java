package ex9;

public class ex9 {
    public static void main(String[] args) {
        int[][] img = {
                { 3, 0, 1, 5, 0, 3, 0, 3 },
                { 2, 6, 2, 4, 3, 0, 3, 0 },
                { 2, 4, 1, 0, 6, 1, 4, 1 },
                { 3, 0, 1, 5, 0, 3, 0, 2 },
                { 2, 6, 2, 4, 3, 2, 3, 0 },
                { 2, 4, 1, 0, 6, 2, 1, 1 },
                { 2, 6, 2, 4, 4, 0, 3, 6 },
                { 2, 4, 1, 0, 6, 1, 6, 1 }
            };
        fun a = new fun(img);
        a.fun();
    }
}

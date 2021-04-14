package ex9;

public class fun {
    private int[][] arr;

    fun(int[][] img) {
        arr = img;
    }

    public void fun() {
        int[][] kernel = {
                { -1, 0, 1 },
                { -2, 0, 2 },
                { -1, 0, 1 }
            };
        int arrl = arr.length;
        int[][] arrn = new int[arrl - 2][arrl - 2];

        for (int i = 0; i < (arrl - 2); i++) {
            for (int j = 0; j < (arrl - 2); j++) {
                arrn[i][j] = 
                	(arr[i][j] * kernel[0][0]) + (arr[i][j + 1] * kernel[0][1]) + (arr[i][j + 2] * kernel[0][2]) +
                    (arr[i + 1][j] * kernel[1][0]) + (arr[i + 1][j + 1] * kernel[1][1]) + (arr[i + 1][j + 2] * kernel[1][2]) +
                    (arr[i + 2][j] * kernel[2][0]) + (arr[i + 2][j + 1] * kernel[2][1]) + (arr[i + 2][j + 2] * kernel[2][2]);
            }
        }

        for (int i = 0; i < (arrl - 2); i++) {
            for (int j = 0; j < (arrl - 2); j++) {
                System.out.printf("%3d ", arrn[i][j]);
            }

            System.out.println();
        }
    }
}

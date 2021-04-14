package test;


class juanjif {
	private int[][] arr;

    juanjif(int[][] img) {
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
                for (int k = 0; k < 3; k++) {
                	for (int l = 0; l < 3; l++) {
                		arrn[i][j] += arr[i+k][j+l] * kernel[k][l];
                	}
                }
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

public class juanji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        juanjif a = new juanjif(img);
        a.fun();
	}

}

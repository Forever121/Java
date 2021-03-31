package ex5;

public class ex5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] list = new int[100];

        for (int i = 0; i < 100; i++)
            list[i] = (int) (Math.random() * 100);

        sort(list);

        for (int i = 0; i < 100; i++)
            System.out.print(list[i] + "   ");
    }

    public static void sort(int[] list) {
        int n = list.length;

        for (int i = 0; i < (n - 1); i++) {
            int k = i;

            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[k]) {
                    k = j;
                }
            }

            int temp;
            temp = list[i];
            list[i] = list[k];
            list[k] = temp;
        }
    }
}

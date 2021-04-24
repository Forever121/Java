package ex10;
import java.util.Scanner;
public class adjacency {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int[][] adjMatrix = new int[][] {
                { 0, 1, 0, 1, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 1, 1, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 1, 1, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 1, 1, 0 }
            };
        Node[] adjlist = new Node[adjMatrix.length];
        for (int i = 0; i < adjMatrix.length; i++) {
            adjlist[i] = new Node();
            adjlist[i].data = "V" + (i + 1);
            adjlist[i].next = null;
        }
        System.out.println("请选择插入方式（1：前插；2：后插）：");
        int choice = input.nextInt();
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                if (adjMatrix[i][j] == 1) {
                    Node Newnode = new Node();
                    Newnode.data = j + "";

                    if (choice == 1) {
                        adjlist[i].qiancha(Newnode);
                    } else {
                        adjlist[i].houcha(Newnode);
                    }
                }
            }
            System.out.print(i + " ");
            adjlist[i].PrintList();
        }
    }
}


class Node {
    String data;
    Node next;

    public void qiancha(Node Newnode) {
        Newnode.next = this.next;
        this.next = Newnode;
    }

    public void houcha(Node Newnode) {
        Node t = this;

        while (true) {
            if (t.next == null) {
                t.next = Newnode;
                break;
            } else {
                t = t.next;
            }
        }
    }

    public void PrintList() {
        Node t = this;
        System.out.print(t.data + " ");

        while ((t = t.next) != null) {
            System.out.print(t.data + " ");
        }

        System.out.println();
    }
}

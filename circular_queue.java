
import java.util.*;
import java.io.*;

public class circular_queue {
    static int a[];
    static int front = -1, rear = -1, ch, x, n;

    static void enqueue(int n) {
        Scanner sc = new Scanner(System.in);
        while (front < (n)) {
            System.out.println("press 1 to enqueue the element into the queue");
            System.out.println("enter 2 if you do not want to enter  the element");
            System.out.println("please enter your choice");
            ch = sc.nextInt();
            if (ch == 1) {
                if ((rear + 1) % n == front) {
                    System.out.println("queue is full, insertion not possible");
                    break;
                } else if (front == -1 && rear == -1) {
                    front = rear = 0;
                    System.out.println("enter the element you want to enter");
                    a[rear] = sc.nextInt();
                } else {
                    rear = (rear + 1) % n;
                    System.out.println("enter the element you want to enter");

                    a[rear] = sc.nextInt();
                }
            } else if (ch == 2) {
                System.out.println("do not want to enter elements into the queue");
                break;
            } else {
                System.out.println("please enter a valid choice");
            }

        }

    }

    static void dequeue(int n) {
        Scanner sc = new Scanner(System.in);
        while (front < (n)) {
            System.out.println("press 1 to delete the element from the queue");
            System.out.println("enter 2 if you do not want to delete the element");
            System.out.println("please enter your choice");
            ch = sc.nextInt();
            if (ch == 1) {
                if (rear == -1 && front == -1) {
                    System.out.println("queue is empty,deletion not possible");
                    break;
                } else if (rear == front) {
                    System.out.println("the deleted element is " + a[front]);
                    rear = front = -1;
                } else {
                    System.out.println("the dequeued element is " + a[front]);
                    front = (front + 1) % n;
                }

            } else if (ch == 2) {
                System.out.println("do not want to delete the element from the queue");
                break;
            } else {
                System.out.println("please enter a valid choice");
            }

        }

    }

    static void print_elements(int n) {
        if (rear == -1 && front == -1) {
            System.out.println("queue is empty");
        }
        System.out.println("elements in the circular queue are");
        int i = front;
        while (i != rear) {
            System.out.println(a[i]);
            i = ((i + 1) % n);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        a = new int[n];
        enqueue(n);
        dequeue(n);
        enqueue(n);
        enqueue(n);
        dequeue(n);
        print_elements(n);

    }

}

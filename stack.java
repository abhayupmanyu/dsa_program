import java.util.*;
import java.io.*;

public class stack {
    static int top = -1, ch, x,n;

    static int a[] ;

    static void push(int n) {
        Scanner sc = new Scanner(System.in);
        while (top < n - 1) {
            System.out.println("do you want to enter the elements into the stack");
            System.out.println("please enter yoour choice");
            ch = sc.nextInt();
            if (ch == 1) {
                if (top == n - 1) {
                    System.out.println("stack is full,insertion not possible");
                    break;
                } else {
                    System.out.println("enter the number into the stack");
                    top++;
                    a[top] = sc.nextInt();
                }

            } else if (ch == 2) {
                System.out.println("do not want to insert element into the stack");
                break;
            } else {
                System.out.println("please enter a valid choice");
            }

        }
    }

    static void pop(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to delete the element from the stack");
        System.out.println("please enter your choice");
        while (top < n) {
            ch = sc.nextInt();
            if (ch == 1) {

                if (top == -1) {
                    System.out.println("stack is already empty,deletion not possible");
                    break;
                } else {
                    System.out.println("deleted element is " + a[top]);
                    x = a[top];
                    top--;

                }

            } else if (ch == 2) {
                System.out.println("do not want to delete the element from the stack");
                break;
            } else {
                System.out.println("please enter a valid choice");
            }

        }
    }

    static void print_elements(int n) {
        System.out.println("elements in the stack are");
        for (int i = 0; i <= top; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of n");
   int n = sc.nextInt();
   a=new int[n];
        
        /*
         * System.out.
         * println("which operation you want to perform,please enter your choice");
         * switch(ch){
         * 
         * case 1:
         * push(n);
         * break;
         * 
         * case 2:
         * pop(n);
         * break;
         * 
         * case 3:
         * print_elements(n)
         * }
         */
        push(n);
        pop(n);
        print_elements(n);

    }

}

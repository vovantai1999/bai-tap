package palindome_queue;

import sun.misc.Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws InterruptedException {
        // kiểm tra chuỗi
        // chuỗi palindrome là chuỗi có thể đọc xuôi lẫn đọc ngược

        LinkedList stack = new LinkedList();
        Queue queue = new Queue();
        char c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("chuỗi cần test: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            stack.push(c);
            queue.enqueue(c);
        }
        String stringStack = "";
        String stringQueue = "";
        while (!stack.isEmpty()) {
            stringStack += stack.pop();
        }
        while (!queue.isEmpty()) {
            stringQueue += queue.dequeue();
        }

        if (stringStack.equals(stringQueue)) {
            System.out.println("là chuỗi Palindrome !");
        } else System.out.println("không phải chuỗi  Palindrome !");
    }
}
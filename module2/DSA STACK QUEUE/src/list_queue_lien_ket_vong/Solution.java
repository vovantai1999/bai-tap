package list_queue_lien_ket_vong;

public class Solution {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    // Chức năng tạo hàng đợi Vòng tròn
    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else
            q.rear.link = temp;

        q.rear = temp;
        q.rear.link = q.front;
    }

    // Chức năng xóa phần tử khỏi Hàng đợi Vòng tròn
    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }

        // Nếu đây là nút cuối cùng bị xóa
        int value; // Value to be dequeued
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else  // Có nhiều hơn một nút
        {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }

        return value;
    }

    //Hàm hiển thị các phần tử của Hàng đợi Hình tròn
    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.printf(" Các phần tử trong Hàng đợi Hình tròn là ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
    public static void main(String args[])
    {
        // Tạo một hàng đợi và khởi tạo phía trước và phía sau
        Queue  q = new Queue();
        q .front = q .rear =  null;

        // Chèn các phần tử trong Hàng đợi Hình tròn
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Hiển thị các phần tử có trong Hàng đợi Hình tròn
        displayQueue(q);

        // Xóa các phần tử khỏi Hàng đợi Vòng tròn
        System.out.printf(" Deleted value = %d", deQueue(q));
        System.out.printf(" Deleted value = %d", deQueue(q));

        // Các phần tử còn lại trong Hàng đợi Vòng tròn
        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }
}
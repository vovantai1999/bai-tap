package queue_array;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Tràn ra! không thể thêm phần tử" + item);

        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Yếu tố " + item + " được đẩy vào hàng đợi ");

        }

    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Không thể xóa phân tử khỏi hàng đợi");
        }
        else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Thao tác hoàn tất ! loại bỏ: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("thao tác hoàn tất  ! loại bỏ : " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    private boolean isQueueFull() {
        return false;
    }
}

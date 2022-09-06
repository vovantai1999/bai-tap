package stack_array;

public class StackClient {
    public static void main(String[] args)  throws Exception{
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Kích thước của ngăn xếp sau các hoạt động đẩy");
        System.out.println("Các phần tử pop từ ngăn xếp");
        while (!stack.isEmpty()){
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n3. \n" +
                "Kích thước của ngăn xếp sau các hoạt động bật lên");
    }
}

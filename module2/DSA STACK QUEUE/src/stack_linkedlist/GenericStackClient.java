package stack_linkedlist;

public class GenericStackClient {
    public static void stackOfInteger(){
        MyGenericStack<Integer>stack = new MyGenericStack<>();

        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println("kích thước của ngăn xếp sau các hoạt động bật lên: " + stack.size);
        System.out.println("yếu tố pop từ ngăn xếp:");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("kích thước của ngăn xếp sau các hoạt động bật lên: " + stack.size);
    }
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Tai");
        stack.push("Tung");
        stack.push("Binh");
        stack.push("Loc");
        stack.push("khanh");
        stack.push("Teo");

        System.out.println("kích thước của ngăn xếp sau các hoạt động đẩy: " + stack.size());
    }

}

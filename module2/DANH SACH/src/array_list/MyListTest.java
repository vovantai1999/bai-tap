package array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listNames = new MyList<>(10);
        listNames.add("Tai");
        listNames.add("Tien");
        listNames.add("Tung");
        listNames.add("Hieu");
        listNames.add(1, "Binh");

        listNames.printMyList();
        listNames.remove(3);
        listNames.printMyList();

        MyList<Number> listNumber = new MyList<>(10);
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        listNumber.add(5);
        listNumber.printMyList();
        if (listNumber.contains(3)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
        if (listNumber.contains(6)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
    }

    }


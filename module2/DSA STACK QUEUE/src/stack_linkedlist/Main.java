package stack_linkedlist;

import static stack_linkedlist.GenericStackClient.stackOfInteger;

public class Main {
    public static void main(String[] args) {
        GenericStackClient genericStackClient = new GenericStackClient();
        System.out.println("chồng số nguyên: ");
        genericStackClient.stackOfInteger();

        System.out.println("chồng chuỗi ");
        genericStackClient.stackOfIStrings();
    }
}

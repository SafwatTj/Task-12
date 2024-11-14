import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
        list.add("jack");
        list.add("nick");
        list.add("oleg");
        list.add("john");
        list.add("petr");


        for (String s: list){
            System.out.println(s);
        }

        System.out.println("Разиер:" + list.size());


        MyLinkedList<Person> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(new Person("Jack",15));
        myLinkedList.add(new Person("Nick",16));
        myLinkedList.add(new Person("John",17));

        //myLinkedList.print();

        System.out.println(myLinkedList);

        System.out.println("----------------------------------");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }


        MyLinkedList<String> stringMyLinkedList= new MyLinkedList<>();
        stringMyLinkedList.add("qwer");
        stringMyLinkedList.add("asdf");
        stringMyLinkedList.add("erty");
        stringMyLinkedList.add("hjkl");
        stringMyLinkedList.add("ertyu");

        System.out.println(stringMyLinkedList);

        MyLinkedList<Integer> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.add(1);
        myLinkedList1.add(6);
        myLinkedList1.add(7);
        myLinkedList1.add(1);
        myLinkedList1.add(5);
        System.out.println(myLinkedList1);

        MyLinkedList<Integer> intList = MyLinkedList.of(828, 3, 2, 1, 45, 2, 2);
        MyLinkedList<String> strinList = MyLinkedList.of("qwe", "lou", "klod");

        
    }
}
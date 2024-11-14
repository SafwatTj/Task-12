public class Main2 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = MyLinkedList.of(0, 1, 2, 4, 5, 6);
        System.out.println(list);
        list.add(3,3);
        System.out.println(list);

        System.out.println("get=" +list.get(3));
        System.out.println("size=" + list.size());

        list.addFirst(-1);
        System.out.println(list);
        System.out.println("get=" +list.get(0));
        System.out.println("size=" + list.size());
        System.out.println("------------------------------------");
        /*
        while (list.hasNext()){
            System.out.println(list.next());
        }

         */


        for (Integer i : list ){
            System.out.println(i);
        }


    }


}

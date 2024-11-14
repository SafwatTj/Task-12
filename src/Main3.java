import java.util.*;

public class Main3 {
    public static void main(String[] args) {
       List<String> list = new LinkedList<>();
        list.add("jack");
        list.add("john");
        list.add("john");
        list.add("john");
        list.add("john");
        list.add("lena");
        list.add("nick");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String el = iterator.next();
            System.out.println(el);
        }

        ListIterator<String> listIterator = list.listIterator();
/*
        for (int i=0; i< list.size();i++){ /////   ??????
            if(list.get(i).equals("john")){
                list.remove(i);
            }
        }

        for (String s: list){    //ConcurrentModificationException
            if(s.equals("john")){
                list.remove("john");
            }
        }

        while (list.contains("john")){  // не эффективный
            list.remove("john");
        }
  */
        // удаление
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals("john")){
                iterator1.remove();
            }
        }

        System.out.println("------- delete john -----------");
        System.out.println(list);





    }
}

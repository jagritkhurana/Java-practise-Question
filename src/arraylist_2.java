import java.util.ArrayList;
import java.util.Collections;

public class arraylist_2 {

    static void reverse(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while (i<j){
            int temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Orignal arraylist "+ list);
        //reverse(list);
        Collections.reverse(list);
        System.out.println("Reversed list "+ list);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Jagrit");
        l1.add("khurana");
        l1.add("is");
        l1.add("good");
        l1.add(" boy");
        System.out.println("Orignal array "+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Sorted in decending order"+ l1);
    }
}

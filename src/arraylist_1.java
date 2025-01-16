import java.util.ArrayList;

public class arraylist_1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();

        //add an element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        // printing usinf for loop
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        //printing directly
        System.out.println(l1);
        //add element at particular index
        l1.add(1,100);
        System.out.println(l1);
        //modifying an index
        l1.set(1,10);
        System.out.println(l1);
        //removind at an index
        l1.remove(1);
        System.out.println(l1);
        //removing an element
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        //check if the element exists
        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);
        // if you don't specify any class , you can add any type of data to arraylist
        ArrayList l=new ArrayList();
        l.add("PQRS");
        l.add(1);
        l.add(true);
        System.out.println(l);
        //working of index of
        int ans1=l1.indexOf(Integer.valueOf(6));
        System.out.println(ans1);
        //working of lastindexof
        l1.add(6);
        int ans2=l1.lastIndexOf(Integer.valueOf(6));
        System.out.println(l1);
        System.out.println(ans2);
        //working of isempty
        boolean ans3=l1.isEmpty();
        System.out.println(ans3);

    }
}

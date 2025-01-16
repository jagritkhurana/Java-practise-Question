class student{
    int roll_no;
    String studentname;
}

public class about {
    public static void main(String[] args) {
        student obj1 = new student();
        obj1.roll_no=1;
        obj1.studentname="jagrit";

        student obj2=new student();
        obj2.roll_no=2;
        obj2.studentname="saanvi";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.studentname);
        System.out.println(obj2.roll_no);
        System.out.println(obj2.studentname);

    }

}

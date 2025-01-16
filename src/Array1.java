class array{
    void demoarray(){
        int [] ages = new int[3];
        ages[0]=5;
        ages[1]=2;
        ages[2]=6;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        for(int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
        for(int age : ages){
            System.out.println(age);
        }
        int i=0;
        while(i<3){
            System.out.println(ages[i]);
            i++;
        }
    }
}


public class Array1 {
    public static void main(String[] args) {
        array sc = new array();
        sc.demoarray();
    }
}

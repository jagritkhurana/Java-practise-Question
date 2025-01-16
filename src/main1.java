import java.util.Scanner;

class oopssum {
    public int add(int a,int b){
        int ans=a+b;
        return ans;
    }
}

public class main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        oopssum obj1=new oopssum();
        int ans=obj1.add(a,b);
        System.out.println(ans);

    }
}

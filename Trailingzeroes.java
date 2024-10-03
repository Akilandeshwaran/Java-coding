import java.util.*;
class ajay{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();int sum=0;
        int m = 5;
        while(a/m>0)
        {
            sum=sum+(a/m);
            m=m*5;
        }
        System.out.print(sum);
    }
}

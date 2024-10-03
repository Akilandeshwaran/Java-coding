import java.util.*;
class sakthish{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();int c=0;
        int b = obj.nextInt();
        for(int i=a;i<b+1;i++)
        {   
            if(check(i)){
            System.out.print(i+" ");
            c++;
            }
        }
        System.out.println(c);
    }
        public static boolean check(int n)
        {
            String str = n+"";int d=0;
            for(int i=0;i<str.length()-1;i++)
            {
                // for(int j=i+1;j<str.length();j++)
                // {
                //     if(str.charAt(i)==str.charAt(j))
                //     return false;
                // }
                if(str.substring(i+1,str.length()).contains(str.charAt(i)+""))
                return false;
            }
            return true;
        }
        
}

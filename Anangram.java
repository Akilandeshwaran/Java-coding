import java.util.*;
class ajay{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String st1 = obj.nextLine();int c=0;
        String st2 = obj.nextLine();
        if(st1.length()==st2.length()){
            for(int i=0;i<st1.length();i++)
            {
                for(int j=0;j<st1.length();j++)
                {
                    if(st1.charAt(i)==st2.charAt(j))
                    {
                    c++;
                    }
                }
            }
        }
        if(c==st1.length())
        System.out.println("Anagram");
        else
        System.out.println("Not");
    }
}
        

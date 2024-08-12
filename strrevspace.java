import java.util.*;
class sam{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int n = s.length();int j = n-1;
        char a[] = new char[n];
        for(int i =0;i<n;i++){
            a[i] = s.charAt(i);
    }
    for(int i =0;i<n;i++){
        if(a[i]!=' '){
            System.out.print(a[j]);
            j=j-1;
        }
        else{
            System.out.print(" ");
            j=j-1;
        }
    }
    }
}

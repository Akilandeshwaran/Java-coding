import java.util.*;
class puvanes{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        int a = obj.nextInt();
        for(int i = a;i>-1;i--){
            System.out.print(arr[i]);
        }
        for(int i = a+1;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}

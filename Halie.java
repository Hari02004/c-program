import java.util.*;
public class Halie {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            arr1[i] = arr[i];
        }
        sc.close();
        Arrays.sort(arr1);
        int max = 0;
        for(int i=0;i<size;i++){
            if(arr1[i]!=arr[i]){
                if(arr1[i]>arr[i])
                    max = arr1[i];
                else
                    max = arr[i];
            }        
                
        }
        System.out.println(max);
     }
}

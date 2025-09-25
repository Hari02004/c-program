import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nooffrnd = sc.nextInt();
        int total = 0;
        int target = sc.nextInt();
        int[] arr = new int[nooffrnd];
        for(int i =0;i<nooffrnd;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<nooffrnd;i++){
            if(arr[i]<=target)
                total++;
            else
                total = total+2;
        }
        System.out.println(total);
    }
}
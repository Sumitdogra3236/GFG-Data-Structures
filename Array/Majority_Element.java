import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        MajorityElement(arr);
    }
    public static void MajorityElement(int arr[]){
        int majority = arr.length / 2;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            for(int j=i+1; j<arr.length; j++ ){
                if(arr[j] == element){
                    count++;
                }
                if(count > majority){
                    System.out.println(arr[i]);
                    return;
                }
            }
            
        }
        System.out.println("-1");
    }
}
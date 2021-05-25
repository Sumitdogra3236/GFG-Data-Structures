import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int d = scn.nextInt();

    rotate(arr, n, d);

}

public static void rotate(int arr[], int n, int d){
reverse(arr, 0, d-1);
reverse(arr, d , n-1);
reverse(arr, 0, n-1);

for(int i=0;i<n;i++){
    System.out.println(arr[i]);
}
}
public static void reverse(int arr[], int low, int high){

    while(low < high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        low++;
        high--;
    }
}

}


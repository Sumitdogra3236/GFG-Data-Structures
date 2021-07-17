// Input:  arr[] = {4, 8, 5, 2, 25}
// Output:         {2, 5, 2, -1, -1}

// public static int[] solve(int[] arr){
//    int nser[] = new int[arr.length];
//    nser[arr.length-1] = -1;
//    Stack<Integer> st = new Stack<>();
   
//    st.push(arr[arr.length-1]);
   
//    for(int i = arr.length-2; i >= 0; i--){
//        while(st.size() > 0 && arr[i] < st.peek()){
//            st.pop();
//        }
//        if(st.size() == 0){
//            nser[i] = -1;
//        }
//        else{
//            nser[i] = st.peek();
//        }
//        st.push(arr[i]);
//    }
   
//    return nser;
//  }


import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   int nser[] = new int[arr.length];
   nser[arr.length-1] = -1;
   Stack<Integer> st = new Stack<>();
   
   st.push(arr[arr.length-1]);
   
   for(int i = arr.length-2; i >= 0; i--){
       while(st.size() > 0 && arr[i] < st.peek()){
           st.pop();
       }
       if(st.size() == 0){
           nser[i] = -1;
       }
       else{
           nser[i] = st.peek();
       }
       st.push(arr[i]);
   }
   
   return nser;
 }

}
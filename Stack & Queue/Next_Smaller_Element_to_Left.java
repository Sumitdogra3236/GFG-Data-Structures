// Input:  arr[] = {1, 6, 4, 10, 2, 5}
// Output:         {-1, 1, 1,  4, 1, 2}

// public static int[] solve(int[] arr) {
//         int nsel[] = new int[arr.length];
//         Stack<Integer> st = new Stack<>();
//         nsel[0] = -1;

//         st.push(arr[0]);

//         for (int i = 1; i <= arr.length - 1; i++) {
//             while (st.size() > 0 && arr[i] < st.peek()) {
//                 st.pop();
//             }
//             if (st.size() == 0) {
//                 nsel[i] = -1;
//             } else {
//                 nsel[i] = st.peek();
//             }
//             st.push(arr[i]);
//         }
//         return nsel;
//     }




import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int nsel[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nsel[0] = -1;

        st.push(arr[0]);

        for (int i = 1; i <= arr.length - 1; i++) {
            while (st.size() > 0 && arr[i] < st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nsel[i] = -1;
            } else {
                nsel[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nsel;
    }

}
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pushed = new int[n];
        for(int i=0;i<n;i++) pushed[i] = sc.nextInt();
        int[] popped = new int[n];
        for(int i=0;i<n;i++) popped[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int val : pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        System.out.println(st.isEmpty());
    }
}
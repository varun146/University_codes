package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Result {

    public static void main(String[] args) {
        List<Integer> h1 = Arrays.asList(3, 2, 1, 1, 1);
        List<Integer> h2 = Arrays.asList(4, 3, 2);
        List<Integer> h3 = Arrays.asList(1, 1, 4, 1 );

        int ans = equalStacks(h1, h2, h3);
        System.out.println(ans);

    }



    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();

        int h_1 = 0;
        int h_2 = 0;
        int h_3 = 0;

        int minHeight = 0;

        for (Integer integer : h1) {
            s1.push(integer);
            h_1 += integer;
        }
        for (Integer integer : h2) {
            s2.push(integer);
            h_2 += integer;
        }
        for(int i =0; i < h3.size(); i++){
            s3.push(h2.get(i));
            h_3 += h3.get(i);
        }

        minHeight = Math.min(h_1, Math.min(h_2, h_3));

        while(h_1 != h_2 || h_1 != h_3)
        {
            while(h_1 > minHeight){
                h_1 -= s1.pop();
            }
            minHeight = Math.min(h_1, Math.min(h_2, h_3));

            while(h_2 > minHeight){
                h_2 -= s2.pop();
            }
            minHeight = Math.min(h_1, h_2);

            while(h_3 > minHeight){
                h_3 -= s3.pop();
            }
            minHeight = Math.min(h_1, h_3);
        }
        return minHeight;
    }
}

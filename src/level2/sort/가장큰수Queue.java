package level2.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 가장큰수Queue {
    public String solution(int[] numbers) {
        PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.parseInt(s2 + s1) - Integer.parseInt(s1 + s2);
            }
        });
        String ans = "";

        for (int num : numbers) {
            pq.offer(String.valueOf(num));
        }

        while (!pq.isEmpty()) {
            ans += pq.poll();
        }

        if (ans.charAt(0) == '0')
            return "0";
            //if (Integer.parseInt(ans) == 0)
            //    return "0";
        else return ans;
    }
}

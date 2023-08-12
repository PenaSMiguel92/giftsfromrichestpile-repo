import java.util.*;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> giftsQueue = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        for (int gift : gifts) {
            giftsQueue.add(gift);
        }
        do {
            giftsQueue.add((int) Math.sqrt(giftsQueue.poll()));
            k--;
        } while (k > 0);
        long sum = 0;
        while (!giftsQueue.isEmpty()) {
            sum += giftsQueue.poll();
        }
        return sum;
    }
}

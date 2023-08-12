import java.util.*;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        List<Integer> giftsQueue = new LinkedList<>();
        for (int index = 0; index < gifts.length; index++) {
            giftsQueue.add(gifts[index]);
        }

        do {
            giftsQueue.sort(null);
            System.out.println(giftsQueue);
            giftsQueue.set(giftsQueue.size() - 1, (int) Math.floor(Math.sqrt(giftsQueue.get(giftsQueue.size() - 1))));    
            // gifts[maxPileIndex] = (int) Math.floor(Math.sqrt(maxValue));
            k--;
        } while (k > 0);
        long sum = 0;
        for (int gift : giftsQueue) {
            sum += gift;
        }
        return sum;
    }
}

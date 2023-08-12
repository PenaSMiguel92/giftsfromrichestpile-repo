public class Solution {
    public long pickGifts(int[] gifts, int k) {
        do {
            int maxValue = -100000;
            int maxPileIndex = 0;
            for (int index = 0; index < gifts.length; index++) {
                if (gifts[index] > maxValue) {
                    maxValue = gifts[index];
                    maxPileIndex = index;
                }
            }
            gifts[maxPileIndex] = (int) Math.floor(Math.sqrt(maxValue));

            System.gc();
            k--;
        } while (k > 0);
        long sum = 0;
        for (int gift : gifts) {
            sum += gift;
        }
        return sum;
    }
}

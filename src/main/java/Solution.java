import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {
        int result = ratings.length;
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        int temp = result;
        while (true) {
            for (int i = 0; i < candies.length; i++) {
                if (i > 0) {
                    if (ratings[i] > ratings[i - 1]) {
                        result += candies[i - 1] >= candies[i] ? Math.max(0, candies[i - 1] - candies[i] + 1) : 0;
                        if(candies[i - 1] >= candies[i]) {
                            candies[i] = candies[i - 1] + 1;
                        }
                    }
                }

                if (i < ratings.length - 1) {
                    if (ratings[i] > ratings[i + 1]) {
                        result += candies[i + 1] >= candies[i] ? Math.max(0, candies[i + 1] - candies[i] + 1) : 0;
                        if(candies[i + 1] >= candies[i]) {
                            candies[i] = candies[i + 1] + 1;
                        }
                    }
                }
            }
            if(result == temp){
                break;
            }

            temp = result;
        }


        return result;
    }
}

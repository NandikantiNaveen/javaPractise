package interviewQuestions;

public class SumDigits {
	
	public static int minCost(String s, int[] cost) {
        int totalCost = 0, rollingCost = 0;
        Integer maxCost = null;
        
        for (int idx = 0; idx < s.length(); idx++) {
            if (idx == 0 || s.charAt(idx) == s.charAt(idx - 1)) {
                rollingCost += cost[idx];
                maxCost = maxCost == null ? cost[idx] : Math.max(maxCost, cost[idx]);
            } else {
                totalCost += rollingCost - maxCost;
                maxCost = rollingCost = cost[idx];
            }
        }
        
        totalCost += rollingCost - maxCost;
        return totalCost;
    }

	public static void main(String[] args) {
		int[] arry = {10,5,10,5,10};
		System.out.println(minCost("ababa", arry));
	}

}

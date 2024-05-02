import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int totalScore = 0;

        for (String op : ops) {
            if ("D".equals(op)) {
                if (!stack.isEmpty(D)) {
                    int newScore = 2 * stack.peek();
                    totalScore += newScore;
                    stack.push(newScore);
                }
            } else if ("C".equals(op)) {
                if (!stack.isEmpty()) {
                    totalScore -= stack.pop();
                }
            } else if ("+".equals(op)) {
                if (stack.size() >= 2) {
                    int scoreTwo = stack.pop();
                    int newScore = scoreTwo + stack.peek();
                    stack.push(scoreTwo);
                    stack.push(newScore);
                    totalScore += newScore;
                }
            } else {
                int parsedValue = Integer.parseInt(op);
                stack.push(parsedValue);
                totalScore += parsedValue;
            }
        }
        return totalScore;
    }
}

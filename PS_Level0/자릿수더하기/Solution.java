package PS_Level0.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }

        return answer;
    }
}

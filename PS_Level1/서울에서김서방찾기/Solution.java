package PS_Level1.서울에서김서방찾기;

public class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
            }
        }

        return "김서방은 " + x + "에 있다";
    }
}

package suo.test;

public class Solution {
    //字串--两个下标
    //不重复--
    //最大长度---max
    public String subString(String str) {
        int left = 0;
        int right = 0;
        int len = 0;
        int[] res = new int[2];
        for (left = 0; left < str.length(); left++) {
            for (right = left + 1; right < str.length(); right++) {
                if (str.charAt(right) == str.charAt(left)) {
                    if (len == Math.max(len,right - left)) {
                        res[0] = right;
                        res[1] = left;
                    }
                    len = Math.max(len,right - left);
                    break;
                }
            }
        }
        return str.substring(res[1],res[0]);

    }

    public static void main(String[] args) {
        String str = "abcdabcbb";
        Solution solution = new Solution();
        String s = solution.subString(str);
        System.out.println(s);
    }
}

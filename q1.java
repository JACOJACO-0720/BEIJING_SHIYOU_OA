class Solution {
    public int answer(String source, String target) {
        int sourceLength = source.length();
        int result = 0;
        int targetIndex = 0;
        int mark;
        while (targetIndex < target.length()) {
            mark = targetIndex;
            for (int i = 0; i < sourceLength; i++) {
                if (targetIndex < target.length() && source.charAt(i) == target.charAt(targetIndex))
                    targetIndex++;
            }
            if (mark == targetIndex) {
                return -1;
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println();
    }
}


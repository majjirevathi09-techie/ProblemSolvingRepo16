class Solution {
    public int lengthOfLastWord(String s) {
//        s = s.trim();
        char inputArray[] = s.toCharArray();
        int N = inputArray.length;
        int i = N - 1;
        int count = 0;
        while (i >= 0) {
            if (inputArray[i] != ' ') {
                count++;
            } else if (count > 0) {
                System.out.println(count);
                break;
            }
            i--;
        }
        return count;

    }
}
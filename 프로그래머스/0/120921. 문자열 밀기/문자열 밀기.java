class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) {
            return 0;
        }
        
        int length = A.length();
        for(int i = 0; i < length; i++) {
            A = A.charAt(length - 1) + A.substring(0, length - 1);
            if(A.equals(B)) {
                return i + 1;
            }
        }
        return -1;
    }
}
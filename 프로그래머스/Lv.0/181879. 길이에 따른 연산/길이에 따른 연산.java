import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        IntStream stream = IntStream.of(num_list);
        return num_list.length > 10 ? stream.sum() : stream.reduce(1, (x, y) -> x * y);
    }
}
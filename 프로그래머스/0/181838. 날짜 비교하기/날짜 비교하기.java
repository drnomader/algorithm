import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);
        return localDate1.compareTo(localDate2) >= 0 ? 0 : 1;
    }
}
package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int length = (t + "").length();
        int sum = 0;
        int tDuplicate = t < 0 ? -t : t;
        for (int i = 0; i < length; i++) {
            sum += tDuplicate % 10;
            tDuplicate /= 10;
        }
        System.out.println(sum);
    }
}

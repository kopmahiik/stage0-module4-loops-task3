package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int sum = 0;
        int nines = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            nines = nines * 10 + 9;
            sum += nines;
        }
        System.out.println(sum);
    }
}

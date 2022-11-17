package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int count = 0;
        int sum = 0;
        for (int i = numberToSkip; i <= lastInRow;i++){
            if (numberToSkip > lastInRow){
                System.out.println("number to skip is bugger then the last");
            } else if (lastInRow < 0) {
                System.out.println("last number in row is negative");
            }else {

                sum += i;
                count = i;
                System.out.println("skipped sum is number" + sum+ "counted sum is number" + count);

            }
           }
    }
}

import java.text.DecimalFormat;
public class timeMethods {
    public static int N = ;
    public static void main (String[]args){
        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        int[] arr = new int[32654];
        for(int i = 0;i < arr.length; i++){
            arr[i] = i;
        }
        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;

            runTime = 0;
            for (repetition = 0; repetition < repetitions; repetition++) {
                start = System.nanoTime();

                // call the procedures to time here:
                LinearSearch(arr,N);
                BinarySearch(arr,N);
                // Figure out how to alter this guideline here,

                finish = System.nanoTime();

                time = (double) (finish - start);
                runTime += time;
                runTime2 += (time * time);
            }

            double aveRuntime = runTime / repetitions;
            double stdDeviation =
                    Math.sqrt(runTime2 - repetitions * aveRuntime * aveRuntime) / (repetitions - 1);

            System.out.print("\n\n\fStatistics\n");
            System.out.println("________________________________________________");
            System.out.println("Total time   =           " + runTime / 1000 + "s.");
            System.out.println("Total time²  =           " + runTime2);
            System.out.println("Average time =           " + fiveD.format(aveRuntime / 1000)
                    + "s. " + '±' + " " + fourD.format(stdDeviation) + "ms.");
            System.out.println("Standard deviation =     " + fourD.format(stdDeviation));
            System.out.println("n            =           " + n);
            System.out.println("Average time / run =     " + fiveD.format(aveRuntime / n * 1000)
                    + 'µ' + "s. ");

            System.out.println("Repetitions  =             " + repetitions);
            System.out.println("________________________________________________");
            System.out.println();
            System.out.println();
        }


    public static void LinearSearch(int[] arr, double target) {

        for (int j : arr) {
            if (j == target) {
                return;
            }
        }


    }

    public static void BinarySearch(int[] arr, double target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (high + low) / 2;

        while (low <= high) {
            if (arr[mid] == target) return;
            else if (low < arr[mid])
                low = mid + 1;
            else {
                high = mid - 1;
            }

        }
    }
}



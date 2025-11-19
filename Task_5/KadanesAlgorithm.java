public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Result result = kadane(nums);

        System.out.println("Maximum Sum: " + result.maxSum);
        System.out.print("Subarray: [");
        for (int i = result.start; i <= result.end; i++) {
            System.out.print(nums[i]);
            if (i < result.end) System.out.print(", ");
        }
        System.out.println("]");
    }

    static class Result {
        int maxSum, start, end;
        Result(int maxSum, int start, int end) {
            this.maxSum = maxSum;
            this.start = start;
            this.end = end;
        }
    }

    public static Result kadane(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
                tempStart = i;
            } else {
                maxEndingHere += nums[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }
        return new Result(maxSoFar, start, end);
    }
}

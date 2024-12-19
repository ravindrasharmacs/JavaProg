public class RemoveDup {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }

    // Example usage
    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 2, 3, 4, 4, 5};
        int uniqueCount = removeDuplicates(sortedArray);

        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}

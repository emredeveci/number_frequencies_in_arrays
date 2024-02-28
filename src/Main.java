public class Main {
    public static void main(String[] args) {
        int[] testArray = {10, 20, 20, 10, 10, 20, 5, 20};
        printFrequencies(testArray);
    }

    static void printFrequencies(int[] array) {
        int[] temporaryArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            //if a number is previously processed, then this loop won't reprocess it
            if (temporaryArray[i] == -1) {
                continue;
            }
            int currentCount = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentCount++;
                    //mark repeated numbers out of the test pool
                    temporaryArray[j] = -1;
                }
            }

            System.out.println("Number " + array[i] + " occurs " + currentCount + " times.");
        }
    }
}
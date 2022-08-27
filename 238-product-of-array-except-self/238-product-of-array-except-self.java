class Solution {

    public int[] productExceptSelf(int[] array) {
        // Write your code here.

        int[] left = new int[array.length];

        int[] right = new int[array.length];

        int[] arr = new int[array.length];

        left[0] = 1;

        right[array.length - 1] = 1;

        for (int i = 1; i < array.length; i++) {
            left[i] = left[i - 1] * array[i - 1];
        }

        for (int i = array.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * array[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            arr[i] = left[i] * right[i];
        }

        return arr;
    }
}

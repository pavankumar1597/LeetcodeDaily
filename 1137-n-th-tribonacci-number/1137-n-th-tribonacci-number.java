class Solution {
    HashMap<Integer, Integer> inte = new HashMap<>();

    public int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n == 2) return 1;

        int soln = 0;

        if (!inte.containsKey(n - 1)) {
            inte.put(n - 1, tribonacci(n - 1));
        }

        if (!inte.containsKey(n - 2)) {
            inte.put(n - 2, tribonacci(n - 2));
        }
        if (!inte.containsKey(n - 3)) {
            inte.put(n - 3, tribonacci(n - 3));
        }

        return inte.get(n - 1) + inte.get(n - 2) + inte.get(n - 3);
    }
}

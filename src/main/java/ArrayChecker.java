public class ArrayChecker {
    private final int[] arr;

    public ArrayChecker(final int[] arr) {
        this.arr = arr;
    }

    public int minOfArr() {
        int result = 0;
        int min = this.arr[0];
        for (int i = 0; i < this.arr.length; i++) {
            if (min > this.arr[i]) {
                min = this.arr[i];
                result = i;
            }
        }
        return result;
    }

    public double arithmetic() {
        double result = 0;
        for (int anArr : this.arr) {
            result += anArr;
        }
        return result / this.arr.length;
    }
}

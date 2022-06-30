package ind.liuer.structure;

/**
 * 前缀和
 *
 * @author Mingの
 */
public class PrefixSum {

    static int times = 100000000;
    static int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int len = data.length;

    static int[] arr = new int[len];
    static int[][] plane = new int[len][len];

    static {
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                arr[i] = data[i];
            } else {
                arr[i] = arr[i - 1] + data[i];
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < times; i++) {
            int index = (int) (Math.random() * len);
            System.out.println("0 -> " + index + ": " + arr[index]);
        }
    }
}

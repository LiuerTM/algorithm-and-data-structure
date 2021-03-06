package ind.liuer.operation;

/**
 * 按位与【&】（相同位都为 1，则为 1；否则为 0）
 * 按位或【|】（相同位有 1，则为 1；否则为 0）
 * 按位异或【^】（相同位不同为 1，相同为 0）
 * 按位取反【~】（0 为 1，1 为 0）
 * 左移【<<】（向左移动，补 0）
 * 带符号右移【>>】（向右移动，补 之前最高位）
 * 无符号右移【>>>】（向右移动，补 0）
 *
 * @author Mingの
 */
public class BitOperation {

    /**
     * 二进制形式打印int类型值
     *
     * @param num int类型的数值
     */
    public static void printBinaryString(int num) {
        for (int i = 31; i >= 0; i--) {
            String bit = ((1 << i) & num) == 0 ? "0" : "1";
            System.out.print(bit);
            if (i % 4 == 0) {
                System.out.print(" ");
            }
        }
    }
}

package ind.liuer.other.randomfunc;

/**
 * 不等固定概率推导出等概率[0,1]
 *
 * @author Mingの
 */
public class EqualProbability10 {

    static int times = 10000000;
    static int[] counts = new int[2];

    public static void main(String[] args) {
        printFun();
        printFGun();
    }

    /**
     * 不等概率
     */
    private static int f() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    private static void printFun() {
        for (int i = 0; i < times; i++) {
            counts[f()]++;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "出现的次数：" + counts[i]);
        }
        counts = new int[2];
        System.out.println("==============================");
    }

    /**
     * 推导出等概率[0,1]
     */
    private static int g() {
        int num;
        do {
            num = f();
        } while (num == f());
        return num;
    }

    private static void printFGun() {
        for (int i = 0; i < times; i++) {
            counts[g()]++;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "出现的次数：" + counts[i]);
        }
        counts = new int[2];
        System.out.println("==============================");
    }
}

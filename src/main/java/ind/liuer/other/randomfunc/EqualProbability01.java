package ind.liuer.other.randomfunc;

/**
 * 等概率[a,b]推导出等概率[c,d]
 *
 * @author Mingの
 */
public class EqualProbability01 {

    static int a = 3;
    static int b = 19;
    static int c = 17;
    static int d = 56;
    static int digit = bitDigit(d);
    static int len = 1 << digit;

    static int times = 10000000;
    static int[] counts = new int[len];

    public static void main(String[] args) {
        printFun();
        printRandomZero2One();
        printGunDao();
        printGun();
    }

    /**
     * 等概率[a,b]
     */
    private static int f() {
        return EqualProbability.randomNum2Num(a, b);
    }

    private static void printFun() {
        for (int i = 0; i < times; i++) {
            counts[f()]++;
        }
        for (int i = a; i < b + 1; i++) {
            System.out.println((i < 10 ? ("0" + i) : i) + "出现的次数：" + counts[i]);
        }
        counts = new int[len];
        System.out.println("==============================");
    }

    /**
     * 推导出等概率[0,1]
     */
    private static int randomZero2One() {
        int count = b - a + 1;
        int mid = a + count / 2;
        int num;
        do {
            num = f();
        } while (count % 2 != 0 && num == mid);
        return num < mid ? 0 : 1;
    }

    private static void printRandomZero2One() {
        for (int i = 0; i < times; i++) {
            counts[randomZero2One()]++;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "出现的次数：" + counts[i]);
        }
        counts = new int[len];
        System.out.println("==============================");
    }

    /**
     * 推导出等概率[0, 2^x]（2^x >= d，x取最小整数）
     */
    private static int gDao() {
        int temp = d - c;
        int tempDigit = bitDigit(temp);

        int num;
        do {
            num = 0;
            for (int i = tempDigit - 1; i >= 0; i--) {
                num += randomZero2One() << i;
            }
        } while (num > 39);
        return num;
    }

    private static void printGunDao() {
        for (int i = 0; i < times; i++) {
            counts[gDao()]++;
        }
        for (int i = 0; i <= d - c; i++) {
            System.out.println((i < 10 ? ("0" + i) : i) + "出现的次数：" + counts[i]);
        }
        counts = new int[len];
        System.out.println("==============================");
    }

    /**
     * 推导出等概率[c,d]
     */
    private static int g() {
        return gDao() + c;
    }

    private static void printGun() {
        for (int i = 0; i < times; i++) {
            counts[g()]++;
        }
        for (int i = c; i <= d; i++) {
            System.out.println((i < 10 ? ("0" + i) : i) + "出现的次数：" + counts[i]);
        }
        counts = new int[len];
        System.out.println("==============================");
    }

    private static int bitDigit(int num) {
        int digit = 0;
        do {
            digit++;
        } while (((1 << digit) - 1) < num);
        return digit;
    }
}

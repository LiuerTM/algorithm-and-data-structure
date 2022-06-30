package ind.liuer.other.randomfunc;

/**
 * 等概率[1,5]推导出等概率[1,7]
 *
 * @author Mingの
 */
public class EqualProbability00 {

    static int times = 10000000;
    static int[] counts = new int[16];

    public static void main(String[] args) {
        printFun();
        printRandomZero2One();
        printGun();
    }

    /**
     * 资源等概率[1,5]
     */
    private static int f() {
        return EqualProbability.randomNum2Num(1, 5);
    }

    private static void printFun() {
        for (int i = 0; i < times; i++) {
            counts[f()]++;
        }
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "出现的次数：" + counts[i]);
        }
        counts = new int[16];
        System.out.println("==============================");
    }

    /**
     * 推导出等概率[0,1]
     */
    private static int randomZero2One() {
        int num;
        do {
            num = f();
        } while (num == 3);
        return num < 3 ? 0 : 1;
    }

    private static void printRandomZero2One() {
        for (int i = 0; i < times; i++) {
            counts[randomZero2One()]++;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "出现的次数：" + counts[i]);
        }
        counts = new int[16];
        System.out.println("==============================");
    }

    /**
     * 推导出目标函数等概率[1,7]
     */
    public static int g() {
        int num;
        do {
            num = (randomZero2One() << 2) + (randomZero2One() << 1) + randomZero2One();
        } while (num == 0);
        return num;
    }

    private static void printGun() {
        for (int i = 0; i < times; i++) {
            counts[g()]++;
        }
        for (int i = 1; i < 8; i++) {
            System.out.println(i + "出现的次数：" + counts[i]);
        }
        counts = new int[16];
        System.out.println("==============================");
    }
}

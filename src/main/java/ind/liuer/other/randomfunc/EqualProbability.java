package ind.liuer.other.randomfunc;

/**
 * 随机函数等概率
 *
 * @author Mingの
 */
public class EqualProbability {

    /**
     * 等概率随机返回[0,1)
     *
     */
    public static double randomZero4One() {
        return Math.random();
    }

    /**
     * 等概率随机返回[0,num)
     *
     * @param num 数值int类型
     */
    public static double randomZero4Num(int num) {
        return Math.random() * num;
    }

    /**
     * 等概率随机返回[0,num]
     *
     * @param num 数值int类型
     */
    public static int randomZero2Num(int num) {
        return (int) (Math.random() * (num + 1));
    }

    /**
     * 等概率随机返回[num0,num1]
     *
     * @param num0 数值int类型
     * @param num1 数值int类型
     */
    public static int randomNum2Num(int num0, int num1) {
        return (int) (Math.random() * (num1 - num0 + 1) + num0);
    }

    /**
     * 概率p -> p^2随机返回[0,1)数值
     */
    public static double randomZero4OnePower2() {
        return Math.max(Math.random(), Math.random());
    }
}

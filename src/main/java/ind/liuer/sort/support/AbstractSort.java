package ind.liuer.sort.support;

/**
 * 排序抽象类
 *
 * @author Mingの
 */
public abstract class AbstractSort implements Sort {

    protected int[] data;
    protected int len;

    public AbstractSort(int[] data) {
        if (data == null) {
            throw new SortException("数据不能为空");
        }
        this.data = data;
        this.len = data.length;
    }

    @Override
    public void sort() {
        print("排序前: ");
        if (data.length > 1) {
            doSort();
        }
        print("排序后: ");
    }

    /**
     * 测试打印
     */
    public void print() {
        print("");
    }

    /**
     * 结果打印
     */
    public void print(String text) {
        System.out.print(text);
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }

    /**
     * 交换两个索引的值
     *
     * @param index0 第一个索引
     * @param index1 第二个索引
     */
    public void swap(int index0, int index1) {
        int temp = data[index0];
        data[index0] = data[index1];
        data[index1] = temp;
    }

    protected abstract void doSort();
}

package ind.liuer.sort;

import ind.liuer.sort.support.AbstractSort;

/**
 * 冒泡排序
 *
 * @author Mingの
 */
public class BubbleSort extends AbstractSort {

    public BubbleSort(int[] data) {
        super(data);
    }

    @Override
    protected void doSort() {
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len - i; j++) {
                if (data[j - 1] > data[j]) {
                    swap(j, j - 1);
                }
            }
            print();
        }
    }

    public static void main(String[] args) {
        int[] data = {6, 9, 3, 4, 8, 5, 1, 0, 2, 7};
        BubbleSort bubbleSort = new BubbleSort(data);
        bubbleSort.sort();
    }
}

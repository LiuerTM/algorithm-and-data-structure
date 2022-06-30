package ind.liuer.sort;

import ind.liuer.sort.support.AbstractSort;

/**
 * 插入排序
 *
 * @author Mingの
 */
public class InsertionSort extends AbstractSort {

    public InsertionSort(int[] data) {
        super(data);
    }

    @Override
    protected void doSort() {
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j] >= data[j - 1]) {
                    break;
                }
                swap(j, j - 1);
            }
            print();
        }
    }

    public static void main(String[] args) {
        int[] data = {6, 9, 3, 4, 8, 5, 1, 0, 2, 7};
        InsertionSort insertionSort = new InsertionSort(data);
        insertionSort.sort();
    }
}

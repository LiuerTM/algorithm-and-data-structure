package ind.liuer.sort;

import ind.liuer.sort.support.AbstractSort;

/**
 * 选择排序
 *
 * @author Mingの
 */
public class SelectionSort extends AbstractSort {

    public SelectionSort(int[] data) {
        super(data);
    }

    @Override
    protected void doSort() {
        for (int i = 0; i < len - 1; i++) {
            int k = i;
            for (int j = i + 1; j < len; j++) {
                if (data[k] > data[j]) {
                    k = j;
                }
            }
            swap(i, k);
            print();
        }
    }

    public static void main(String[] args) {
        int[] data = {6, 9, 3, 4, 8, 5, 1, 0, 2, 7};
        SelectionSort selectionSort = new SelectionSort(data);
        selectionSort.sort();
    }
}

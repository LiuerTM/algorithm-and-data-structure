package ind.liuer.search;

import ind.liuer.search.support.AbstractSearch;

/**
 * @author Mingの
 */
public class BinarySearch extends AbstractSearch {

    public BinarySearch(int[] data) {
        super(data);
    }

    @Override
    protected int doSearch(int num) {
        return binarySearch(num, 0, this.len - 1);
    }

    private int binarySearch(int num, int left, int right) {
        if (left >= right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (this.data[mid] == num) {
            return mid;
        }
        if (this.data[mid] > num) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        return binarySearch(num, left, right);
    }

    public static void main(String[] args) {
        int[] data = {6, 9, 3, 4, 8, 5, 1, 0, 2, 7};
        BinarySearch binarySearch = new BinarySearch(data);
        int index = binarySearch.search(4);
        System.out.println("index = " + index);
        index = binarySearch.search(33);
        System.out.println("index = " + index);
    }
}

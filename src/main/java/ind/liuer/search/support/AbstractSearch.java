package ind.liuer.search.support;

import ind.liuer.sort.InsertionSort;

/**
 * @author Mingの
 */
public abstract class AbstractSearch implements Search {

    protected int[] data;
    protected int len;

    public AbstractSearch(int[] data) {
        if (data == null) {
            throw new SearchException("数据不能为空");
        }
        InsertionSort insertionSort = new InsertionSort(data);
        insertionSort.sort();
        this.data = data;
        this.len = data.length;
    }

    @Override
    public int search(int num) {
        return doSearch(num);
    }

    protected abstract int doSearch(int num);
}

package com.ghulam;

import java.util.Comparator;

public class BubbleSort<E> implements Sort<E>, SortSupport<E> {
    private Swapper swapper;
    private Comparator<E> comparator;

    public BubbleSort() {
        swapper = null;
        comparator = null;
    }

    @Override
    public void sort(Sortable<E> data) {
        int len = data.size();
        while (len > 1) {
            for(int j=0; j<len-1; ++j) {
                if(comparator.compare(data.get(j), data.get(j+1)) > 0) {
                    swapper.swap(j, j+1);
                }
            }
            len--;
        }
    }

    @Override
    public void setSwapper(Swapper swapper) {
        this.swapper = swapper;
    }

    @Override
    public void setComparator(Comparator<E> comparator) {
        this.comparator = comparator;
    }
}

package com.ghulam;

import java.util.Comparator;

public interface SortSupport<E> {
    void setSwapper(Swapper swapper);
    void setComparator(Comparator<E> comparator);
}

package com.mycompany.myselfsolution.taskarray.mergesort;

import java.util.Comparator;

public class MergeSort {
    // CPU: O(nlogn)
    // RAM: O(n)
    public static <T> void mergeSort(final T[] a, Comparator<T> comparator) {
        mergeSort(a, (T[]) new Object[a.length], 0, a.length, comparator);
    }

    private static <T> void mergeSort(final T[] a, final T[] t, final int l, final int r,
                                      Comparator<T> comparator) {
        if (l + 1 == r) {
            return;
        }
        int m = l + (r - l) / 2;
        mergeSort(a, t, l, m, comparator);
        mergeSort(a, t, m, r, comparator);
        merge(a, t, l, m, r, comparator);
    }

    public static <T> T[] merge(final T[] a, final T[] t, final int l,
                                final int m, final int r, Comparator<T> comp) {
        int i = l;
        int j = m;
        int k = 0;
        while (i < m && j < r) {
            t[k++] = comp.compare(a[i], a[j]) <= 0 ? a[i++] : a[j++];
        }
        while (i < m) {
            t[k++] = a[i++];
        }
        while (j < r) {
            t[k++] = a[j++];
        }
        System.arraycopy(t, 0, a, l, r - l);
        return t;
    }
}

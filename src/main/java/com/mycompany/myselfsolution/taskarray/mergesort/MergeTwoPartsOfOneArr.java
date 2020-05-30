package com.mycompany.myselfsolution.taskarray.mergesort;

import java.util.Comparator;

public class MergeTwoPartsOfOneArr {
    public static <T> T[] merge(final T[] a, final T[] t, final int l,
                                 final int m, final int r, Comparator<T> comp) {
        int i = l;
        int j = m;
        int k = 0;
        while (i < m && j < r) {
//            t[k++] = a[i] <= a[j] ? a[i++] : a[j++];
            t[k++] = comp.compare(a[i], a[j]) <= 0 ? a[i++] : a[j++];
        }
        while (i < m) {
            t[k++] = a[i++];
        }
        while (j < r) {
            t[k++] = a[j++];
        }
        System.arraycopy(t, 0, a, l, t.length);
        return t;
    }
}

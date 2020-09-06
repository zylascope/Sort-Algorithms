package com.zylascope.sort_algorithms;

import android.util.Log;

public class Example {
    public static void sort(Comparable[] a)
    {  /* See Algorithms 2.1, 2.2, 2.3, 2.4, 2.5, or 2.7. */  }
    public static boolean  less(Comparable v, Comparable w)
    {  return v.compareTo(w) < 0;  }
    public static void exch(Comparable[] a, int i, int j)
    {  Comparable t = a[i]; a[i] = a[j]; a[j] = t;  }
    public static void show(Comparable[] a)
    {  // Print the array, on a single line.
        Log.i("SHOW","SORTED NUMBERS... ");
        //not showing, remove {} from loop: it does shows 9???
        for (int i = 0; i < a.length; i++) {
            Log.i("SHOW", a[i] + "");
        }
    }
    public static boolean isSorted(Comparable[] a)
    {  // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1]))  return false;
        return true;
    }

}

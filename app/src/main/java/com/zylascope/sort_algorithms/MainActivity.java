package com.zylascope.sort_algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;

class Selection extends Example
{
    public static void sort(Comparable[] a)
    {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            int iMin=i;
            for (int j=i+1; j<n; j++) {
                if (less(a[j], a[iMin])) {
                    iMin = j;
                }
            }
            exch(a, i, iMin);
        }
    }
}

class Insertion extends Example {
    public static void sort(Comparable[] a) {  // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++) {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }
}

    public class MainActivity extends AppCompatActivity {

        int N = 8;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Integer a[] = new Integer[N];
            for (int i = 0; i < N; i++) {
                a[i] = (int) (Math.random() * 100);
            }

            //print rnd numbers array...
            {  // Print the array, on a single line.
                Log.i("SHOW", "RANDOM NUMBERS... ");
                for (int i = 0; i < a.length; i++) {
                    Log.i("SHOW", a[i] + " ");
                }
                //Log.i("SHOW"," ");
            }

//        Selection.sort(a);
//        Selection.show(a);

//        if (Selection.isSorted(a)) {
//            Log.i("SHOW","YES! It's SELECTION sorted.");
//        }


            Insertion.sort(a);
            Insertion.show(a);

            if (Insertion.isSorted(a)) {
                Log.i("SHOW", "YES! It's INSERTION sorted.");
            }

        }
    }

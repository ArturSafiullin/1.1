package ru.job4j;

import com.sun.tools.javac.util.BasicDiagnosticFormatter;

/**
 * Created by artursafiullin on 2017-03-07.
 */
public class Counter {
    int sum;
    public int add(int start, int finish) {
        for (start = 0; start <= finish; start = start + 2) ;
        sum += start;
        return sum;
        //System.out.println(sum);
    }

}

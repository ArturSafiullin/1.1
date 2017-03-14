package ru.job4j.loop;


/**
 * Created by artursafiullin on 2017-03-07.
 */
public class Counter {

    public int add(int start, int finish) {
        int sum = 0;

        for (start = 2; start <= finish; start += 2) {
            if (start % 2 == 0) {
                sum += start;
                System.out.println("Сумма четных чисел равна " + sum);
            }
        }
        return sum;
    }
}

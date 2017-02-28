package ru.job4j;

/**
 * Created by artursafiullin on 2017-02-27.
 */
public class Max {
    public int maxNumber;
    public void max (int first, int second) {
        maxNumber = first > second ? first : second;
        System.out.println("maximum number is " + maxNumber);
    }
}


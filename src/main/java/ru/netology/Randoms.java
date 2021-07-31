package ru.netology;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Igor Khristiuk
 */
public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int thisElement = min;

            @Override
            public boolean hasNext() {
                return thisElement != max;
            }

            @Override
            public Integer next() {
                int dif = max - min;
                thisElement = random.nextInt(dif + 1);
                thisElement += min;

                return thisElement;
            }
        };
    }
}

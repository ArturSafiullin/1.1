package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**

/**
 * Created by artursafiullin on 2017-03-11.
 */
public class PointTest {
    @Test
    public void getPoint(){
        Point checkPoint = new Point(2,1);
        boolean result =checkPoint.is(4, 1);
        assertThat(result, is(8));
        //System.out.println("Point is " + result);
    }

}

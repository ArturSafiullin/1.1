package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**

/**
 * Created by artursafiullin on 2017-02-27.
 */
public class MaxTest {
   @Test
   public void getMaxNumber() {
        Max number = new Max();
        //number.max(12, -98);
        int result = number.max(12, 22);
        assertThat(result, is(22));
    }
}

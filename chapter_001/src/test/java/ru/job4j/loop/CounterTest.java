package ru.job4j.loop;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by artursafiullin on 2017-03-08.
 */
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter evenNum = new Counter();
        evenNum.add(1, 10);
        int sum = evenNum.add(1, 10);
        int expected = 30;
        assertThat(sum, is (expected));
    }
}

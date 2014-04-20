package asbc;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by grimrose on 2014/04/20.
 */
public class ConsumptionTaxTest {

    @Test
    public void _税率8パーセント_100円_108円が返ってくる() throws Exception {
        // Setup
        ConsumptionTax sut = new ConsumptionTax(8);
        // Exercise
        int actual  = sut.apply(100);
        // Verify
        Assert.assertThat(actual, CoreMatchers.is(108));
    }

}


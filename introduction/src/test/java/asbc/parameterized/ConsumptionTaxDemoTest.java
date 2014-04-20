package asbc.parameterized;


import asbc.ConsumptionTax;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class ConsumptionTaxDemoTest {

    @DataPoints
    public static Fixture[] FIXTURES = new Fixture[]{
            new Fixture(5, 100, 105),
            new Fixture(5, 3000, 3150),
            new Fixture(10, 50, 55),
            new Fixture(5, 50, 52),
            new Fixture(3, 50, 52)
    };


    @Theory
    public void _applyで消費税が加算された価格が取得出来る(Fixture fixture) throws Exception {
        // Setup
        ConsumptionTax sut = new ConsumptionTax(fixture.taxRate);
        String desc = "when rate=" + fixture.taxRate + ", price=" + fixture.price;

        // Exercise
        int actual = sut.apply(fixture.price);
        // Verify
        assertThat( actual, is(fixture.expected));
    }

}

class Fixture {
    final int taxRate;
    final int price;
    final int expected;

    Fixture(int taxRate, int price, int expected) {
        this.taxRate = taxRate;
        this.price = price;
        this.expected = expected;
    }
}

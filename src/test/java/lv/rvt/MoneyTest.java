package lv.rvt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {
        @Test
        public void testPlusMethod(){
           Money money1 = new Money(1,3);
           Money money2 = new Money(1,2);
           Money money3 = money1.plus(money2);

           assertTrue(money3.euros()== 7);
}
}

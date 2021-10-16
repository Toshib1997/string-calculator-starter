package calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;




public class StringCalculatorShould {

	@Rule
       public ExpectedException thrown = ExpectedException.none();
    @Test
       public void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals( stringCalculator.add("") , 0);
    }


}

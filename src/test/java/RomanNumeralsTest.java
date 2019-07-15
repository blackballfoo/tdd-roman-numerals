import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralsTest {


    @Test
    public void one(){
        String result = RomanNumerals.arabicToRoman(1);
        assertThat(result,  equalTo("I"));
    }

    @Test
    public void two(){
        String result = RomanNumerals.arabicToRoman(2);
        assertThat(result,  equalTo("II"));
    }
}

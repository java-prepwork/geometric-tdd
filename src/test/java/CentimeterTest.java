import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CentimeterTest{
    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedWithSameOneCentimeter(){
        Centimeter oneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter,is(equalTo(oneCentimeter)));
    }

    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedWithAnotherCentimeter(){
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherOneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter,is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void toCheckInequalityWhenOneCentimeterIsComparedWithTwoCentimeters(){
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter twoCentimeters = new Centimeter(2);

        assertThat(oneCentimeter,is(not(equalTo(twoCentimeters))));
    }
}
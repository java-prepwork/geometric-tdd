package com.sixTwoThree;


import org.junit.jupiter.api.Test;

import static com.sixTwoThree.Length.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CentimeterTest{
    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedWithSameOneCentimeter(){
        Length oneCentimeter = centimeter(1);

        assertThat(oneCentimeter,is(equalTo(oneCentimeter)));
    }

    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedWithAnotherCentimeter(){
        Length oneCentimeter = centimeter(1);
        Length anotherOneCentimeter = centimeter(1);

        assertThat(oneCentimeter,is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void toCheckInequalityWhenOneCentimeterIsComparedWithTwoCentimeters(){
        Length oneCentimeter = centimeter(1);
        Length twoCentimeters = centimeter(2);

        assertThat(oneCentimeter,is(not(equalTo(twoCentimeters))));
    }

    @Test
    void toCheckEqualityWhenOneMeterIsComparedWithHundredCentimeter(){
        Length hundredCentimeter = centimeter(100);
        Length oneMeter = meter(1);

        assertThat(oneMeter,is(equalTo(hundredCentimeter)));
    }

    @Test
    void toCheckInequalityWhenOneMeterIsComparedWithTwoHundredCentimeter()
    {
        Length hundredCentimeter = centimeter(200);
        Length oneMeter = meter(1);

        assertThat(oneMeter,is(not(equalTo(hundredCentimeter))));
    }

    @Test
    void toCheckEqualityWhenZeroPointZeroZeroOneKilometerWithHundredCentimeter()
    {
        Length zeroPointZeroZeroOneKilometer = kilometer(0.001);
        Length hundredCentimeter = centimeter(100);

        assertThat(hundredCentimeter,is(equalTo(zeroPointZeroZeroOneKilometer)));
    }

    @Test
    void toCheckInequalityWhenTwoKilometerWithTwoHundredCentimeter()
    {
        Length twoKilometer = kilometer(2);
        Length twoHundredCentimeter = centimeter(200);

        assertThat(twoHundredCentimeter,is(not(equalTo(twoKilometer))));
    }


}
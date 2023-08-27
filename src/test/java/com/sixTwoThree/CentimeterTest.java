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

    @Test
    void toCheckEqualityWhenOneMeterIsAddedWithHundredCentimeterToGiveTwoHundredCentimeter()
    {
        Length oneMeter = meter(1);
        Length hundredCentimeters = centimeter(100);
        Length twoMeter = meter(2);
//        Length total = addTwoLengths(oneMeter, hundredCentimeters);

        assertThat(oneMeter.plus(hundredCentimeters),is(equalTo(twoMeter)));
    }

    @Test
     void toCheckEqualityWhenTwoHundredCentimeterIsAddedWithOneKilometerToGiveOneLakhTwoHundredCentimeter(){
       Length twoHundredCentimeter = centimeter(200);
       Length oneKilometer = kilometer(1);
       Length oneLakhAndTwoHundredCentimeter = centimeter(100200);

//       Length total = addTwoLengths(twoHundredCentimeter,oneKilometer);

//       assertThat(total,is(equalTo(oneLakhAndTwoHundredCentimeter)));
       assertThat(twoHundredCentimeter.plus(oneKilometer),is(equalTo(oneLakhAndTwoHundredCentimeter)));

//       assertThat(twoHundredCentimeter,plus(oneKilometer));
    }

    @Test
    void toCheckEqualityWhenFiftyCentimeterIsSubtractedWithOneMeterToGiveZeroPointFiveMeter(){
        Length oneMeter = meter(1);
        Length fiftyCentimeter = centimeter(50);
        Length zeroPointFiveMeter = meter(0.5);

        assertThat(oneMeter.minus(fiftyCentimeter),is(equalTo(zeroPointFiveMeter)));
    }

    @Test
    void toCheckEqualityWhenOneMeterIsSubtractedWithTwoThousandCentimeterToGiveThousandNineHundredMeter(){
        Length twoThousandCentimeter = centimeter(2000);
        Length oneMeter = meter(1);
        Length thousandAndNineHundredCentimeter = centimeter(1900);

        assertThat(twoThousandCentimeter.minus(oneMeter),is(equalTo(thousandAndNineHundredCentimeter)));
    }



}
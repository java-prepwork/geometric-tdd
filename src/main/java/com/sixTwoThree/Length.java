package com.sixTwoThree;
public class Length{



    private static class Unit{
        private final double baseFactor;
        private static final Unit M = new Unit(1);
        private static final Unit CM = new Unit(0.01);
        private static final Unit KM = new Unit(1000);

        Unit(double baseFactor)
        {
            this.baseFactor = baseFactor;
        }
    }

    private final Unit unit;
    private final double magnitude;
     public static Length centimeter(double magnitude){
         return new Length(magnitude, Unit.CM);
     }

    public static Length meter(double magnitude){
        return new Length(magnitude, Unit.M);
    }

    public static Length kilometer(double magnitude) {
        return new Length(magnitude, Unit.KM);
    }

     public Length(double magnitude, Unit unit)
     {
         this.magnitude = magnitude;
         this.unit = unit;
     }

     private double convertToUnit(Unit toUnit)
     {
         return magnitude * (unit.baseFactor / toUnit.baseFactor);
     }

//    public static Length addTwoLengths(Length firstParameter,Length secondParameter)
//    {
//        return new Length(firstParameter.convertToBase() + secondParameter.convertToBase(),Unit.M );
//    }

    public Length plus(Length lengthToBeAdded)
    {
        double resultMagnitude = magnitude + lengthToBeAdded.convertToUnit(unit);
        return new Length(resultMagnitude, unit);
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(this.getClass() != obj.getClass())
        {
            return false;
        }
        return convertToUnit(Unit.M) == ((Length) obj).convertToUnit(Unit.M);
    }


}

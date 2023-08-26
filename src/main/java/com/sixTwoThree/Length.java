package com.sixTwoThree;
public class Length{

    private final Unit unit;
    private final double magnitude;

    private static class Unit{
        private final double baseFactor;
        static Unit M = new Unit(1);
        static Unit CM = new Unit(0.01);
        static Unit KM = new Unit(1000);

        Unit(double baseFactor)
        {
            this.baseFactor = baseFactor;
        }
    }
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

     private double convertToBase()
     {
         return magnitude* (unit.baseFactor * Unit.M.baseFactor);
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
        return convertToBase() == ((Length) obj).convertToBase();
    }
}
//class Centimeter{
//    private final int magnitude;
////    Centimeter(int magnitude)
////    {
////        super(magnitude);
////    }
//
//    Centimeter(int magnitude)
//    {
//        this.magnitude = magnitude;
//    }
//
//    public int getMagnitude() {
//        return magnitude;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//       if (this == obj)
//       {
//           return true;
//       }
//       if (this.getClass() != obj.getClass())
//       {
//           return false;
//       }
////       Centimeter that = (Centimeter) obj;
//        return this.magnitude == ((Centimeter) obj).magnitude;
//    }
//}
//class Meter{
//    private final int magnitude;
////    Meter(int magnitude)
////    {
////        super(magnitude);
////    }
//
//    Meter(int magnitude)
//    {
//        this.magnitude = magnitude;
//    }
//
//    public boolean isMeterCentimeterEquals(int meterMagnitude, int centimeterMagnitude)
//    {
//
//        return centimeterMagnitude/100 == meterMagnitude;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        return isMeterCentimeterEquals(this.magnitude, ((Centimeter) obj).getMagnitude());
//    }
//}
public class Centimeter{
    private final int magnitude;

    Centimeter(int magnitude)
    {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj)
       {
           return true;
       }
       if (this.getClass() != obj.getClass())
       {
           return false;
       }
//       Centimeter that = (Centimeter) obj;
        return this.magnitude == ((Centimeter) obj).magnitude;
    }
}
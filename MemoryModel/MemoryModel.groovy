public class testerClass
{
  public static void main(String[] args) {
      primitiveTypeModel()
      objectMemoryModel()
      arrayLocationModel()
  }

  private static primitiveTypeModel()
  {
    //Primitive Data Types are boolean, byte, short, int, long,
    //float, double, char
    int var1 = 17
    int var2 = var1 + 1
    var1 = var2 +1
    println("Var1 : " + var1 + ", Var2 :" + var2)
  }

  private static objectMemoryModel()
  {
    //Everything else other than Primitive Type Data are objects
    //objects get created in heap and a reference is stored in the variables
    int var1 = 52
    SimpleLocation ucsd
    ucsd = new SimpleLocation(32.9, -117.2)
    SimpleLocation lima = new SimpleLocation(0,-77.0)
    lima.longitude = var1
    println("Longitude for ucsd : " + ucsd.longitude + ", Latitude for ucsd : " + ucsd.lattitude)
    println("Longitude for lima : " + lima.longitude + ", Latitude for lima : " + lima.lattitude + "\n")

    // Here the constructor is getting the parameters by value and hence there wont be object reference.
    SimpleLocation bang = new SimpleLocation(82.0, var1)
    // Though an object has been used as the object is passed by reference the value will be stored separately wtihout any link between bang and dc lattitudes.
    SimpleLocation dc = new SimpleLocation(-45.4, bang.lattitude)
    println("Longitude for bang : " + bang.longitude + ", Latitude for bang : " + bang.lattitude)
    println("Longitude for dc : " + dc.longitude + ", Latitude for dc : " + dc.lattitude + "\n")

    ucsd = bang
    //After this statement the ucsd has location for object referenced by bang. And object previously referenced by ucsd is lost.
    ucsd.longitude = -8.3
    //Any change is ucsd or bang referenced object is change to same object. Hence the same object can be accessed by both the variable name and changes done via one will be reflected when other is accessed.
    println("Longitude for bang : " + bang.longitude + ", Latitude for bang : " + bang.lattitude)
    println("Longitude for ucsd : " + ucsd.longitude + ", Latitude for ucsd : " + ucsd.lattitude + "\n")
  }

  private static arrayLocationModel() {
    double[] long_lat = [5.0, 0.0]
    ArrayLocation arrayLoc1 = new ArrayLocation(long_lat )
    println("Longitude of Location1 : " + arrayLoc1.getLongitude() + ", Lattitude of Location1 : " + arrayLoc1.getLattitude())
    long_lat[0] = -25.0
    long_lat[1] = 55.2
    println("Longitude of Location1 : " + arrayLoc1.getLongitude() + ", Lattitude of  Location1 : " + arrayLoc1.getLattitude() + "\n")

    double[] long_lat2= [0,0]
    ArrayLocation arrayLoc2 = new ArrayLocation(long_lat2 )
    println("Longitude of Location2 : " + arrayLoc2.getLongitude() + ", Lattitude of Location2 : " + arrayLoc2.getLattitude())
    long_lat2[0] = -70.0
    long_lat2[1] = 155.2
    println("Longitude of Location2 : " + arrayLoc2.getLongitude() + ", Lattitude of Location2 : " + arrayLoc2.getLattitude())
  }

}

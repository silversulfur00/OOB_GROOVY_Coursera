public class ArrayLocation {
  private double[] coords;
  public ArrayLocation(double[] coords)
  {
    this.coords = coords
  }

  public ArrayLocation(double lng, double latd)
  {
    this.coords[0] = lng
    this.coords[1]= latd
  }
  public getLongitude()
  {
    return coords[0]
  }

  public getLattitude()
  {
    return coords[1]
  }
}

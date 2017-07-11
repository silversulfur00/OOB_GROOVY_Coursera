public class SimpleLocation {
  //Member Variables
  //The access keyword decides where and how the member variables will be available outside the class.
  //Member variables are available inside through out the class.
  public double longitude;
  public double lattitude;
  //Parameter variables are more or less like local variables but as they are for functions/methods they are visible though out the method.
  public SimpleLocation(double longitude, double lattitude) {
    //local variables are those which are local to a section.
    //Below mentioned variables are method variables and accessible through out the method.
    //But there could be local variables to a loop, an if else condition as well.
    // Variables defined between {} will mostly have access between the {}.
    this.longitude = longitude;
    this.lattitude = lattitude;
  }
}

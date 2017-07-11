public class test
{
  private int a;
  public double b;

  public test(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  public static void main(String[] args)
  {
    test c1 = new test(10, 20.5);
    test c2 = new test(10, 31.5);
    System.out.println(c1.a + ", " + c1.b);
  }
}

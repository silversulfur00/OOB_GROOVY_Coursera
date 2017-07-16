/*public class MyClass
{
  private int a;
  public double b;

  public MyClass(int first, double second)
  {
    this.a = first;
    this.b = second;
  }

  // new method
  public static void incrementBoth(MyClass c1) {
    c1.a = c1.a + 1;
    c1.b = c1.b + 1.0;
  }

  public static void main(String[] args)
  {
    MyClass c1 = new MyClass(10, 20.5);
    MyClass c2 = new MyClass(10, 31.5);
    // different code below
    incrementBoth(c2);
    System.out.println(c1.a + ", "+ c2.a);
  }
}*/

//Class2 Test
/*public class MyClass1
{
  private int a;
  public double b;

  public MyClass1(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  public static void main(String[] args)
  {
    MyClass1 c1 = new MyClass1(10, 20.5);
    MyClass1 c2 = new MyClass1(10, 31.5);
    // lines below are changed from the question above
    c2 = c1;
    c1.a = 2;
    System.out.println(c2.a);
  }
}*/

//Class 3 Test
/*public class MyClass
{
  private int a;
  public double b;

  public MyClass(int first, double second)
  {
    this.a = first;
    this.b = second;
  }

  // new method
  public static void incrementBoth(MyClass c1) {
    c1.a = c1.a + 1;
    c1.b = c1.b + 1.0;
  }
  public static void main(String[] args)
  {
    MyClass c1 = new MyClass(10, 20.5);
    MyClass c2 = new MyClass(10, 31.5);
    // different code below
    incrementBoth(c2);
    System.out.println(c1.a + ", "+ c2.a);
  }
}*/


//Class 4 test
public class MyClass
{
  private int a;
  public double b;

  public MyClass(int first, double second)
  {
    this.a = first;
    this.b = second;
  }

  public static void incrementBoth(MyClass c1) {
    c1.a = c1.a + 1;
    c1.b = c1.b + 1.0;
  }

  // new method
  public static void incrementA(int first)
  {
    first = first + 1;
  }

  // new method
  public static void incrementB(double second)
  {
    second = second + 1.0;
  }

  public static void main(String[] args)
  {
    MyClass c1 = new MyClass(10, 20.5);
    MyClass c2 = new MyClass(10, 31.5);
    // different code below
    incrementA(c2.a);
    incrementB(c2.b);
    System.out.println(c2.a + ", "+ c2.b);
  }
}
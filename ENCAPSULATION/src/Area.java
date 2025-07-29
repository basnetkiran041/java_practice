class Rectangle {
  private int length;
  private int breadth;

  public int getlength() {
      return length;
  }

  public void setlength(int l) {
      this.length = l;

  }

  public int getbreadth() {
      return breadth;
  }

  public void setbreadth(int b) {
      this.breadth = b;

  }

}
public class Area{
  public static void main(String[] args) {
      Rectangle r = new Rectangle();
      r.setlength(5);
      r.setbreadth(6);
      int area = r.getlength()*r.getbreadth();
      System.out.println("Area of rectangle is : "+ area);
  }

  

}
public class getterSetter {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setBreadth(6);

        int l = rect.getLength();
        int b = rect.getBreadth();
        System.out.println(l*b);
       
        
    }
}
 class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){
        return length;

    }
    public void setLength(int l){
        this.length =l;
    }
        public int getBreadth(){
        return breadth;

    }
    public void setBreadth(int b){
        this.breadth =b;
    }



}
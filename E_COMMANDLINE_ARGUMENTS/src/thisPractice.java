public class thisPractice {
    public static void main(String[] args) {
        Practice pr = new Practice();
        pr.setName("Kiran");
        pr.setAge(19);
        System.out.println("My details:"+" "+ "Name:"+pr.getAge()+"Age:"+pr.getAge());
}
}
class Practice{
    String name;
    int age;

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a){
        this.age = a;
    }

}
public class getter_setter {
    private String Author;
    private String Book;

    public String getAuthor()
    {
        return Author;
    }
    public void setAuthor(String a)
    {
        this.Author = a;
    }
    
    public String getBook()
    {
        return Book;

    }
    public void setBook(String bk)
    {
        this.Book = bk;
    }

    public static void main(String[] args) {
        
        getter_setter a = new getter_setter();
        a.setAuthor("Haruki Murakami");
        a.setBook("Norweign wood");
        System.out.println(a.getAuthor()  + "  "+"and" +"  "  +a.getBook());

    

        
    }
}
    

class Book{
    protected String title,author,ISBN;
    Book(String title,String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}
class EBook extends Book{
    public int file_size;
    EBook(String title,String author, String ISBN,int file_size){
        super(title, author, ISBN);
        this.file_size = file_size;
    }

    public void print(){
        System.out.println("Title:- "+this.title);
        System.out.println("author:- "+this.author);
        System.out.println("ISBN:- "+this.ISBN);
        System.out.println("file size:- "+file_size+" mb");
    }

}
public class q1 {
    public static void main(String[] args) {
        EBook e = new EBook("mahesh","Musaif", "123",40);
        e.print();
        
    }
}

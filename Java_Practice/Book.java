package Java_Practice;

public class Book {
    static int totalbooks;
    String title, isbn, author;
    boolean isborrowd;
    static {
        totalbooks=0;
    }
    {
        totalbooks++; //object inisilization
    }
Book(String isbn,String title,String author){
        this.author=author;
        this.isbn=isbn;
        this.title=title;
}
Book(String isbn){
        this(isbn,"unknow","unknwon");
}        static int getTotalbooks(){
        return totalbooks;
    }
    void borrowbook() {
        if (isborrowd) System.out.println("Book is already borrowed");
        else  this.isborrowd=true;{
            System.out.println("Enjoy the book "+this.title);
        }
    }   void returnBook(){
        if(isborrowd){
            this.isborrowd=false;
            System.out.println("Hope you enjoyed the book" + this.title);
        } else {
            System.out.println("Book is already in library");
        }
    } public static void main(String[] args) {
       Book ramayan=new Book("B100");
       ramayan.title="ramayan";
       ramayan.author="Balmiki";
       ramayan.borrowbook();
       Book harrypoter=new Book("B1001","HarryPotter","JK Rowling");
       Book.getTotalbooks();
       harrypoter.borrowbook();
       harrypoter.returnBook();
       Book atitude=new Book("B1002");
       System.out.println(Book.getTotalbooks());
    }
}
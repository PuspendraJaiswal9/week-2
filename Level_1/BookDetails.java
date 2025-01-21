class Book{
      //Data Member

      private static String libraryName;
      public String displayLibraryName(String libraryName){
        this.libraryName=libraryName;
        return libraryName;
      }
      
      private static String title;
      private static String author;
      private final String isbn;

      Book(String title,String author,String isbn){
          this.title=title;
          this.author=author;
          this.isbn=isbn;
      }

      public void displayInstanceOf(){
           if(this instanceof Book){
              System.out.println("The title is :"+title);
              System.out.println("The author is :"+author);
              System.out.println("The isbn is :"+isbn); 
           }else{
              System.out.println("This object is not an instanceof Book:");
           }
      }
      
}

public class BookDetails{
       public static void main(String args[]){
        Book book1 = new Book("Marvel comics","Stan lee","1234567890123");
        System.out.println("Librabry Name is :"+book1.displayLibraryName("TitLibraryScience"));
        book1.displayInstanceOf();
        Book book2 = new Book("Pirates of the Caribbean" , "Jerry Bruckheimer","1234567890987");
        System.out.println("Librabry Name is :"+book2.displayLibraryName("TitLibraryAdvance"));
        book2.displayInstanceOf();
       }
}
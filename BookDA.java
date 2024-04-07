import java.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class BookDA {
  private HashMap<String, Book> bookMap;

  public HashMap<String, Book> getBookMap(){
    return bookMap;
  }

  public BookDA() throws FileNotFoundException{
    bookMap = new HashMap<>();

    try (Scanner inputFile = new Scanner(new FileReader("Book.csv"))){

            while (inputFile.hasNextLine()){
            String[] splitData = inputFile.nextLine().split(",");
            if (splitData.length < 3) {
            continue; 
            }
            Book book = new Book();
            book.setIsbn(splitData[0].trim());
            book.setTitle(splitData[1].trim());
            book.setAuthorName(splitData[2].trim());
            bookMap.put(book.getIsbn(), book);
            }      
        }
    }
}

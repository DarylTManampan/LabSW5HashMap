import java.io.FileNotFoundException;
import java.util.Map;

public class Report {

  public static void main(String[] args) throws FileNotFoundException {
    BookDA bookDA = new BookDA();
    Map<String, Book> bookMap = bookDA.getBookMap();

    AuthorDA authorDA = new AuthorDA();
    Map<String, Author> authorMap = authorDA.getAuthorMap();

    for (Map.Entry<String, Book> entryMap : bookMap.entrySet()) {
      Book book = entryMap.getValue();
      String authorName = book.getAuthorName();
      Author author = authorMap.get(authorName);
      String authorBio = author.getBio();

      System.out.println("\n" + entryMap.getValue().getIsbn() + " "+ entryMap.getValue().getTitle());
      System.out.println("\t" + entryMap.getValue().getAuthorName() + " - " + authorBio + "\n");
    }
  }
}

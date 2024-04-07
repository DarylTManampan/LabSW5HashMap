import java.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class AuthorDA {
  private HashMap<String, Author> authorMap;

  public HashMap<String, Author> getAuthorMap(){
    return authorMap;
  }

  public AuthorDA() throws FileNotFoundException{
    authorMap = new HashMap<>();

    try (Scanner inputFile = new Scanner(new FileReader("Author.csv"))){

            while (inputFile.hasNextLine()){
            String[] splitData = inputFile.nextLine().split(",");
            if (splitData.length < 2){
            continue; 
            }
            Author author = new Author();
            author.setName(splitData[0].trim());
            author.setBio(splitData[1].trim());
            authorMap.put(author.getName(), author);
            }      
        }
    }
}

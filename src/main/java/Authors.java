import java.util.List;

public interface Authors {

    // get a list of all the authors
    List<Author> all();

    Author getAuthorById(long id);
    // insert a new author and return the new ad's id
    long insert(Author author);

}

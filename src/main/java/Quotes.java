import java.util.List;

public interface Quotes {
    // get a list of all the ads
    List<Quote> all();
    // insert a new ad and return the new ad's id
    void insert(Quotes quote);
}

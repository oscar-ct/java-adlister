import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        System.out.println();

        Album albumOne = new Album(1, "Michael Jackson", "Thriller", 2001, 40.2, "Pop");
        Album albumTwo = new Album(1, "Pink Floyd", "The Dark Side Of The Moon", 1977, 50.2, "Rock");

        ArrayList<Album> array = new ArrayList<>();
        array.add(albumOne);
        array.add(albumTwo);

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).getArtist() + ", ");
            System.out.println(array.get(i).getName());
        }

        System.out.println();

        Author authorOne = new Author(1, "Stephen", "King");
        Author authorTwo = new Author(2, "Mark", "Twain");


        Quotes quoteOne = new Quotes(1, authorOne, "Books are a uniquely portable magic");
        Quotes quoteTwo = new Quotes(2, authorTwo, "Always obey your parents when they are present");


        ArrayList<Quotes> quoteArray = new ArrayList<>();

        quoteArray.add(quoteOne);
        quoteArray.add(quoteTwo);

        for (int i = 0; i < quoteArray.size(); i++) {
            System.out.print(quoteArray.get(i).getAuthor().getFirstName() + " ");
            System.out.print(quoteArray.get(i).getAuthor().getLastName() + ": ");
            System.out.println("'" + quoteArray.get(i).getContent() + "'");
        }
























    }

}

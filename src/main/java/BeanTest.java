import java.io.Serializable;
import java.util.ArrayList;

public class BeanTest{
    public static void main(String[] args) {
        Author author1 = new Author("Nelson", "Mandela");
        Quote quote1 = new Quote("It always seems impossible until it's done.", author1);
        Quote quote2 = new Quote("Everyone can rise above their circumstances and achieve success if they are dedicated to and passionate about what they do.", author1);
        Quote quote3 = new Quote("A winner is a dreamer who never gives up.", author1);


        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for (Quote quote : quotes){
            System.out.println(quote.getContent());
        }
    }

}

import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.Scanner;

public class TVShowMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TvShow> list = new ArrayList<>();
        TvShow seinfield = new TvShow();
        list.add(seinfield);
        TvShow spongebob = new TvShow("Spongebob");
        list.add(spongebob);
        TvShow friends = new TvShow("Friends", 100);
        list.add(friends);
        TvShow thrones = new TvShow("Game of Thrones","Action");
        list.add(thrones);
        TvShow rocket = new TvShow("Rocket Power", 110,"Cartoon");
        list.add(rocket);
        while(true) {
            System.out.println("Name a TV show:");
            String TvName = scan.nextLine();
            if(TvName.equals("")){
                break;
            }
            System.out.println("How many episodes does it have?");
            String epi = scan.nextLine();
            int numOfEpi = Integer.parseInt(epi);
            System.out.println("What is the genre?");
            String genre = scan.nextLine();
            list.add(new TvShow(TvName, numOfEpi, genre));
        }
        for (TvShow tvShow : list) {
            System.out.println(tvShow.toString());
        }
    }
}

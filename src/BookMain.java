import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Books> list = new ArrayList<>();
        Books moby = new Books();
        list.add(moby);
        Books hamlet = new Books("Hamlet");
        list.add(hamlet);
        Books gatsby = new Books("The Great Gatsby", 200);
        list.add(gatsby);
        Books wizard = new Books("Harry Potter", 1999);
        list.add(wizard);
        Books seuss = new Books("Green Eggs and Ham", 15, 1960);
        list.add(seuss);
        while (true) {
            System.out.println("What is the name of favorite books?");
            String title = input.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("How many pages are there?");
            String num = input.nextLine();
            int pageNum = Integer.parseInt(num);
            System.out.println("What year was it published?");
            String year = input.nextLine();
            int pubYear = Integer.parseInt(year);
            list.add(new Books(title, pageNum, pubYear));
        }

        System.out.println("Now what details do you want to know about the books? Name or Everything?");
        String details;
        while (true) {
            details = input.nextLine();
            if(!details.equalsIgnoreCase("Everything") && !details.equalsIgnoreCase("name")) {
                System.out.println("Please enter Everything or Name!");
            }
            else {
                break;
            }
        }
        for (Books books : list) {
            if (details.equalsIgnoreCase("Everything")) {
                System.out.println(books.toString(details));
            } else if (details.equalsIgnoreCase("Name")) {
                System.out.println(books.toString(details));
            }
        }

    }
}

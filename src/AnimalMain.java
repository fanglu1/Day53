import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> list = new ArrayList<>();
        Animal dog = new Animal();
        list.add(dog);
        Animal oakley = new Animal("Oakley");
        list.add(oakley);
        Animal puppy = new Animal(true);
        list.add(puppy);
        Animal buddy = new Animal("Buddy", true);
        list.add(buddy);
        while (true) {
            System.out.println("Please enter a name: ");
            String dogName = input.nextLine();
            if (dogName.equals("")) {
                break;
            }
            System.out.println("Is it a dog? Yes or No: ");
            String isDog = input.nextLine();
            boolean dogOrNah;
            if (isDog.equalsIgnoreCase("")) {
                break;
            }
            dogOrNah = isDog.equalsIgnoreCase("Yes");
            list.add(new Animal(dogName, dogOrNah));
        }
        for (Animal animal : list) {
            System.out.println(animal.toString());
        }
    }
}

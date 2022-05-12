public class Animal {
    private String dogName;
    private boolean dogOrNah;

    public Animal (){

    }

    public Animal (String dogName) {
        this.dogName = dogName;
        this.dogOrNah = true;
    }
    public Animal (boolean dogOrNah){
        this.dogOrNah = dogOrNah;
    }
    public Animal (String dogName, boolean dogOrNah) {
        this.dogName = dogName;
        this.dogOrNah = dogOrNah;
    }

    public String getDogName() {
        return dogName;
    }

    public Boolean getDogOrNah() {
        return dogOrNah;
    }
    public String toString() {
        return getDogName() + " is a dog: " + getDogOrNah();
    }

}

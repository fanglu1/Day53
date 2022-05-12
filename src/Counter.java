public class Counter {
    private int number;

    public Counter(int startValue){
        this.number = startValue;
    }
    public Counter(){
        this.number = 0;
    }
    public int value(){
        return number;
    }
    public void increase(){
        this.number += 1;
    }
    public void decrease(){
        this.number -= 1;
    }
    public void increaseBy(int increase) {
        if(number < 0){
           this.number += 0;;
        }
        else {
            this.number += increase;
        }
    }
    public void decreaseBy(int decrease) {
        if (number < 0){
            this.number -= 0;
        }
        else {
            this.number -= decrease;
        }
    }

    public int getNumber() {
        return number;
    }
    public String toString() {
        return "The number is: " + getNumber();
    }
}


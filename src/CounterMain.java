public class CounterMain {
    public static void main(String[] args){
        Counter newNum = new Counter(1);
        System.out.println(newNum.toString());
        Counter zeroNum = new Counter();
        System.out.println(zeroNum.toString());
        System.out.println(newNum.value());
        System.out.println(zeroNum.value());
        newNum.increase();
        System.out.println(newNum);
        newNum.decrease();
        System.out.println(newNum);
        newNum.increaseBy(2);
        System.out.println(newNum);
        newNum.decreaseBy(2);
        System.out.println(newNum);
        zeroNum.increase();
        System.out.println(zeroNum);
        zeroNum.decrease();
        System.out.println(zeroNum);
        zeroNum.increaseBy(5);
        System.out.println(zeroNum);
        zeroNum.decreaseBy(80);
        System.out.println(zeroNum);
    }
}

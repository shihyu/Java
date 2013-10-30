package cc.openhome;

public abstract class GuessGame {
    public void go() {
        int number = (int) (Math.random() * 10); 
        int guess;
        do {
            print("輸入數字：");
            guess = nextInt();
        } while(guess != number);
        println("猜中了");
    }
    
    public abstract void print(String text);
    public abstract void println(String text);
    public abstract int nextInt();
}

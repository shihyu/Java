package cc.openhome;

public class MatchDemo {
    public static void main(String[] args) {
        String[] numbers = {
            "0970-123456",
            "0988-987-654",
            "0939100391",
            "0970-398888"
        };
        for(String number : numbers) {
            if(number.matches("\\d{4}-\\d{6}")) {
                System.out.println(number);
            }
        }
    }
}

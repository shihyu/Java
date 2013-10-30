package cc.openhome;

public class SplitDemo {
    public static void main(String[] args) {
        // 根據逗號切割
        for(String token : "Justin,Monica,Irene".split(",")) {
            System.out.println(token);
        }
        // 根據Orz切割
        for(String token : "JustinOrzMonicaOrzIrene".split("Orz")) {
            System.out.println(token);
        }
        // 根據Tab字元切割
        for(String token : "Justin\tMonica\tIrene".split("\\t")) {
            System.out.println(token);
        }
    }
} 

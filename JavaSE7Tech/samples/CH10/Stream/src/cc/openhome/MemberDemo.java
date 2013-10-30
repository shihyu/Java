package cc.openhome;

public class MemberDemo {
    public static void main(String[] args) {
        Member[] members = {new Member("B1234", "Justin", 90), 
                            new Member("B5678", "Monica", 95), 
                            new Member("B9876", "Irene", 88)};
        for(Member member : members) {
            member.save();
        }
        System.out.println(Member.load("B1234"));
        System.out.println(Member.load("B5678"));
        System.out.println(Member.load("B9876"));
    }
}

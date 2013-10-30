package cc.openhome;

import java.io.*;

public class Member {
    private String number;
    private String name;
    private int age;

    public Member(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", number, name, age);
    }
    
    public void save() {
        try(DataOutputStream output = 
                new DataOutputStream(new FileOutputStream(number))) {
            output.writeUTF(number);
            output.writeUTF(name);
            output.writeInt(age);
        } catch(IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static Member load(String number) {
        Member member = null;
        try(DataInputStream input = 
                new DataInputStream(new FileInputStream(number))) {
            member = new Member(
                    input.readUTF(), input.readUTF(), input.readInt());
        } catch(IOException ex) {
            throw new RuntimeException(ex);
        }
        return member;
    }
}

package cc.openhome;

import java.util.*;

class Student2 {
    private String name;
    private String number;
    Student2(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student2 other = (Student2) obj;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 13 * hash + (this.number != null ? this.number.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString()  {
        return String.format("(%s, %s)", name, number);
    }
}

public class Students2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Student2("Justin", "B835031"));
        set.add(new Student2("Monica", "B835032"));
        set.add(new Student2("Justin", "B835031"));
        System.out.println(set);
    }
}

package cc.openhome;

import java.util.regex.*;

public class PatternMatcherDemo {
    public static void main(String[] args) {
        String[] regexs = {".*foo", ".*?foo", ".*+foo"};
        for(String regex : regexs) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher("xfooxxxxxxfoo");
            System.out.printf("%s find ", pattern.pattern());
            while(matcher.find()) {
                System.out.printf(" \"%s\"", matcher.group());
            }
            System.out.println(" in \"xfooxxxxxxfoo\".");
        }
    }
}

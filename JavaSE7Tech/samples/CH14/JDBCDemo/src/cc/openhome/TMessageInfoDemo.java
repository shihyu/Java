package cc.openhome;

import java.io.IOException;

public class TMessageInfoDemo {
    public static void main(String[] args) 
            throws IOException, ClassNotFoundException {
        TMessageInfo tMessageInfo = 
                new TMessageInfo(new SimpleConnectionPoolDataSource());
        System.out.println("名稱\t型態\t為空\t預設");
        for(ColumnInfo columnInfo : tMessageInfo.getAllColumnInfo()) {
            System.out.printf("%s\t%s\t%s\t%s%n",
                    columnInfo.getName(),
                    columnInfo.getType(),
                    columnInfo.isNullable(),
                    columnInfo.getDef());
        }
    }
}

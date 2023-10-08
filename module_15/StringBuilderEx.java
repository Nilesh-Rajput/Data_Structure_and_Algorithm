package module_15;

import javax.sql.rowset.spi.SyncResolver;

public class StringBuilderEx {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
        sb.append(ch);
        }
        System.out.println(sb);
    }
}

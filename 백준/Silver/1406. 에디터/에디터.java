import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> list = new LinkedList<>();
        String s = br.readLine();
        for(int i=0;i<s.length();i++) {
            list.add(s.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());
        ListIterator<Character> cursor = list.listIterator(list.size());
        for(int i=0;i<n;i++) {
            String order = br.readLine();
            switch (order.charAt(0)) {
                case 'L' : if(cursor.hasPrevious()) cursor.previous(); break;
                case 'D' : if(cursor.hasNext()) cursor.next(); break;
                case 'B' : if(cursor.hasPrevious()) { cursor.previous(); cursor.remove(); } break;
                case 'P' : cursor.add(order.charAt(2));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : list) {
            bw.write(ch);
        }
        bw.close();
    }
}
import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i)); //연결 리스트에 문자열 각각 추가
        }

        ListIterator<Character> curser = list.listIterator();
        while (curser.hasNext()) {
            curser.next();
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input.charAt(0)) {
                case 'L':
                    if (curser.hasPrevious()) {
                        curser.previous();
                    }
                    break;
                case 'D':
                    if (curser.hasNext()) {
                        curser.next();
                    }
                    break;
                case 'B':
                    if (curser.hasPrevious()) {
                        curser.previous();
                        curser.remove();
                    }
                    break;
                case 'P':
                    curser.add(st.nextToken().charAt(0));
            }
        }

        for(Character chr : list) {
            bw.write(chr);
        }

        bw.flush();
        bw.close();
    }
}
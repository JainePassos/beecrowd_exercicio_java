package ex1146;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SequenciasCrescentes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X;

        while ((X = Integer.parseInt(br.readLine())) != 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    sb.append(i).append("\n");
                } else {
                    sb.append(i).append(" ");
                }
            }

            System.out.print(sb);
        }

        br.close();
    }
}

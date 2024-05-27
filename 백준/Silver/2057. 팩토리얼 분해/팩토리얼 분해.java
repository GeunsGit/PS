import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(in.readLine());
        long[] arr = new long[21];
        arr[0] = 1;
        for (int i = 1; i <= 20; i++) {
            arr[i] = arr[i - 1] * i;
        }

        if (N == 0) {
            System.out.print("NO");
            return;
        }

        for (int i = 20; i >= 0; i--) {
            if (N >= arr[i]) {
                N -= arr[i];
            }
        }

        if (N == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
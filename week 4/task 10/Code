import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
    // Write your code here
    
    int m = matrix.size();
    int n = matrix.get(0).size();

    int[][] result = new int[m][n];

    for (int layer = 0; layer < Math.min(m, n) / 2; layer++) {

        List<Integer> elements = new ArrayList<>();

        // Top row: left to right
        for (int j = layer; j < n - layer; j++) {
            elements.add(matrix.get(layer).get(j));
        }

        // Right column: top to bottom
        for (int i = layer + 1; i < m - layer; i++) {
            elements.add(matrix.get(i).get(n - layer - 1));
        }

        // Bottom row: right to left
        for (int j = n - layer - 2; j >= layer; j--) {
            elements.add(matrix.get(m - layer - 1).get(j));
        }

        // Left column: bottom to top
        for (int i = m - layer - 2; i > layer; i--) {
            elements.add(matrix.get(i).get(layer));
        }

        int len = elements.size();
        int rotation = r % len;

        int index = rotation;

        // Top row
        for (int j = layer; j < n - layer; j++) {
            result[layer][j] = elements.get(index);
            index = (index + 1) % len;
        }

        // Right column
        for (int i = layer + 1; i < m - layer; i++) {
            result[i][n - layer - 1] = elements.get(index);
            index = (index + 1) % len;
        }

        // Bottom row
        for (int j = n - layer - 2; j >= layer; j--) {
            result[m - layer - 1][j] = elements.get(index);
            index = (index + 1) % len;
        }

        // Left column
        for (int i = m - layer - 2; i > layer; i--) {
            result[i][layer] = elements.get(index);
            index = (index + 1) % len;
        }
    }

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {

            if (j > 0) {
                System.out.print(" ");
            }

            System.out.print(result[i][j]);
        }

        System.out.println();
    }
}

    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}

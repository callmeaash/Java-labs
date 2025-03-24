public class Question5 {
    public static void main(String[] args) {
        int[][] jaggedArr = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        int sum;
        System.out.println("Jagged Array: ");
        for (int i = 0; i < jaggedArr.length; i++) {
            sum = 0;
            for (int j = 0; j < jaggedArr[i].length; j++) {
                sum += jaggedArr[i][j];
                System.out.printf("%d\t", jaggedArr[j]);
            }
            System.out.printf("Sum of Row %d = %d%n", (i+1), sum);
            System.out.println();
        }
    }
}

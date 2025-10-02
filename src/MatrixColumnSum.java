class MatrixColumnSum {
    public static void main(String[] args) {
        int numbers[][] = {
                {2, 4, 6},
                {3, 6, 9},
                {5, 10, 15}
        };

        int output[][] = new int[3][3];

        for (int c = 0; c < numbers[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < numbers.length; r++) {
                sum += numbers[r][c];
            }
            for (int r = 0; r < numbers.length; r++) {
                output[r][c] = sum;
            }
        }

        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}

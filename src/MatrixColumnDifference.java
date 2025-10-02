class MatrixColumnDifference {
    public static void main(String[] args) {
        int data[][] = {
                {8, 16, 24},
                {4, 8, 12},
                {2, 4, 6}
        };

        int result[][] = new int[3][3];

        for (int c = 0; c < data[0].length; c++) {
            int diff = data[0][c];
            for (int r = 1; r < data.length; r++) {
                diff -= data[r][c];
            }
            for (int r = 0; r < data.length; r++) {
                result[r][c] = diff;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

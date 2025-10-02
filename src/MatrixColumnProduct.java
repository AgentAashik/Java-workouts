class MatrixColumnProduct {
    public static void main(String[] args) {
        int mat[][] = {
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}
        };

        int output[][] = new int[3][3];

        for (int c = 0; c < mat[0].length; c++) {
            int prod = mat[0][c];
            for (int r = 1; r < mat.length; r++) {
                prod *= mat[r][c];
            }
            for (int r = 0; r < mat.length; r++) {
                output[r][c] = prod;
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

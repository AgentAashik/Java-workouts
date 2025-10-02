class JaggedArrayDemo {
    public static void main(String[] args) {
        int[][] data = {
                {10, 20, 30},
                {5, 15, 25, 35, 45},
                {99},
                {7, 14, 21, 28, 35, 42, 49, 56, 63},
                {100, 200, 300, 400, 500, 600, 700}
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        int val = -1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = val+=2;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package src.aPackageName;

class Test {
    // method to print the contents of a message
    public static void print(String mesg) {
    System.out.print(mesg);
    }
    // method to print the contents of a one-dimensional array
    public static void print(int[] array) {
    // a. Your code goes here
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    // method to print the contents of a two-dimensional array
    public static void print(int [][] array, int rows, int columns) {
    // b. Your code goes here
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class HelloWorld {
    public static void main(String[] args) {
    //TODO Auto-generated method stub
        System.out.println("HelloWorld!");
        Test msg = new Test();
        String message = "Welcome to CSIT-166!";
        msg.print(message);
        // create a one-dimensional array and invoke print(int[] array)
        // a. Your code goes here
        int oneDim[] = new int[10];
        for (int i = 0; i < 10; i++) {
            oneDim[i] = i;
        }
        Test.print(oneDim);
        // create a two-dimensional array and invoke print(int[], int rows, int columns)
        // b. Your code goes here
        int twoDim[][] = new int[3][3];
        int val = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDim[i][j] = val++;
            }
        }
        Test.print(twoDim, 3, 3);
    }
}
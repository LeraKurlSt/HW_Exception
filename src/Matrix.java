import java.util.Random;

public class Matrix {


    static class MatrixException extends Exception{
        public MatrixException(String e){
            super(e);
        }
    }

    private int rows;
    private int columns;
    private int[][] array;

    public Matrix() throws MatrixException {
        rows = columns = 0;
        array = new int [0][0];
        throw new MatrixException("Rows and columns can not be 0");
    }

    public Matrix(int rows, int columns) throws MatrixException{
        if (rows < 0 || columns < 0){
            throw new MatrixException("Rows and columns can not be negative");
        }
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];
    }

    public Matrix(int size) throws MatrixException{
        if (size <= 0){
            throw new MatrixException("Wrong input");
        }
        this.rows = this.columns = size;
        array = new int[size][size];
    }

    public Matrix(int[][] matrix) {
        this.array = matrix;
    }

    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public int[][] getArray() {
        return array;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }
    public void setArray(int[][] array) {
        this.array = array;
    }

    public void RandomMatrix(){
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(11);
            }
        }
        for (int i = 0; i < array.length; i++,System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
        }
        System.out.println();
    }

    public void sum(Matrix a, Matrix b) throws MatrixException {
        Matrix sum_matrix;
        if (!test(a, b)) {
            throw new MatrixException("Wrong input 1111");
        } else {
            System.out.println("Sum of matrices:");
            int size = a.columns;
            sum_matrix = new Matrix(size);

            for (int i = 0; i < a.rows; i++) {
                for (int j = 0; j < a.columns; j++) {
                    sum_matrix.array[i][j] = a.array[i][j] + b.array[i][j];
                    System.out.printf("%5d", sum_matrix.array[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void subtraction(Matrix a, Matrix b) throws MatrixException {
        Matrix sub_matrix;
        if (!test(a, b)) {
            throw new MatrixException("Wrong input 222222");
        } else {
            System.out.println("The result of the subtraction:");
            int size = a.columns;
            sub_matrix = new Matrix(size);

            for (int i = 0; i < a.rows; i++) {
                for (int j = 0; j < a.columns; j++) {
                    sub_matrix.array[i][j] = a.array[i][j] - b.array[i][j];
                    System.out.printf("%5d", sub_matrix.array[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean test(Matrix a, Matrix b){
        return (a.rows == b.rows) && (a.columns == b.columns);
    }
}

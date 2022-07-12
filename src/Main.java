public class Main {
    public static void main(String[] args) {
        try {
            Matrix matrix1 = new Matrix(5,5);
            matrix1.RandomMatrix();
            Matrix matrix2 = new Matrix(5,5);
            matrix2.RandomMatrix();
            matrix1.sum(matrix1, matrix2);
            matrix1.subtraction(matrix1,matrix2);
        } catch (Matrix.MatrixException ex){
            System.out.println("Something wrong: " + ex.getMessage());
        }
    }
}

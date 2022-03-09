import java.util.Scanner;
public class Transpose {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Number of rows: ") ;
        int r = input.nextInt();//number of rows
        System.out.print("Number of columns: ") ;
        int c = input.nextInt();//number of columns
        int[][] matrix = new int[r][c];
        System.out.println("Input " +(r*c) +" digits: ");

        for (int i= 0; i< r; i++) {             //storing the array
            for (int j = 0; j < c; j++) {
                matrix[i][j] = input.nextInt();

            }

        }

        //Display original array
        System.out.println("The original matrix is: ");
        for (int i= 0; i< r; i++) {
            for (int j = 0; j < c; j++) {
              System.out.print(matrix[i][j] + "\t");

            }
                System.out.println();
        }
        //Display transposed array
        System.out.println("The transposed matrix is: ");
        for (int j= 0; j< r; j++) {
            for (int i= 0; i< c; i++) {
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }



        }
}


//git add . -> To stage the files
//git commit -m "" -->  to commit the code
//git  push --> To push the code to github

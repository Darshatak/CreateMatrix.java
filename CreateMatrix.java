import java.util.Scanner;

class MainClass {
    String matrix[][] = {
            {"Name","Year of Joining","Address"},
            {"Robert","1994","Address"},
            {"Sam","2000","Address"},
            {"John","1999","Address"}
    };

    void display()
    {
        System.out.println("\nThe Matrix is :");
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "     ");
            }
            System.out.println();
        }
    }
}

class CreateMatrix
{
    public static void main(String[] args)
    {
        MainClass obj = new MainClass();
        obj.display();
    }
}
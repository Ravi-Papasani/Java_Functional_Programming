package Variables_And_Types_Syntax;

public class _6_Arrays {
    public static void main(String[] args) {
        //Arrays
        int arNos []; //Declares arNos as an int array
        arNos = new int[5]; //Allocating space for 5 ints and assigning to arNos

        //Array declaration and Assignment combination
        int arN[] = new int[10];
        double drN[];
       // double drN[] = new int[10]; //its does not allow casting in arrays

        //Array access by Index
        int brN[] = new int[10];
        brN[0] = 23;
        brN[3] = 45;
        int value = brN[0];

        //Array Bounds
        int crN[] = new int[10];
        //does not work
       /* crN[11] = 26;
        int val = crN[21];*/

        //Array Initializer
        int erNos[] = {11,12,13,14};


        //MultiDimensional Arrays(Array of arrays)
        int matrix[][] = new int[3][5];
        int mix[][] = new int[3][];
        //Jagged array
        int mixx[] = new int[5];
        int mixy[] = new int[6];
        int mixz[] = new int[7];

        //MultiDimensional Arrays Initializer
        int mul_Matrix[][] = {{1,2,3,4},{11,22,33,44},{12,23,34,45}};

    }
}

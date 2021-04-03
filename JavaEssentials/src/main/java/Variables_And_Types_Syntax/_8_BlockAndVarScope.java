package Variables_And_Types_Syntax;

public class _8_BlockAndVarScope {
    public static void main(String[] args) {
        //Variable Scoping
        {
            int count = 10;
            count = count + 1;

        }

        {
          //  count++; // here count variable is out of scope
        }

        //Local Variables (local to the scope i.e with in that block)

    }
}

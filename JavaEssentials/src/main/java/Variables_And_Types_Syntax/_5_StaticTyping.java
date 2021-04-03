package Variables_And_Types_Syntax;

public class _5_StaticTyping {
    public static void main(String[] args) {
        /*
        Java is a strongly typed language

        Every variable has a type (Static Typing)

        <type> variableName = <value>; // type and value should be compatible

        //Type Conversion
        (double)<type> variableName = (int)<value>;
        Java does not have any problem, because int value can be fit in double space, so no issues
        * */


        //////Conversion in number types

        //////Some type conversion examples
        /*
        short to int
        byte to int
        float to double
        * */

        //Primitive type conversion
        int a = 10;
        double b = a; // it works

        double x = 15.5;
        //int y = x; //it does not work, because int(32 bit) is not capable of holding double(64 bit) values

        //////Incompatible type conversions (Casting Solution)

        //Type Casting
        double k = 15.5;
        //int m = k; //it does not work,
        int m = (int) k; //it works

        //Casting with lossy conversion
        double i = 15.5;
        //int j = i; //it does not work,
        int j = (int) i; //it works
        //here value of j = 15 but not 15.5(which is called lossy conversion, we are loosing the actual value)

        //Casting object references??


        //Precision Loss
        int c = 4/2; //it works
        //it does not work. int b = 3/2;  => output = 1;
        //it does not work.  double e  = 3/2; => output = 1.0;
        double f = 3.0/2; //it works => output = 1.5;

        //Automatic type promotion
        double p = 15;
        int q = 5;
        var r = p*q; // here r is of type double(because double is the biggest type when compare to int)

        //Automatic type promotion Example 2
        var _f = a * b + c / (i - k); // _f type of highest order of(a,b,c,i,k)
        //Highest Order
        /*
        byte,short,char,int => int (Less order)
        long => long
        float => float
        double => double (More order)
        */

    }
}

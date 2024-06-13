import java.io.*;

class WrapperClass {
    public static void main(String[] args) 
    {
        byte a = 1;
        Byte byteobj = Byte.valueOf(a);

        int b = 10;
        Integer intobj = Integer.valueOf(b);

        float c = 18.9f;
        Float floatobj = Float.valueOf(c);

        double d = 250.5;
        Double doubleobj = Double.valueOf(d);

        char e = 'a';
        Character charobj = e;

        System.out.println("Byte object : "+ byteobj);
        System.out.println("\nInteger object : "+ intobj);
        System.out.println("\nFloat object : "+ floatobj);
        System.out.println("\nDouble object : "+ doubleobj);
        System.out.println("\nCharacter object : "+ charobj);

        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        System.out.println("\n\nbyte value : "+ bv);
        System.out.println("\nint value : "+ iv);
        System.out.println("\nfloat value : "+ fv);
        System.out.println("\ndouble value : "+ dv);
        System.out.println("\nchar value : "+ cv);
    }
}
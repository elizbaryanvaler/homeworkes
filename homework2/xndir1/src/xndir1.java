public class xndir1 {
    public static void main(String[] args) {
        //        arithmetic operators
        int a = 20,b = 8,c = 10;
        int sum,div,mul,sub,mod;
        sum = a + b;
        div = a / b;
        sub =  a - b;
        mul = a * b;
        mod = a % b;

        System.out.println(sum);
        System.out.println(div);
        System.out.println(mul);
        System.out.println(sub);
        System.out.println(mod);

//        relational operarors

        System.out.println("relational operarors:");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println( a<= b);
        System.out.println(a < b);
        System.out.println(a > b);

//        logical operators
//    &&
        System.out.println("logical operators:");
        System.out.println((a > b ) && (c > b));
        System.out.println((a > b ) && (c < b));
//    ||
        System.out.println((a < b) || (a > b));
        System.out.println((a < b) || (c < b));
        System.out.println((a > b) || (c > b));
//      !
        System.out.println(!(a == b));
        System.out.println(!(a > b));

//      bitwise operators
        System.out.println(" bitwise operators:");
        System.out.println(a >> b);
        System.out.println(a << b);
        System.out.println(a >>> b);
        System.out.println(a & b);
        System.out.println(a ^ b);

//        assignment operators
        System.out.println("assignment operators:");
        System.out.println(b = b);
        System.out.println(b += b);
        System.out.println(b *= b);
        System.out.println(b -= b);

    }
}
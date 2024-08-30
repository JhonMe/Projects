package JavaPrinc;

public class OpeUnarios {
    /**
     * operadores unarios
     * @param args
     */
    public static void main(String[] args) {
        var a = 4;
        var b = 5;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        var c = true;
        var d = !c;
        System.out.println("c = "+c);
        System.out.println("d = "+d);

        //incremento
        var e = 3;
        var f = ++e;
        System.out.println("e = "+e);
        System.out.println("f = "+f);

        //posincremento
        var g = 5;
        var h = g++;
        System.out.println(g);
        System.out.println(h);

        //decremento
        var i = 2;
        var j = --i;
        System.out.println(i);
        System.out.println(j);

        var k = 5;
        var l = k--;
        System.out.println(k);
        System.out.println(l);
    }
}

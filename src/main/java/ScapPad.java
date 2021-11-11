import java.util.HashMap;

/**
 * Scrap Pad for random java stuff!
 */
public class ScapPad {

    /**
     * @param args
     */
    public static void main(String[] args) {
        var thing = "aaah vars!!";
        var map = new HashMap<String, String>();
        System.out.println(thing+ thing+ thing);
        map.put("Kevin", "ROCKS!");
        System.out.println(map.get("Kevin"));


        var one = 0.1;
        var two = 0.2;
        var three = 0.3;
        System.out.println(one + two + three);
        System.out.println(three + two + one);
        assert (one + two + three) == (one + two + one);
        assert true == false;

        // part one logic
        boolLogic();

        // part one type inference pg 108
        typeInferenceLoop();
    }


    public static void boolLogic(){
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;  //exclusive xor
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("          a = " + a);
        System.out.println("          b = " + b);
        System.out.println("      a | b = " + c);
        System.out.println("      a & b = " + d);
        System.out.println("      a ^ b = " + e);
        System.out.println("  !a&b|a&!b = " + f);
        System.out.println("         a! = " + g);

    }


    public static void typeInferenceLoop(){
        System.out.println("Values of x:");
        for(var x  = 2.5; x < 1000000.0; x = x *2 ){
            System.out.println(x + " ");
        }

    }



}

public class Aufgabe5_1810653130 {
    public static void main(String[]args)
    {
        Integer zahl1 = 5;
        Integer zahl2 = 10;

        System.out.println(zahl1++);
        System.out.println(zahl2++);

        System.out.println(zahl1);
        System.out.println(zahl2);

        System.out.println(++zahl1);
        System.out.println(++zahl2);            //Der Inkrement-Operator ++i(hier: ++zahl1) oder i++(hier: zahl1++)
                                                // erhöht den Wert einer Variablen um 1.
                                                // => Jedoch wird zwischen Postfix(i++)- und Präfixform(++i) unterschieden!
                                                // Beim Postfix(i++) wird die Variable erst nach(!) dem Zugriff!
                                                // Beim Präfix(++i) wird vor(!) dem Zugriff auf die Variable inkrementiert!
    }
}

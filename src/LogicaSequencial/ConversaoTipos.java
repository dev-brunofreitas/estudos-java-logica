package LogicaSequencial;

public class ConversaoTipos {
    public static void main(String[] args) {

        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroDouble.toString();


        String numeroString2 = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroString2);
        Double numeroConvertidoDouble = Double.parseDouble(numeroString2);
        Long numeroConvertidolong = Long.parseLong(numeroString2);

        Long numeroLong = 10L;
        String numeroStringLong = numeroLong.toString();

        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroString2 + " " + numeroString);





    }
}

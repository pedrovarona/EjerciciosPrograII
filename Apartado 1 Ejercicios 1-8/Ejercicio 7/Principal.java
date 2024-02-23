import java.util.*;

public class Principal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese una cadena de caracteres: ");


            String cadena = scanner.nextLine();

            System.out.println("Ingrese un desplazamiento: ");


            
            int desplazamiento = scanner.nextInt();

            System.out.println("Seleccione una opción: ");

            System.out.println("1. Cifrar");

            System.out.println("2. Descifrar");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                String cifrada = cifrarCadena(cadena, desplazamiento);
                System.out.println("Cadena cifrada: " + cifrada);



            } else if (opcion == 2) {
                String descifrada = descifrarCadena(cadena, desplazamiento);
                System.out.println("Cadena descifrada: " + descifrada);


            } else {
                System.out.println("Opción inválida");
            }
        }
    }



    public static String cifrarCadena(String str, int desplazamiento) {
        if (str == null || str.length() == 0) {


            return str;
        }
        char primero = str.charAt(0);


        if (Character.getType(primero) == Character.LOWERCASE_LETTER ||

                Character.getType(primero) == Character.UPPERCASE_LETTER ||

                Character.getType(primero) == Character.TITLECASE_LETTER ||

                Character.getType(primero) == Character.MODIFIER_LETTER) {

            char cifrado = (char) (primero + desplazamiento);

            if ((Character.isUpperCase(primero) && cifrado > 'Z')
                    || (Character.isLowerCase(primero) && cifrado > 'z')) {
                cifrado -= 26;

            }

            return cifrado + cifrarCadena(str.substring(1), desplazamiento);
        }

        return primero + cifrarCadena(str.substring(1), desplazamiento);
    }

    public static String descifrarCadena(String str, int desplazamiento) {
        return cifrarCadena(str, -desplazamiento);

    }
}
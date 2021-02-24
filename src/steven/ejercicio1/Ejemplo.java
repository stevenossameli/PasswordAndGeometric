package steven.ejercicio1;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regexSimple = "(?=.*[0-9]).{4,}"; // steven.ejercicio1.Password Simple
        String regexMedio = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}"; // steven.ejercicio1.Password Intermedia
        String regexFuerte = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}"; //steven.ejercicio1.Password Fuerte

        int option = 0;
        System.out.println("¿que tipo de contraseña vas a asignar?, digitá la opción");
        while (option < 1 || option > 3) {
            System.out.println("1) steven.ejercicio1.Password simple");
            System.out.println("2) steven.ejercicio1.Password intermedio");
            System.out.println("3) steven.ejercicio1.Password fuerte");
            System.out.print("--> |");
            option = sc.nextInt();
        }

        System.out.print("\nIngresa la contraseña: ");
        String pwd = sc.next();

        switch (option) {
            case 1:
                PasswordSimple simple = new PasswordSimple(regexSimple);
                simple.setValue(pwd);
                break;
            case 2:
                PasswordIntermedia intermedia = new PasswordIntermedia(regexMedio);
                intermedia.setValue(pwd);
                break;
            case 3:
                PasswordFuerte fuerte = new PasswordFuerte(regexFuerte);
                fuerte.setValue(pwd);
                break;
            default:
                System.out.println("Error");
        }

    }
}

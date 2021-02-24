package steven.ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private Pattern regex;
    private String value;

    public Password(String regex) {
        setRegex(regex);
    }

    public void setValue(String pwd) {

        Matcher matcher = regex.matcher(pwd);

        try {
            if (matcher.matches()) {
                this.value = pwd;
                System.out.println("Contraseña asignada correctamente");
            } else {
                throw new RuntimeException("Formato de password no válido");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public String getValue() {
        return value;
    }


    public Pattern getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = Pattern.compile(regex);
    }
}
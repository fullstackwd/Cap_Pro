import java.util.Scanner;

public class SenhaForte {
 
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "\n Uma senha forte satisfaz os criterios abaixo: \n" +
                " 1. Possui no minimo 6 caracteres.\n" +
                " 2. Contem no minimo 1 digito.\n" +
                " 3. Contem no minimo 1 letra em minusculo. \n" +
                " 4. Contem no minimo 1 letra em maiusculo.\n" +
                " 5. Contem no minimo 1 caractere especial. Os caracteres especiais sao: !@#$%^&*()-+ \n" +
                "\n Insira uma senha para teste de validacao: ");
        
        String password1 = input.nextLine();


        if (isValidPassword(password1)) {
            System.out.println("\n Senha valida: " + password1 );
        } 
        else {
            System.out.println("\n Senha invalida: " + password1);
            int referenceNumber = 6;
            int number = password1.length();
            int faultNumber = referenceNumber - number;
            System.out.print("\n ATENCAO: Faltam " + faultNumber + " numeros");
        }

    }

    /**
     * O metodo abaixo verifica se a senha e valida ou invalida.
     * @param password
     * @return boolean
     */
    public static boolean isValidPassword(String password)
    {
            boolean isValid = true;
            if (password.length() < 6)
            {
                    System.out.println("\n 1. Deve ter no minimo 6 caracteres. ");
                    isValid = false;
            }
            String upperCaseChars = "(.*[A-Z].*)";
            if (!password.matches(upperCaseChars ))
            {
                    System.out.println("\n 2. Deve ter ao menos uma maiuscula");
                    isValid = false;
            }
            String lowerCaseChars = "(.*[a-z].*)";
            if (!password.matches(lowerCaseChars ))
            {
                    System.out.println("\n 3. Deve ter ao menos uma minuscula");
                    isValid = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!password.matches(numbers ))
            {
                    System.out.println("\n 4. Deve ter ao menos um numero");
                    isValid = false;
            }
            String specialChars = "(.*[@,#,$,%,&].*$)";
            if (!password.matches(specialChars ))
            {
                    System.out.println("\n 5. Deve possuir ao menos um caracter especial @#$%");
                    isValid = false;
            }
            return isValid; 
    }
}

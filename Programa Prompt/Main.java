import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prompt novaLista = new Prompt();
        Scanner scanner = new Scanner(System.in);

        String entrada;
        System.out.println("===Lista de Nomes===\n +Nome para adicionar.\n -Nome para remover.\n L para listar.\n F para finalizar.");
        do {
            entrada = scanner.nextLine();
            char comando = entrada.charAt(0);
            String nome = entrada.substring(1);
            
            if (comando == '+') {
                novaLista.adicionaNome(nome);
            }
            else if (comando == '-') {
                novaLista.removeNome(nome);
            }
            else if (comando == 'L') {
                novaLista.listaNome();
            }
        } while (!entrada.equalsIgnoreCase("F"));;
    }
}

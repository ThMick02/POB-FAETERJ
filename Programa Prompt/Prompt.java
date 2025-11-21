import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prompt {
    private LinkedList<String> nomes = new LinkedList<String>();

    public void adicionaNome(String n) {
        nomes.add(n);
    }

    public void removeNome(String n) {
        nomes.remove(n);
    }

    public void listaNome () {
        Collections.sort(nomes);
        for(String nome:nomes) {
            System.out.println(nome);
        }
    }
}



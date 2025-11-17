package T4;

public class Funcionario {
    private static int proxMatricula=0;
    private String nome;
    private int matricula;
    private double salario;

    public Funcionario(String n, double s) throws IllegalArgumentException, ViolacaoCltException {
        if (n.length()>40) {
            throw new IllegalArgumentException ("Requisição negada: o nome '" + n + "' excede o limite de 40 caracteres.");
        }
        else if (s<350) {
            throw new ViolacaoCltException ("Requisição negada: valor do salario atribuído a " + n + " violam os direitos garantidos na Clt pelo Art. ", 76);
        }
        else {
        this.matricula=proxMatricula;
        proxMatricula++;
        this.nome=n;
        this.salario=s;
        }
    }

    public String getNome() {
        return this.nome;
    }
    public double getSalario() {
        return this.salario;
    }
    public int getMatricula() {
        return this.matricula;
    }

    public void setSalario(double s) throws AumentoAbsurdoException {
        
        double salarioMaximo = salario*1.10;
        if (s>=salarioMaximo) {
            throw new AumentoAbsurdoException ("Requisição de aumento para o funcionário " + nome + " foi negada: valor indevido.");
        }
        this.salario=s;
    }
}

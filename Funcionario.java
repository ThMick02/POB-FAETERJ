package T4;

import java.util.Random;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;

    public Funcionario(String n, double s) throws IllegalArgumentException, ViolacaoCltException {
        Random random = new Random();
        this.matricula=random.nextInt(100);
        if (n.length()>40) {
            throw new IllegalArgumentException ("Requisição negada: o nome '" + n + "' excede o limite de 40 caracteres.");
        }
        else if (s<350) {
            throw new ViolacaoCltException ("Requisição negada: valor do salario atribuído a " + n + " violam os direitos garantidos na Clt pelo Art. ", 76);
        }
        else {
        this.matricula=random.nextInt(100);
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

package T4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        String[] listaAdmissao = {
            "Larissa Almeida de Cervantes",
            "Reginaldo Ivkramodich Ancara Magalhães Bastos",
            "Thiago Tavares Rodrigues",
            "Giovanna Alexandre dos Santos",
            "Ronaldo Felipo Andrade"};
        int[] listaSalarios = {1380,900,6900,160,1800};

        System.out.println("\n====== Requisições Admissão ======");
        for(int i=0;i<listaAdmissao.length;i++) {
            try {
                funcionarios.add(new Funcionario(listaAdmissao[i],listaSalarios[i]));  
            } catch (ViolacaoCltException e) {
                System.out.println(e.getMessage() + e.getCodigo());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        System.out.println("\n======= Aumentos Salariais =======");
        try {
            funcionarios.get(0).setSalario(1450);
        } catch (AumentoAbsurdoException e) {
            System.out.println(e.getMessage());
        }
        try {
            funcionarios.get(1).setSalario(69000);
        } catch (AumentoAbsurdoException e) {
            System.out.println(e.getMessage());
        }
        try {
            funcionarios.get(2).setSalario(1860);
        } catch (AumentoAbsurdoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n========= Registro Final =========");
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome());
            System.out.println("Matricula: " + f.getMatricula());
            System.out.println("Salario: " + f.getSalario());
        }
    }
}

package org.example;

public class FuncionarioSenior extends Funcionario {

    public String verificarDesempenho() {
        if (this.calcularMedia() >= 7.0f) {
            return "Desempenho Satisfatório";
        } else {
            return "Desempenho Insatisfatório";
        }
    }

    @Override
    public String getTipo() {
        return "FuncionarioSenior";
    }
}

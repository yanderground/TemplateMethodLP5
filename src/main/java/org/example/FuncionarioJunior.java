package org.example;

public class FuncionarioJunior extends Funcionario {

    public String verificarDesempenho() {
        if (this.calcularMedia() >= 5.0f) {
            return "Desempenho Satisfatório";
        } else {
            return "Desempenho Insatisfatório";
        }
    }

}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioJuniorTest {

    @Test
    void deveRetonarDesempenhoSatisfatorio() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setAvaliacao1(6.0f);
        funcionario.setAvaliacao2(5.0f);
        assertEquals("Desempenho Satisfatório", funcionario.verificarDesempenho());
    }

    @Test
    void deveRetonarDesempenhoInsatisfatorio() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setAvaliacao1(4.0f);
        funcionario.setAvaliacao2(5.0f);
        assertEquals("Desempenho Insatisfatório", funcionario.verificarDesempenho());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioJunior funcionario = new FuncionarioJunior();
        funcionario.setAvaliacao1(6.0f);
        funcionario.setAvaliacao2(5.0f);
        funcionario.setNome("Carlos");
        funcionario.setId(10);
        assertEquals("Funcionario{id=10, nome='Carlos', resultado=Desempenho Satisfatório}", funcionario.getInfo());
    }
}

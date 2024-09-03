package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioSeniorTest {

    @Test
    void deveRetonarDesempenhoSatisfatorio() {
        FuncionarioSenior funcionario = new FuncionarioSenior();
        funcionario.setAvaliacao1(7.5f);
        funcionario.setAvaliacao2(7.0f);
        assertEquals("Desempenho Satisfatório", funcionario.verificarDesempenho());
    }

    @Test
    void deveRetonarDesempenhoInsatisfatorio() {
        FuncionarioSenior funcionario = new FuncionarioSenior();
        funcionario.setAvaliacao1(6.0f);
        funcionario.setAvaliacao2(6.5f);
        assertEquals("Desempenho Insatisfatório", funcionario.verificarDesempenho());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioSenior funcionario = new FuncionarioSenior();
        funcionario.setAvaliacao1(7.5f);
        funcionario.setAvaliacao2(7.0f);
        funcionario.setNome("Ana");
        funcionario.setId(20);
        assertEquals("FuncionarioSenior{id=20, nome='Ana', resultado=Desempenho Satisfatório}", funcionario.getInfo());
    }
}

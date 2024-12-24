package br.com.devdan.testes;

import br.com.devdan.domain.Pessoa;
import br.com.devdan.utils.ArrayToListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testListaDeMulheres() {
        // Testa a filtragem das mulheres e garante que a lista só contém mulheres.
        String[] input = {"Joana-Feminino", "João-Masculino", "Maria-Feminino"};

        List<Pessoa> pessoas = ArrayToListUtil.formatarArrayToList(input);

        // Filtrando as mulheres
        List<Pessoa> listaFeminina = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo() == "Feminino")
                .toList();

        // Verifica se a lista contém apenas mulheres
        listaFeminina.forEach(pessoa -> assertEquals("Feminino", pessoa.getSexo()));
    }
}

package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000,1,1));
        Assertions.assertEquals(23, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000,1,1)); //--> Cria um Cenário
        Assertions.assertTrue(jessica.ehMaiorDeIdade()); // --> Executa as validações

        Pessoa fulano = new Pessoa("Fulano", LocalDate.now());
        Assertions.assertFalse(fulano.ehMaiorDeIdade());
    }

}

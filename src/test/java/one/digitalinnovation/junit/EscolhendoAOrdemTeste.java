package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Forma ordenada de acordo com sua classificação
// Colocando uma anotação "@Order(numero que deseja) acima de @Test

// @TestMethodOrder(MethodOrderer.MethodName.class) // Ordena de forma alfabetica

// @TestMethodOrder(MethodOrderer.Random.class) // Executa de forma aleatoria

@TestMethodOrder(MethodOrderer.DisplayName.class) // Executa os testes de acordo com o display e melhora a escrita dos casos de testes
public class EscolhendoAOrdemTeste {

    @DisplayName("Teste que valida se o usuário foi criado")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);

    }
    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);

    }
    @DisplayName("C")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);

    }
    @DisplayName("D")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);

    }

}

package alicebredow.test;

import alicebredow.model.Aluno;
import alicebredow.model.Endereco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {
  private final Aluno aluno;
  private final Endereco endereco;

  public AlunoTest() {
    endereco = new Endereco();
    aluno = new Aluno();
  }

  @Test
  public void testAluno () {
    endereco.setCep("888888");
    endereco.setCidade("Porto alegre");
    endereco.setPais("Brasil");
    endereco.setRua("Rua blabla");
    endereco.setUf("RS");

    aluno.setNome("Alice");
    aluno.setMatricula("111");
    aluno.setEmail("aluno@email.com");
    aluno.setTelefone("98888888");
    aluno.calcularMedia(10, 10);
    aluno.setEndereco(endereco);

    assertEquals("Alice", aluno.getNome());

    assertEquals(endereco, aluno.getEndereco());

    int mediaEsperada = (10 + 10) / 2;
    assertEquals(mediaEsperada, aluno.getMedia());
  }

}

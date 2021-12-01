package alicebredow.test;

import alicebredow.model.Endereco;
import alicebredow.model.Professor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessorTest {
  private final Professor professor;
  private final Endereco endereco;

  public ProfessorTest() {
    endereco = new Endereco();
    professor = new Professor();
  }

  @Test
  public void testAluno() {
    endereco.setCep("888888");
    endereco.setCidade("Porto alegre");
    endereco.setPais("Brasil");
    endereco.setRua("Rua blabla");
    endereco.setUf("RS");

    professor.setNome("Paulo");
    professor.setSalario(2000.00);
    professor.setEmail("professor@email.com");
    professor.setTelefone("98888888");
    professor.setEndereco(endereco);

    assertEquals("Paulo", professor.getNome());
    assertEquals(endereco, professor.getEndereco());
  }

}

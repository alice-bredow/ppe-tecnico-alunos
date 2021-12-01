package alicebredow.model;

public class Aluno extends Pessoa {
  private String matricula;
  private int media;

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double getMedia() {
    return media;
  }

  public void setMedia(int media) {
    this.media = media;
  }

  public void calcularMedia (int nota1, int nota2) {
    media = (nota1 + nota2) / 2;
  }

  @Override
  public String toString() {
    return "Aluno{" +
        "matricula='" + matricula + '\'' +
        ", media=" + media +
        '}';
  }
}

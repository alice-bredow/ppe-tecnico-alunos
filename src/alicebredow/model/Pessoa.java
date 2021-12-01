package alicebredow.model;

public class Pessoa {
  private String nome;
  private String telefone;
  private String email;
  private Endereco endereco;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", telefone='" + telefone + '\'' +
        ", email='" + email + '\'' +
        ", endereco=" + endereco +
        '}';
  }
}

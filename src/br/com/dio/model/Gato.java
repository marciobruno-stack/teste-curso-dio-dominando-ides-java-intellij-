package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private String ideda;

    public Gato() {   }

    public Gato(String nome, String cor, String ideda) {
        this.nome = nome;
        this.cor = cor;
        this.ideda = ideda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdeda() {
        return ideda;
    }

    public void setIdeda(String ideda) {
        this.ideda = ideda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(ideda, gato.ideda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, ideda);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ideda='" + ideda + '\'' +
                '}';
    }
}

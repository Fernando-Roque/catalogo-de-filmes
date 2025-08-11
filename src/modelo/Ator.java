package modelo;

import java.time.LocalDate;

public class Ator extends Pessoa {
    private int premiacoes;

    public Ator(String nome, LocalDate dataNascimento, String nacionalidade, int premiacoes) {
        super(nome, dataNascimento, nacionalidade);
        this.premiacoes = premiacoes;
    }

    public int getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(int premiacoes) {
        this.premiacoes = premiacoes;
    }
}

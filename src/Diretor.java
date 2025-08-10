//package model;

import java.time.LocalDate;

public class Diretor extends Pessoa {
    private int filmesDirigidos;

    public Diretor(String nome, LocalDate dataNascimento, String nacionalidade, int filmesDirigidos) {
        super(nome, dataNascimento, nacionalidade);
        this.filmesDirigidos = filmesDirigidos;
    }

    public int getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void setFilmesDirigidos(int filmesDirigidos) {
        this.filmesDirigidos = filmesDirigidos;
    }
}

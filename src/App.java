// class App.java veio na criação do projeto.

// so usa esses imports caso use os pacotes.
// import model.*;
// import service.CatalogoFilmes;

import java.time.LocalDate;
import java.util.Arrays;

public class App {
        public static void main(String[] args) {
        CatalogoFilmes catalogo = new CatalogoFilmes();

        Diretor diretor = new Diretor("Christopher Nolan", LocalDate.of(1970, 7, 30), "Britânico", 10);
        Ator ator = new Ator("Leonardo DiCaprio", LocalDate.of(1974, 11, 11), "Americano", 3);

        Filme filme = new Filme("A Origem", LocalDate.of(2010, 7, 16), 160_000_000, "Filme de ficção científica e ação.");
        catalogo.cadastrarDiretor(diretor);
        catalogo.cadastrarAtor(ator);
        catalogo.cadastrarFilme(filme);

        catalogo.associarDiretorFilme(filme, diretor);
        catalogo.associarAtorFilme(filme, ator);

        // Adicionando mais dois filmes do mesmo diretor (Christopher Nolan)
        Filme interstellar = new Filme("Interstellar", LocalDate.of(2014, 11, 6), 165_000_000, "Ficção científica espacial.");
        Filme dunkirk = new Filme("Dunkirk", LocalDate.of(2017, 7, 20), 100_000_000, "Filme de guerra épico.");
        
        catalogo.cadastrarFilme(interstellar);
        catalogo.cadastrarFilme(dunkirk);
        
        catalogo.associarDiretorFilme(interstellar, diretor);
        catalogo.associarDiretorFilme(dunkirk, diretor);

        // Adicionando mais dois filmes do mesmo ator (Leonardo DiCaprio)
        Diretor scorsese = new Diretor("Martin Scorsese", LocalDate.of(1942, 11, 17), "Americano", 15);
        Diretor inarritu = new Diretor("Alejandro González Iñárritu", LocalDate.of(1963, 8, 15), "Mexicano", 12);
        
        catalogo.cadastrarDiretor(scorsese);
        catalogo.cadastrarDiretor(inarritu);
        
        Filme loboWallStreet = new Filme("O Lobo de Wall Street", LocalDate.of(2013, 12, 25), 100_000_000, "Comédia negra biográfica.");
        Filme regresso = new Filme("O Regresso", LocalDate.of(2015, 12, 25), 135_000_000, "Drama de sobrevivência.");
        
        catalogo.cadastrarFilme(loboWallStreet);
        catalogo.cadastrarFilme(regresso);
        
        catalogo.associarDiretorFilme(loboWallStreet, scorsese);
        catalogo.associarDiretorFilme(regresso, inarritu);
        
        catalogo.associarAtorFilme(loboWallStreet, ator);
        catalogo.associarAtorFilme(regresso, ator);

        // Adicionando dois filmes atuais
        Diretor villeneuve = new Diretor("Denis Villeneuve", LocalDate.of(1967, 10, 3), "Canadense", 8);
        Ator murphy = new Ator("Cillian Murphy", LocalDate.of(1976, 5, 25), "Irlandês", 2);
        Ator chalamet = new Ator("Timothée Chalamet", LocalDate.of(1995, 12, 27), "Americano", 1);
        
        catalogo.cadastrarDiretor(villeneuve);
        catalogo.cadastrarAtor(murphy);
        catalogo.cadastrarAtor(chalamet);
        
        Filme oppenheimer = new Filme("Oppenheimer", LocalDate.of(2023, 7, 21), 100_000_000, "Drama histórico.");
        Filme duna2 = new Filme("Duna: Parte Dois", LocalDate.of(2024, 3, 14), 190_000_000, "Ficção científica épica.");
        
        catalogo.cadastrarFilme(oppenheimer);
        catalogo.cadastrarFilme(duna2);
        
        catalogo.associarDiretorFilme(oppenheimer, diretor); // Nolan já existente
        catalogo.associarDiretorFilme(duna2, villeneuve);
        
        catalogo.associarAtorFilme(oppenheimer, murphy);
        catalogo.associarAtorFilme(duna2, chalamet);
        
        // Listando todos os filmes cadastrados
        System.out.println( catalogo.listarFilmes());

        System.out.println("Filmes encontrados: " + catalogo.pesquisarFilmePorNome("oppenheimer"));
    }
}

// public class Main {
    
// }

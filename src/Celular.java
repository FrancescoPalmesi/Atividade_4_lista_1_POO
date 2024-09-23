import java.util.ArrayList;
import java.util.List;

public class Celular {
    private int codigo;
    private String modelo;
    private  String marca;
    private List<Jogo> jogos;
    private Tela tela;
    private Processador processador;
    private Memoria memoria;

    public Celular(int codigo, String modelo, String marca, Tela tela, Processador processador, Memoria memoria){
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.tela = tela;
        this.processador = processador;
        this.memoria = memoria;
        this.jogos = new ArrayList<>(); // Inicializa a lista de jogos
    }

    public void Ligar(){
        System.out.printf("Celular "+codigo+" ligado com sucesso");
    }

    public void Desligar(){
        System.out.printf("Celular "+codigo+" desligado com sucesso");
    }

    public void Chamar(String numero){
        System.out.printf("Celular "+codigo+" está ligando para "+numero);
    }

    // Método para adicionar um jogo ao celular
    public void AdicionarJogo(Jogo jogo) {
        jogos.add(jogo);
        System.out.println("Jogo " + jogo.nome + " adicionado ao celular " + codigo);
    }

    // Método para listar todos os jogos
    public void ListarJogos() {
        System.out.println("Jogos instalados no celular " + codigo + ":");
        for (Jogo jogo : jogos) {
            System.out.println("- " + jogo.nome);
        }
    }

}

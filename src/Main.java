public class Main {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo(1,"Angry birds","celular",10.2);

        jogo1.Iniciar();
        jogo1.Encerrar();

        // Criando um objeto da classe Memoria
        Memoria memoria1 = new Memoria(101, "Memoria RAM DDR4", "RAM", 16.0);

        // Chamando o método Alocar
        memoria1.Alocar();

        // Chamando o método Desalocar
        memoria1.Desalocar();

        // Criando um objeto da classe Tela
        Tela tela1 = new Tela(202, "Tela AMOLED", "AMOLED", 6.5);

        // Chamando o método Ligar
        tela1.Ligar();

        // Chamando o método Desligar
        tela1.Desligar();

        // Criando um objeto da classe Processador
        Processador processador1 = new Processador(303, "Processador Octa-core", "ARM", 2.8);

        // Chamando o método Acelerar
        processador1.Acelerar();

        // Chamando o método Desacelerar
        processador1.Desacelerar();

        // Criando o objeto da classe Celular
        Celular celular = new Celular(404, "Galaxy S21", "Samsung", tela1, processador1, memoria1);

        // Ligando o celular
        celular.Ligar();

        // Fazendo uma chamada
        celular.Chamar("11987654321");

        celular.AdicionarJogo(jogo1);

        // Listando os jogos instalados
        celular.ListarJogos();

        // Desligando o celular
        celular.Desligar();
    }
}
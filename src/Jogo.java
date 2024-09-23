public class Jogo   {
    private int codigo;
    private String nome;
    private String tipo;
    private double tamanho;


    public Jogo(int codigo, String nome,String tipo,double tamanho){
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public void Iniciar(){
        System.out.println("Jogo " + nome + " iniciado com sucesso.");
    }

    public void Encerrar(){
        System.out.println("Jogo " + nome + " encerado com sucesso.");
    }

    // Método getter para obter o nome do jogo
    public String getNome() {
        return nome;
    }
}

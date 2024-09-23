public class Processador {
    private int codigo;
    private String descricao;
    private String tipo;
    private double velocidade;


    public Processador(int codigo, String descricao,String tipo,double velocidade){
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    public void Acelerar(){
        System.out.println("Processos prioritarios acelerados na CPU "+codigo);
    }

    public void Desacelerar(){
        System.out.println("Processos prioridatarios tiveram redução de sua prioridade na CPU "+codigo);
    }
}

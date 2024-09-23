public class Memoria {
    private int codigo;
    private String descricao;
    private String tipo;
    private double capacidade;


    public Memoria(int codigo, String descricao,String tipo,double capacidade){
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public void Alocar(){
        System.out.println("Memoria alocada no disco "+codigo);
    }

    public void Desalocar(){
        System.out.println("Memoria desalocada no disco "+codigo);
    }

}

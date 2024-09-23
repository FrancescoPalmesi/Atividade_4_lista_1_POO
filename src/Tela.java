public class Tela {
    private int codigo;
    private String descricao;
    private String tipo;
    private double tamanho;


    public Tela(int codigo, String descricao,String tipo,double tamanho){
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public void Ligar(){
        System.out.println("Tela " + codigo + " ligada com sucesso.");
    }

    public void Desligar(){
        System.out.println("Tela " + codigo + " desligada com sucesso.");
    }
}

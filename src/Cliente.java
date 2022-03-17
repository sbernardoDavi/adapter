public class Cliente {
    IVenda venda;
    VendaAdapter adaptador;

    public Cliente(){
        venda = new VendaProduto();
        adaptador = new VendaAdapter(venda);

    }

    public void setVenda(String produto){
        venda.setVenda(produto);
        adaptador.equalizarVenda();
    }

    public String getVenda(){
        return adaptador.pegarVenda();
    }

    public float getValor(){
        return adaptador.getValor();
    }
}

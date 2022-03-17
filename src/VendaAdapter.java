public class VendaAdapter extends VendaValor {

    private IVenda vendaProduto;

    public VendaAdapter(IVenda vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    public String pegarVenda() {
        if(this.getValor() == 1.99f)
            vendaProduto.setVenda("Acessório");
        else
            if(this.getValor()==19.99f)
                vendaProduto.setVenda("Camiseta");
            return  vendaProduto.getVenda();
    }

    public void equalizarVenda(){
        if(vendaProduto.getVenda().equals("Acessório"))
            this.setValor(1.99f);
        else
            if(vendaProduto.getVenda().equals("Camiseta"))
                this.setValor(19.99f);
    }
}

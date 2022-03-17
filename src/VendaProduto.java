public class VendaProduto implements IVenda{
    private String produto;

    @Override
    public String getVenda(){
        return this.produto;
    }

    @Override
    public void setVenda(String produto){
        this.produto = produto;
    }

}

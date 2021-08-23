package Vendas.controller;

public class ItemPedido
{
    private Produto produto;
    private float quantidade = 0.0f;
    private int idPedido;
    
    public void ItemPedido()
    {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void adicionaQuantidade(float quantidade) {
        this.quantidade += quantidade;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public float getTotal()
    {
        return this.quantidade * this.produto.getPreco();
    }
    
    public boolean temEstoque()
    {
        return this.quantidade >= this.produto.getEstoque();
    }
    
}

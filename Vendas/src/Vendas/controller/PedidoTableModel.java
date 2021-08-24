package Vendas.controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PedidoTableModel extends AbstractTableModel
{
    private static enum COLUNAS
    {
        ID("Código", 0),
        DESCRICAO("Descrição", 1),
        PRECO("R$ Unitário", 2),
        QUANTIDADE("Quantidade", 3),
        SUBTOTAL("Subtotal", 4);
        
        private String descricao;
        private int valor;
        
        private COLUNAS(String descricao, int valor)
        {
            this.descricao = descricao;
            this.valor = valor;
        }
        
        public String getDescricao()
        {
            return this.descricao;
        }
        
        public int getValor()
        {
            return this.valor;
        }
    };
    
    private Pedido pedido;

    public PedidoTableModel(Pedido pedido) 
    {
        this.pedido = pedido;
    }
    
    @Override
    public int getRowCount() 
    {
        return pedido.getQuantidadeItens();
    }

    @Override
    public int getColumnCount() 
    {
        return COLUNAS.values().length;
    }
    
    @Override
    public String getColumnName(int columnIndex) 
    {
        if (columnIndex == COLUNAS.ID.getValor())
            return COLUNAS.ID.getDescricao();
        
        if (columnIndex == COLUNAS.DESCRICAO.getValor())
            return COLUNAS.DESCRICAO.getDescricao();
        
        if (columnIndex == COLUNAS.PRECO.getValor())
            return COLUNAS.PRECO.getDescricao();
        
        if (columnIndex == COLUNAS.QUANTIDADE.getValor())
            return COLUNAS.QUANTIDADE.getDescricao();
        
        if (columnIndex == COLUNAS.SUBTOTAL.getValor())
            return COLUNAS.SUBTOTAL.getDescricao();
        
        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) 
    {
        if (columnIndex == COLUNAS.ID.getValor())
            return Integer.class;
        
        if (columnIndex == COLUNAS.DESCRICAO.getValor())
            return String.class;
        
        if (columnIndex == COLUNAS.PRECO.getValor()
        || columnIndex == COLUNAS.QUANTIDADE.getValor()
        || columnIndex == COLUNAS.SUBTOTAL.getValor())
            return Float.class;
        
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) 
    {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        if (rowIndex >= pedido.getQuantidadeItens())
            return null;
        
        ItemPedido itemPedido = pedido.getItens().get(rowIndex);
        
        if (columnIndex == COLUNAS.ID.getValor())
            return itemPedido.getProduto().getId();
        
        if (columnIndex == COLUNAS.DESCRICAO.getValor())
            return itemPedido.getProduto().getDescricao();
        
        if (columnIndex == COLUNAS.PRECO.getValor())
            return itemPedido.getProduto().getPreco();
        
        if (columnIndex == COLUNAS.QUANTIDADE.getValor())
            return itemPedido.getQuantidade();
        
        if (columnIndex == COLUNAS.SUBTOTAL.getValor())
            return itemPedido.getTotal();
        
        return "";
    }
    
//    public void setValueAt(Object aValue, int row, int column) 
//    {
//        Contato u = linhas.get(row);
//        if (column == COL_ID) {
//                u.setId((Integer) aValue);
//        } else if (column == COL_NOME) {
//                u.setNome(aValue.toString());
//        } else if (column == COL_TELEFONE) {
//                u.setTelefone(aValue.toString());
//        } else if (column == COL_EMAIL) {
//                u.setEmail(aValue.toString());
//        }
//    }
    
    public ItemPedido getItemPedido(int indiceLinha)
    {
        if (indiceLinha >= pedido.getQuantidadeItens())
            return null;
        
        return pedido.getItens().get(indiceLinha);
    }
    
    public void addItemPedido(ItemPedido itemPedido)
    {
        pedido.adicionaItem(itemPedido);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }
    
    public Pedido getPedido()
    {
        return pedido;
    }
}

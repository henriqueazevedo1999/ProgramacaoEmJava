//pattern strategy
//pattern factory
//implementar classe controller

package aula3.view;

public class Menu extends javax.swing.JFrame {

    CadastroProduto cadastroProduto;
    CadastroCategoria cadastroCategoria;
    CadastroCliente cadastroCliente;
    CadastroCarro cadastroCarro;
    ConsultaProdutos consultaProdutos;
    ConsultaClientes consultaClientes;
    ConsultaCategorias consultaCategorias;
    ConsultaCarros consultaCarros;
    
    public Menu() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCadastros = new javax.swing.JMenu();
        jCadastroProduto = new javax.swing.JMenuItem();
        jCadastroCategoria = new javax.swing.JMenuItem();
        jCadastroCliente = new javax.swing.JMenuItem();
        jCadastroCarro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCadastroSair = new javax.swing.JMenuItem();
        jConsultas = new javax.swing.JMenu();
        jConsultaProduto = new javax.swing.JMenuItem();
        jConsultaCategoria = new javax.swing.JMenuItem();
        jConsultaCliente = new javax.swing.JMenuItem();
        jConsultaCarro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jConsultaSair = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de vendas");

        jCadastros.setText("Cadastros");

        jCadastroProduto.setText("Produto");
        jCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroProdutoActionPerformed(evt);
            }
        });
        jCadastros.add(jCadastroProduto);

        jCadastroCategoria.setText("Categoria");
        jCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroCategoriaActionPerformed(evt);
            }
        });
        jCadastros.add(jCadastroCategoria);

        jCadastroCliente.setText("Cliente");
        jCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroClienteActionPerformed(evt);
            }
        });
        jCadastros.add(jCadastroCliente);

        jCadastroCarro.setText("Carro");
        jCadastroCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroCarroActionPerformed(evt);
            }
        });
        jCadastros.add(jCadastroCarro);
        jCadastros.add(jSeparator1);

        jCadastroSair.setText("Sair");
        jCadastros.add(jCadastroSair);

        jMenuBar1.add(jCadastros);

        jConsultas.setText("Consultas");

        jConsultaProduto.setText("Produto");
        jConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaProdutoActionPerformed(evt);
            }
        });
        jConsultas.add(jConsultaProduto);

        jConsultaCategoria.setText("Categoria");
        jConsultaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaCategoriaActionPerformed(evt);
            }
        });
        jConsultas.add(jConsultaCategoria);

        jConsultaCliente.setText("Cliente");
        jConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaClienteActionPerformed(evt);
            }
        });
        jConsultas.add(jConsultaCliente);

        jConsultaCarro.setText("Carro");
        jConsultaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaCarroActionPerformed(evt);
            }
        });
        jConsultas.add(jConsultaCarro);
        jConsultas.add(jSeparator2);

        jConsultaSair.setText("Sair");
        jConsultas.add(jConsultaSair);

        jMenuBar1.add(jConsultas);

        jSair.setText("Sair");
        jMenuBar1.add(jSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroProdutoActionPerformed
        CadastroProduto.getInstance().setVisible(true);
    }//GEN-LAST:event_jCadastroProdutoActionPerformed

    private void jCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroCategoriaActionPerformed
        CadastroCategoria.getInstance().setVisible(true);
    }//GEN-LAST:event_jCadastroCategoriaActionPerformed

    private void jConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaProdutoActionPerformed
        ConsultaProdutos.getInstance().setVisible(true);
    }//GEN-LAST:event_jConsultaProdutoActionPerformed

    private void jCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroClienteActionPerformed
        CadastroCliente.getInstance().setVisible(true);
    }//GEN-LAST:event_jCadastroClienteActionPerformed

    private void jConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaClienteActionPerformed
        ConsultaClientes.getInstance().setVisible(true);
    }//GEN-LAST:event_jConsultaClienteActionPerformed

    private void jConsultaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaCategoriaActionPerformed
        ConsultaCategorias.getInstance().setVisible(true);
    }//GEN-LAST:event_jConsultaCategoriaActionPerformed

    private void jCadastroCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroCarroActionPerformed
        CadastroCarro.getInstance().setVisible(true);
    }//GEN-LAST:event_jCadastroCarroActionPerformed

    private void jConsultaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaCarroActionPerformed
        ConsultaCarros.getInstance().setVisible(true);
    }//GEN-LAST:event_jConsultaCarroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCadastroCarro;
    private javax.swing.JMenuItem jCadastroCategoria;
    private javax.swing.JMenuItem jCadastroCliente;
    private javax.swing.JMenuItem jCadastroProduto;
    private javax.swing.JMenuItem jCadastroSair;
    private javax.swing.JMenu jCadastros;
    private javax.swing.JMenuItem jConsultaCarro;
    private javax.swing.JMenuItem jConsultaCategoria;
    private javax.swing.JMenuItem jConsultaCliente;
    private javax.swing.JMenuItem jConsultaProduto;
    private javax.swing.JMenuItem jConsultaSair;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

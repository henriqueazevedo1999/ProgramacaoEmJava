package aula3.view;

public class Menu extends javax.swing.JFrame {

    CadastroProduto cadastroProduto;
    CadastroCategoria cadastroCategoria;
    CadastroCliente cadastroCliente;
    ConsultaProdutos consultaProdutos;
    ConsultaClientes consultaClientes;
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadastroProduto = new javax.swing.JMenuItem();
        jMenuItemCadastroCategoria = new javax.swing.JMenuItem();
        jMenuCadastrosCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuConsultasProduto = new javax.swing.JMenuItem();
        jMenuConsultasCliente = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de vendas");

        jMenu1.setText("Cadastros");

        jMenuItemCadastroProduto.setText("Produto");
        jMenuItemCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadastroProduto);

        jMenuItemCadastroCategoria.setText("Categoria");
        jMenuItemCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadastroCategoria);

        jMenuCadastrosCliente.setText("Cliente");
        jMenuCadastrosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrosClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastrosCliente);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Sair");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuConsultasProduto.setText("Produto");
        jMenuConsultasProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuConsultasProduto);

        jMenuConsultasCliente.setText("Cliente");
        jMenuConsultasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuConsultasCliente);
        jMenu2.add(jSeparator2);

        jMenuItem6.setText("Sair");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");
        jMenuBar1.add(jMenu3);

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

    private void jMenuItemCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutoActionPerformed
        if (cadastroProduto == null)
            cadastroProduto = new CadastroProduto();
        
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroProdutoActionPerformed

    private void jMenuItemCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroCategoriaActionPerformed
        if (cadastroCategoria == null)
            cadastroCategoria = new CadastroCategoria();
        
        cadastroCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroCategoriaActionPerformed

    private void jMenuConsultasProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasProdutoActionPerformed
        if (consultaProdutos == null)
            consultaProdutos = new ConsultaProdutos();
        
        consultaProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuConsultasProdutoActionPerformed

    private void jMenuCadastrosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrosClienteActionPerformed
        if (cadastroCliente == null)
            cadastroCliente = new CadastroCliente();
             
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jMenuCadastrosClienteActionPerformed

    private void jMenuConsultasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasClienteActionPerformed
        if (consultaClientes == null)
            consultaClientes = new ConsultaClientes();
        
        consultaClientes.setVisible(true);
    }//GEN-LAST:event_jMenuConsultasClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastrosCliente;
    private javax.swing.JMenuItem jMenuConsultasCliente;
    private javax.swing.JMenuItem jMenuConsultasProduto;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemCadastroCategoria;
    private javax.swing.JMenuItem jMenuItemCadastroProduto;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

package exerciciocarro.view;

import exerciciocarro.model.Carro;
import exerciciocarro.view.CarroTableModel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;

public class Cadastro extends javax.swing.JFrame {

    private CarroTableModel carroModel;
    
    public Cadastro()// throws ParseException
    {
        carroModel = new CarroTableModel();
        
        initComponents();
        FormataMascaras();
        jTableCarros.setModel(carroModel);
    }
    
    private void FormataMascaras()// throws ParseException 
    {
        /*MaskFormatter maskPlaca = new MaskFormatter("UUU-####");
        MaskFormatter maskKm = new MaskFormatter("## km");
        MaskFormatter maskLitros = new MaskFormatter("## L");
        
        maskPlaca.install(jtPlaca);
        maskKm.install(jtPercorrido);
        maskLitros.install(jtCapacidade);
        maskLitros.install(jtAbastecido);*/
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtPlaca = new javax.swing.JFormattedTextField();
        jlPlaca = new javax.swing.JLabel();
        jcMarca = new javax.swing.JComboBox<>();
        jlMarca = new javax.swing.JLabel();
        jcModelo = new javax.swing.JComboBox<>();
        jlModelo = new javax.swing.JLabel();
        jlCapacidade = new javax.swing.JLabel();
        jtCapacidade = new javax.swing.JFormattedTextField();
        jlAbastecido = new javax.swing.JLabel();
        jtAbastecido = new javax.swing.JFormattedTextField();
        jlPercorrido = new javax.swing.JLabel();
        jtPercorrido = new javax.swing.JFormattedTextField();
        jbCadastra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtPlaca.setText("ABC-1234");
        jtPlaca.setToolTipText("");
        jtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPlacaActionPerformed(evt);
            }
        });

        jlPlaca.setText("Placa");

        jcMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chevrolet", "Fiat", "Honda", "Hyundai", "Renault", "Toyota", "Volkswagen" }));
        jcMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMarcaActionPerformed(evt);
            }
        });

        jlMarca.setText("Marca");

        jcModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gol", "Uno", "Corolla", "Kwid", "Sandero", "Cruze", "Onix", "Voyage", "Palio", "Fox", "Siena", "Celta", "HB20", "Corsa", "Fiesta", "Cobalt", "Ka", "Civic", " " }));
        jcModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcModeloActionPerformed(evt);
            }
        });

        jlModelo.setText("Modelo");

        jlCapacidade.setText("Cap. Tanque");

        jlAbastecido.setText("Abastecido");

        jlPercorrido.setText("Percorrido");

        jbCadastra.setText("Cadastra");
        jbCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastraActionPerformed(evt);
            }
        });

        jTableCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cap Tanque", "L Abastecido", "Km Percorrido", "Km/L"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCarros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlCapacidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlAbastecido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtAbastecido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlPercorrido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtPercorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCadastra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlAbastecido)
                            .addGap(28, 28, 28))
                        .addComponent(jtAbastecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlCapacidade)
                            .addGap(28, 28, 28))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlModelo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlPlaca)
                                .addComponent(jlMarca))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlPercorrido)
                            .addGap(28, 28, 28))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPercorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCadastra))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPlacaActionPerformed

    private void jbCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastraActionPerformed
        
        Carro carro = new Carro();
        
        carro.setPlaca(jtPlaca.getText());
        carro.setMarca(jcMarca.getSelectedItem().toString());
        carro.setModelo(jcModelo.getSelectedItem().toString());
        carro.setLitrosAbastecidos(Double.parseDouble(jtAbastecido.getText()));
        carro.setKm(Double.parseDouble(jtPercorrido.getText()));
        carro.setCapacidadeTanque(Double.parseDouble(jtCapacidade.getText()));
        
        carroModel.add(carro);
    }//GEN-LAST:event_jbCadastraActionPerformed

    private void jcMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMarcaActionPerformed

    private void jcModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcModeloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarros;
    private javax.swing.JButton jbCadastra;
    private javax.swing.JComboBox<String> jcMarca;
    private javax.swing.JComboBox<String> jcModelo;
    private javax.swing.JLabel jlAbastecido;
    private javax.swing.JLabel jlCapacidade;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlPercorrido;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JFormattedTextField jtAbastecido;
    private javax.swing.JFormattedTextField jtCapacidade;
    private javax.swing.JFormattedTextField jtPercorrido;
    private javax.swing.JFormattedTextField jtPlaca;
    // End of variables declaration//GEN-END:variables
}


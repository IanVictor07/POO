
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.limpar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLCargoTipoEspecialidade = new javax.swing.JLabel();
        jBCalcular = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLConselho = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFDiaria = new javax.swing.JTextField();
        jTFDuracao = new javax.swing.JTextField();
        jCBDestino = new javax.swing.JComboBox<>();
        jCBEstrelas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAResumo = new javax.swing.JTextArea();
        jLCambioPraiasParque = new javax.swing.JLabel();
        jTFCambioPraias = new javax.swing.JTextField();
        jCBParque = new javax.swing.JComboBox<>();
        jLTransporteAcomodacaoPacoteInteresse = new javax.swing.JLabel();
        jCBTransporteAcomodacaoPacoteInteresse = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGÊNCIA DE VIAGENS");

        jLCargoTipoEspecialidade.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLCargoTipoEspecialidade.setText("DURAÇÃO (DIAS)");

        jBCalcular.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("DESTINO:");

        jLConselho.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLConselho.setText("HOTEL - ESTRELAS");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("DIÁRIA: R$");

        jTFDiaria.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jTFDuracao.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jCBDestino.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jCBDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PORTO SEGURO", "CALDAS NOVAS", "NOVA YORK", "PARIS" }));
        jCBDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDestinoActionPerformed(evt);
            }
        });

        jCBEstrelas.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jCBEstrelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ESTRELA", "2 ESTRELAS", "3 ESTRELAS", "4 ESTRELAS", "5 ESTRELAS" }));

        jTAResumo.setEditable(false);
        jTAResumo.setColumns(20);
        jTAResumo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jTAResumo.setRows(5);
        jTAResumo.setText("RESUMO:\n");
        jScrollPane2.setViewportView(jTAResumo);

        jLCambioPraiasParque.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLCambioPraiasParque.setText("CÂMBIO: R$");

        jTFCambioPraias.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jCBParque.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jCBParque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));

        jLTransporteAcomodacaoPacoteInteresse.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLTransporteAcomodacaoPacoteInteresse.setText("TRANSPORTE:");

        jCBTransporteAcomodacaoPacoteInteresse.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jCBTransporteAcomodacaoPacoteInteresse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AEREO", "TERRESTRE" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLConselho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLCargoTipoEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLCambioPraiasParque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLTransporteAcomodacaoPacoteInteresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDuracao)
                            .addComponent(jCBEstrelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFDiaria)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCBDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBTransporteAcomodacaoPacoteInteresse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCBParque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFCambioPraias))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBEstrelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLConselho))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCargoTipoEspecialidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCambioPraias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCambioPraiasParque)
                            .addComponent(jCBParque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBTransporteAcomodacaoPacoteInteresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTransporteAcomodacaoPacoteInteresse)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCalcular)
                    .addComponent(jBLimpar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jCBDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDestinoActionPerformed
        // TODO add your handling code here:
        int destino = jCBDestino.getSelectedIndex();
        limpar();
        jCBDestino.setSelectedIndex(destino);
        switch(destino){
            case 0 -> {
                jLCambioPraiasParque.setText("PRAIAS:");
                jCBParque.setVisible(false);
                jTFCambioPraias.setVisible(true);
                jLTransporteAcomodacaoPacoteInteresse.setText("TRANSPORTE: ");
                jCBTransporteAcomodacaoPacoteInteresse.removeAllItems();
                jCBTransporteAcomodacaoPacoteInteresse.addItem("AEREO");
                jCBTransporteAcomodacaoPacoteInteresse.addItem("TERRESTRE");
            }
            case 1 -> {
                jLCambioPraiasParque.setText("PARQUE:");
                jCBParque.setVisible(true);
                jTFCambioPraias.setVisible(false);
                jLTransporteAcomodacaoPacoteInteresse.setText("ACOMODAÇÃO: ");
                jCBTransporteAcomodacaoPacoteInteresse.removeAllItems();
                jCBTransporteAcomodacaoPacoteInteresse.addItem("INDIVIDUAL");
                jCBTransporteAcomodacaoPacoteInteresse.addItem("COLETIVO");
            }
            case 2 -> {
                jLCambioPraiasParque.setText("CÂMBIO DÓLAR: R$");
                jCBParque.setVisible(false);
                jTFCambioPraias.setVisible(true);
                jLTransporteAcomodacaoPacoteInteresse.setText("PACOTE: ");
                jCBTransporteAcomodacaoPacoteInteresse.removeAllItems();
                jCBTransporteAcomodacaoPacoteInteresse.addItem("BASICO");
                jCBTransporteAcomodacaoPacoteInteresse.addItem("COMPLETO");
            }
            case 3 -> {
                jLCambioPraiasParque.setText("CÂMBIO EURO: R$");
                jCBParque.setVisible(false);
                jTFCambioPraias.setVisible(true);
                jLTransporteAcomodacaoPacoteInteresse.setText("INTERESSE: ");
                jCBTransporteAcomodacaoPacoteInteresse.removeAllItems();
                jCBTransporteAcomodacaoPacoteInteresse.addItem("FERIAS");
                jCBTransporteAcomodacaoPacoteInteresse.addItem("ROMANTICO");
            }
                
        }
        
    }//GEN-LAST:event_jCBDestinoActionPerformed

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
        int hotel = (jCBEstrelas.getSelectedIndex()+1);
        int duracao = Integer.parseInt(jTFDuracao.getText());
        Double diarias = Double.valueOf(jTFDiaria.getText());
        
        String resposta = "RESUMO:\nDESTINO: ";
        resposta += jCBDestino.getSelectedItem();
        resposta += "\nHOTEL: "+ jCBEstrelas.getSelectedItem();
        resposta += "\nDURAÇÃO: "+jTFDuracao.getText()+" DIAS";
        switch(jCBDestino.getSelectedIndex()){
            case 0 -> resposta += "\nPRAIAS: " + jTFCambioPraias.getText() + " PRAIAS." ;
            case 1 -> resposta += "\nPARQUE: " + jCBParque.getSelectedItem();
            case 2 -> resposta += "\nCÂMBIO DÓLAR: R$ " + jTFCambioPraias.getText();
            case 3 -> resposta += "\nCÂMBIO EURO: R$ " + jTFCambioPraias.getText();
        }
        switch(jCBDestino.getSelectedIndex()){
            case 0 -> {
                int praias = Integer.parseInt(jTFCambioPraias.getText());
                PortoSeguro porto = new PortoSeguro(praias, hotel, duracao, diarias);
                Double pre = porto.calculaPreco();
                Double ad = porto.adicional(String.valueOf(jCBTransporteAcomodacaoPacoteInteresse.getSelectedItem()));
                resposta += "\nVALOR: R$ " + pre;
                resposta += "\nADICIONAL: R$ " + ad;
                resposta += "\nTOTAL: R$ " + (pre + ad);
                
            }
            case 1 -> {
                CaldasNovas caldas = new CaldasNovas(jCBParque.getSelectedIndex()==0, hotel, duracao, diarias);
                Double pre = caldas.calculaPreco();
                resposta += "\nVALOR: R$ " + pre;
                Double ad = caldas.adicional(String.valueOf(jCBTransporteAcomodacaoPacoteInteresse.getSelectedItem()));
                if(ad >= 0){
                    resposta += "\nADICIONAL: R$ " + ad;
                }else{
                    resposta += "\nDESCONTO: R$ " + ad * -1;
                }
                resposta += "\nTOTAL: R$ " + (pre + ad);
            }
            case 2 -> {
                String tipo = String.valueOf(jCBTransporteAcomodacaoPacoteInteresse.getSelectedItem());
                NovaYork nova = new NovaYork(tipo, hotel, duracao, diarias);
                Double pre = nova.calculaPreco();
                Double cam = nova.cambio(Double.valueOf(jTFCambioPraias.getText()));
                resposta += "\nVALOR: R$ " + pre;
                resposta += "\nVALOR: US$ " + cam;
            }
            case 3 -> {
                String interesse = String.valueOf(jCBTransporteAcomodacaoPacoteInteresse.getSelectedItem());
                Paris paris = new Paris(interesse, hotel, duracao, diarias);
                Double pre = paris.calculaPreco();
                Double cam = paris.cambio(Double.valueOf(jTFCambioPraias.getText()));
                resposta += "\nVALOR: R$ " + pre;
                resposta += "\nVALOR: E$ " + cam;
            }
        }
        jTAResumo.setText(resposta);
    }//GEN-LAST:event_jBCalcularActionPerformed

    
    
    public void limpar(){
        jCBDestino.setSelectedIndex(0);
        jCBEstrelas.setSelectedIndex(0);
        jTFDiaria.setText("0.00");
        jTFDuracao.setText("0");
        jTAResumo.setText("Resuno:");
        jLCambioPraiasParque.setText("Praias:");
        jTFCambioPraias.setText("0");
        jTFCambioPraias.setSize(150, 25);
        jCBParque.setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox<String> jCBDestino;
    private javax.swing.JComboBox<String> jCBEstrelas;
    private javax.swing.JComboBox<String> jCBParque;
    private javax.swing.JComboBox<String> jCBTransporteAcomodacaoPacoteInteresse;
    private javax.swing.JLabel jLCambioPraiasParque;
    private javax.swing.JLabel jLCargoTipoEspecialidade;
    private javax.swing.JLabel jLConselho;
    private javax.swing.JLabel jLTransporteAcomodacaoPacoteInteresse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAResumo;
    private javax.swing.JTextField jTFCambioPraias;
    private javax.swing.JTextField jTFDiaria;
    private javax.swing.JTextField jTFDuracao;
    // End of variables declaration//GEN-END:variables
}

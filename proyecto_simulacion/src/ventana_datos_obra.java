



public class ventana_datos_obra extends javax.swing.JFrame {

   
    public ventana_datos_obra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_mes = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        caja_inge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caja_costo_obra_perdida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        caja_cua_ini1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        caja_cua_max1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        caja_sueldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        caja_simulacion1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        caja_resi_ini1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        caja_resi_max1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        caja_anio2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        caja_pre_materiales1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        caja_dia_perdido1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        caja_precio_foranea1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        caja_preci_accidentes1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        caja_preci_per_perdido1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        caja_multas1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        caja_cam_material1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        caja_carne_asada1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        caja_costo_laboratorio1 = new javax.swing.JTextField();
        boton_salir = new javax.swing.JButton();
        boton_simular1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        caja_sueldo_res = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        caja_precio_social = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        caja_precio_popular = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        caja_preci_residen = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        caja_costo_maqui = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        caja_costo_permisos = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        caja_fact_utilidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de Entrada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Mes Inicio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 30));

        combo_mes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(combo_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Año Inicio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, 30));
        getContentPane().add(caja_inge, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Costo Obra Perdida");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 210, 30));
        getContentPane().add(caja_costo_obra_perdida, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Cuadrillas Iniciales");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 30));
        getContentPane().add(caja_cua_ini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Cuadrillas Maximas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 30));
        getContentPane().add(caja_cua_max1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Sueldo Cuadrillas ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 30));
        getContentPane().add(caja_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Semanas Simulación");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 190, 30));
        getContentPane().add(caja_simulacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Recidentes Iniciales ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 190, 30));
        getContentPane().add(caja_resi_ini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Recidentes Maximos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 190, 30));
        getContentPane().add(caja_resi_max1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 120, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Ingenieros");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 30));
        getContentPane().add(caja_anio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 120, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("Precio Materiales");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 190, 30));
        getContentPane().add(caja_pre_materiales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 120, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Día Perdido");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 190, 30));
        getContentPane().add(caja_dia_perdido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel14.setText("Costo Cuadrilla Foranea");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 220, 30));
        getContentPane().add(caja_precio_foranea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 120, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel15.setText("Costo Accidentes");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 220, 30));
        getContentPane().add(caja_preci_accidentes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 120, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setText("Costo Personal Perdido");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 220, 30));
        getContentPane().add(caja_preci_per_perdido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 120, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel17.setText("Multas");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 220, 30));
        getContentPane().add(caja_multas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 120, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel18.setText("Cambio Material");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 220, 30));
        getContentPane().add(caja_cam_material1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 120, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel19.setText("Carnes Asadas");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 220, 30));
        getContentPane().add(caja_carne_asada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 120, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel20.setText("Costo Laboratorio");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 210, 30));
        getContentPane().add(caja_costo_laboratorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 120, 30));

        boton_salir.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        boton_salir.setText("Salir");
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
        });
        getContentPane().add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 140, 40));

        boton_simular1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        boton_simular1.setText("Simular");
        boton_simular1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_simular1MouseClicked(evt);
            }
        });
        getContentPane().add(boton_simular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 140, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel22.setText("Sueldo Residentes");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 190, 30));
        getContentPane().add(caja_sueldo_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 120, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel23.setText("Precio Intreres Social");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 200, 30));
        getContentPane().add(caja_precio_social, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 120, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel24.setText("Precio Popular ");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 220, 30));
        getContentPane().add(caja_precio_popular, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 120, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel25.setText("Precio Recidencial");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 220, 30));
        getContentPane().add(caja_preci_residen, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 120, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel26.setText("Costo Maquinaria");
        jLabel26.setToolTipText("");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 220, 30));
        getContentPane().add(caja_costo_maqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 120, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel27.setText("Costo Permisos");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 220, 30));
        getContentPane().add(caja_costo_permisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 120, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel28.setText("Factor Utilidad");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 220, 30));
        getContentPane().add(caja_fact_utilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 120, 30));

        jButton1.setText("Prueba");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_simular1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_simular1MouseClicked
        // TODO add your handling code here:
        int mes_inicio,anio_inicio,cuadrillas_iniciales,cuadrillas_maximas,sem_sim,res_ini,res_max,inge,dias_de_incio_segun_el_mes=0;
        double sueldo_cua,pre_material,dia_perdido,cuadrilla_fo,costo_aci,costo_per_perdido,multas,cam_material,car_asada,costo_laboratorio,obra_perdida,sueldos_resi,pre_social,pre_popular,pre_resi,costo_maquina,costo_permiso,fact_utilidad ;
        
        mes_inicio=combo_mes.getSelectedIndex();
        anio_inicio=Integer.parseInt(caja_anio2.getText());
        cuadrillas_iniciales=Integer.parseInt(caja_cua_ini1.getText());
        cuadrillas_maximas=Integer.parseInt(caja_cua_max1.getText());
        sem_sim=Integer.parseInt(caja_simulacion1.getText());
        sueldo_cua=Double.parseDouble(caja_sueldo.getText());
        res_ini=Integer.parseInt(caja_resi_ini1.getText());
        res_max=Integer.parseInt(caja_resi_max1.getText());
        inge=Integer.parseInt(caja_inge.getText());
        pre_material=Double.parseDouble(caja_pre_materiales1.getText());
        dia_perdido=Double.parseDouble(caja_dia_perdido1.getText());
        cuadrilla_fo=Double.parseDouble(caja_precio_foranea1.getText());
        costo_aci=Double.parseDouble(caja_preci_accidentes1.getText());
        costo_per_perdido=Double.parseDouble(caja_preci_per_perdido1.getText());
        multas=Double.parseDouble(caja_multas1.getText());
        cam_material=Double.parseDouble(caja_cam_material1.getText());
        car_asada=Double.parseDouble(caja_carne_asada1.getText());
        costo_laboratorio=Double.parseDouble(caja_costo_laboratorio1.getText());
        obra_perdida=Double.parseDouble(caja_costo_obra_perdida.getText());
        sueldos_resi=Double.parseDouble(caja_sueldo_res.getText());
        pre_social=Double.parseDouble(caja_precio_social.getText());
        pre_popular=Double.parseDouble(caja_precio_popular.getText());
        pre_resi=Double.parseDouble(caja_preci_residen.getText());
        costo_maquina=Double.parseDouble(caja_costo_maqui.getText());
        costo_permiso=Double.parseDouble(caja_costo_permisos.getText());
        fact_utilidad=Double.parseDouble(caja_fact_utilidad.getText());
        if (mes_inicio==0){
            System.out.println("Entre a la condicion Enero");
            dias_de_incio_segun_el_mes=1;
            System.out.println("Este es el valor del contador"+ dias_de_incio_segun_el_mes);}
        else if (mes_inicio==1){
            System.out.println("Entre a la condicion Febrero");
            dias_de_incio_segun_el_mes = 32;
            System.out.println("Este es el valor del contador"+dias_de_incio_segun_el_mes);}
        else if (mes_inicio==2){
            System.out.println("Entre a la condicion Marzo");
            dias_de_incio_segun_el_mes = 60;
            System.out.println("Este es el valor del contador"+dias_de_incio_segun_el_mes);}
        else if (mes_inicio==3){
            System.out.println("Entre a la condicion Abril");
            dias_de_incio_segun_el_mes = 91;
            System.out.println("Este es el valor del contador"+dias_de_incio_segun_el_mes);}
        else if (mes_inicio==4) {
            System.out.println("Entre a la condicion Mayo");
            dias_de_incio_segun_el_mes = 121;
            System.out.println("Este es el valor del contador"+dias_de_incio_segun_el_mes);}
        else if (mes_inicio==5) {
            System.out.println("Entre a la condicion Junio");
            dias_de_incio_segun_el_mes = 152;
            System.out.println("Este es el valor del contador"+dias_de_incio_segun_el_mes);}
        if (mes_inicio==6){
            System.out.println("Entre a la condicion Julio");
            dias_de_incio_segun_el_mes = 182;
            System.out.println("Este es el valor del contador" + dias_de_incio_segun_el_mes);
            }
        else if(mes_inicio==7){
           System.out.println("Entre a la condicion Agosto");
            dias_de_incio_segun_el_mes = 213;
            System.out.println("Este es el valor del contador" + dias_de_incio_segun_el_mes); 
        }
        else if(mes_inicio==8){
           System.out.println("Entre a la condicion Septiembre");
            dias_de_incio_segun_el_mes = 244;
            System.out.println("Este es el valor del contador" + dias_de_incio_segun_el_mes); 
        }
        else if(mes_inicio==9){
           System.out.println("Entre a la condicion Octubre");
            dias_de_incio_segun_el_mes = 274;
            System.out.println("Este es el valor del contador" + dias_de_incio_segun_el_mes); 
        }
        else if(mes_inicio==10){
           System.out.println("Entre a la condicion Noviembre");
            dias_de_incio_segun_el_mes = 305;
            System.out.println("Este es el valor del contador" + dias_de_incio_segun_el_mes); 
        }
        else if(mes_inicio==11){
           System.out.println("Entre a la condicion Diciembre");
            dias_de_incio_segun_el_mes = 335;
            System.out.println("Este es el valor del contador" + dias_de_incio_segun_el_mes); 
        }
        if (dias_de_incio_segun_el_mes<=120 || dias_de_incio_segun_el_mes>=305){
            System.out.println("Es una temporada baja");
        }
         else if (dias_de_incio_segun_el_mes>120 && dias_de_incio_segun_el_mes<305){
            System.out.println("Es una temporada Alta");
        }
        if ((anio_inicio-2000)%3==0){
            System.out.println("Es una temporada Electoral");
        }
    }//GEN-LAST:event_boton_simular1MouseClicked

    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_salirMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_boton_salirMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        double aleatorio;
        Math.random();
        System.out.println(Math.random());
        //proyecto_simulacion.resultados_simulacion.Simulacion();
    }//GEN-LAST:event_jButton1MouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana_datos_obra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_datos_obra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_datos_obra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_datos_obra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_datos_obra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_salir;
    private javax.swing.JButton boton_simular1;
    private javax.swing.JTextField caja_anio2;
    private javax.swing.JTextField caja_cam_material1;
    private javax.swing.JTextField caja_carne_asada1;
    private javax.swing.JTextField caja_costo_laboratorio1;
    private javax.swing.JTextField caja_costo_maqui;
    private javax.swing.JTextField caja_costo_obra_perdida;
    private javax.swing.JTextField caja_costo_permisos;
    private javax.swing.JTextField caja_cua_ini1;
    private javax.swing.JTextField caja_cua_max1;
    private javax.swing.JTextField caja_dia_perdido1;
    private javax.swing.JTextField caja_fact_utilidad;
    private javax.swing.JTextField caja_inge;
    private javax.swing.JTextField caja_multas1;
    private javax.swing.JTextField caja_pre_materiales1;
    private javax.swing.JTextField caja_preci_accidentes1;
    private javax.swing.JTextField caja_preci_per_perdido1;
    private javax.swing.JTextField caja_preci_residen;
    private javax.swing.JTextField caja_precio_foranea1;
    private javax.swing.JTextField caja_precio_popular;
    private javax.swing.JTextField caja_precio_social;
    private javax.swing.JTextField caja_resi_ini1;
    private javax.swing.JTextField caja_resi_max1;
    private javax.swing.JTextField caja_simulacion1;
    private javax.swing.JTextField caja_sueldo;
    private javax.swing.JTextField caja_sueldo_res;
    private javax.swing.JComboBox combo_mes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}


package proyecto_simulacion;

import javax.swing.table.DefaultTableModel;
import proyecto_simulacion.Tablas_Probabilidad.*;

public class resultados_simulacion extends javax.swing.JFrame {
public static DefaultTableModel modelo,modelo2,modelo3,modelo1,modelo12;     


  
    public resultados_simulacion() {
        initComponents();
        modelo=new DefaultTableModel();
        modelo.addColumn("Día");
        modelo.addColumn("n/a trabajo simple");
        modelo.addColumn("Días trabajo");
        modelo.addColumn("Día Inicio");
        modelo.addColumn("n/a actividades ts ");
        modelo.addColumn("Actividad");
        modelo.addColumn("n/a Duración");
        modelo.addColumn("Días");
        modelo.addColumn("Día termino");
        modelo.addColumn("n/a Acabados");
        modelo.addColumn("Acabado");
        modelo.addColumn("n/a Metros Cuadrados");
        modelo.addColumn("Metros Cuadrados");
        modelo.addColumn("n/a Factor");
        modelo.addColumn("Factor");
        modelo.addColumn("Precio");
        modelo.addColumn("n/a Personal");
        modelo.addColumn("Personal");
        modelo.addColumn("Costo personal");
        modelo.addColumn("Costo Material");    
        modelo.addColumn("Total");      
        this.Tabla2.setModel(modelo);
        
        
        modelo1=new DefaultTableModel();
        modelo12=new DefaultTableModel();
        modelo1.addColumn("iteracion");
        modelo1.addColumn("dia actual");
        modelo1.addColumn("n/a tiempo de espera");
        modelo1.addColumn("dia de inicio de nueva obra");
        modelo1.addColumn("n/a magnitud de obra");
        modelo1.addColumn("magnitud de obra");
        modelo1.addColumn("n/a duracion de la obra");
        modelo1.addColumn("duracion de la obra");
        modelo1.addColumn("fecha de termino");
        modelo1.addColumn("n/a personal necesario");
        modelo1.addColumn("personal necesario");
        modelo1.addColumn("personal disponible");
        modelo1.addColumn("n/a tipo de acabado");
        modelo1.addColumn("tipo de acabado");
        modelo1.addColumn("n/a volumen");
        modelo1.addColumn("volumen");
        modelo1.addColumn("n/a cancelacion temporal");
        modelo1.addColumn("cancelacion");
        modelo1.addColumn("n/a clausura");
        modelo1.addColumn("clausura");
        modelo12.addColumn("iteracion");
        modelo12.addColumn("n/a accidente");
        modelo12.addColumn("accidente");
        modelo12.addColumn("n/a tramites");
        modelo12.addColumn("tramites");
        modelo12.addColumn("n/a cuadrillas mas eficientes");
        modelo12.addColumn("cuadrillas mas eficientes");
        modelo12.addColumn("n/a enfermedad");
        modelo12.addColumn("enfermedad");
        modelo12.addColumn("n/a laboratorio");
        modelo12.addColumn("laboratorio");
        modelo12.addColumn("n/a ocacsiones de laboratorio");
        modelo12.addColumn("ocasiones");
        modelo12.addColumn("n/a personal calificado");
        modelo12.addColumn("personal");
        modelo12.addColumn("n/a tiempo");
        modelo12.addColumn("tiempo");
        modelo12.addColumn("n/a contratacion maquinaria");
        modelo12.addColumn("maquinaria");
        modelo12.addColumn("costo material");
        modelo12.addColumn("n/a carne asada");
        modelo12.addColumn("carne asada");
        modelo12.addColumn("total");
        modelo12.addColumn("isr");

        this.Tabla.setModel(modelo1);
        this.Tabla3.setModel(modelo12);
        modelo2=new DefaultTableModel();
        modelo3=new DefaultTableModel();
        modelo2.addColumn("Mes");
        modelo3.addColumn("Mes");
        modelo2.addColumn("n/a tipo de obra");
        modelo2.addColumn("Tipo de obra");
        modelo2.addColumn("n/a magnitud de obra");
        modelo2.addColumn("Magnitud");
        modelo2.addColumn("n/a personal necesario");
        modelo2.addColumn("Personal");
        modelo2.addColumn("Duración");
        modelo2.addColumn("Día inicio");
        modelo2.addColumn("n/a precio licitacion");
        modelo2.addColumn("Precio dia");
        modelo2.addColumn("Precio total");
        modelo2.addColumn("Día termino");
        modelo2.addColumn("costo personal");
        modelo2.addColumn("Personal disponioble");
        modelo2.addColumn("n/a cancelaciones");
        modelo2.addColumn("cancelacion");
        modelo2.addColumn("n/a clausura");
        modelo2.addColumn("Clausura");
        modelo3.addColumn("n/a accidentes");
        modelo3.addColumn("Accidentes");
        modelo3.addColumn("n/a Cuadrillas eficientes");
        modelo3.addColumn("Cuadrillas eficientes");
        modelo3.addColumn("n/a enfermedad");
        modelo3.addColumn("Enfermedad");
        modelo3.addColumn("n/a laboratorio");
        modelo3.addColumn("Laboratorio");
        modelo3.addColumn("n/a ocasiones laboratorio");
        modelo3.addColumn("ocasiones");
        modelo3.addColumn("n/a Personal");
        modelo3.addColumn("Personal");
        modelo3.addColumn("n/a tiempo contratacion");
        modelo3.addColumn("tiempo contratacion");
        modelo3.addColumn("precio maquinaria");
        modelo3.addColumn("costo material");
        modelo3.addColumn("Carne asada");
        modelo3.addColumn("Total");
        modelo3.addColumn("Total tras isr");
        this.Tabla1.setModel(modelo2);
        this.Tabla4.setModel(modelo3);
        
    }
    static public void Simulacion(int mes_inicio, int anio_inicio, int cuadrillas_iniciales, int cuadrillas_maximas, int sem_sim, int res_ini, int res_max, int inge, int dias_de_incio_segun_el_mes, double sueldo_cua, double dia_perdido, double cuadrilla_fo, double costo_aci, double costo_per_perdido, double multas, double car_asada, double costo_laboratorio, double obra_perdida, double sueldos_resi, double pre_social, double pre_popular, double pre_resi, double costo_maquina, double costo_permiso, double fact_utilidad,int TBA){
        System.out.println("hola");
    int contador=1,iteraciones=1,personal=0;
    String[] NO1=new String[20];
    String[] NO2=new String[23];
    String[] TS=new String[21];
    String[] L1=new String[19];
    String[] L2=new String[20];
    double a;
    
    double accidentes=0.0;
double enfermedad=0.0;
double ocaciones=0.0;
    double personales=0.0,aux=0.0,total=0.0;
    while (contador<=sem_sim){
        if (contador<=120 || contador>=305){
            TBA=0;
        }
         else if (contador>120 && contador<305){
            TBA=1;
        }
        NO1[0]=String.valueOf(iteraciones);
        NO1[1]=String.valueOf(contador);
        a=Math.random();
        NO1[2]=String.valueOf(a);
        if (TBA==1){
            NO1[3]=String.valueOf(7*proyecto_simulacion.Tablas_Probabilidad.tiempo_de_espera_alta(a));}
        else{
            NO1[3]=String.valueOf(7*proyecto_simulacion.Tablas_Probabilidad.tiempo_de_espera_baja(a));
        }
        a=Math.random();
        NO1[4]=String.valueOf(a);
        NO1[5]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.magnitud_de_obra(a));
            switch (Integer.parseInt(NO1[5])) {
                case 100:
                    a=Math.random();
                    NO1[6]=String.valueOf(a);
                    NO1[7]=String.valueOf(7*proyecto_simulacion.Tablas_Probabilidad.duracion_100(a));
                    a=Math.random();
                    NO1[9]=String.valueOf(a);
                    NO1[10]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal_necesario_100(a));
                    break;
                case 200:
                    a=Math.random();
                    NO1[6]=String.valueOf(a);
                    NO1[7]=String.valueOf(7*proyecto_simulacion.Tablas_Probabilidad.duracion_200(a));
                    a=Math.random();
                    NO1[9]=String.valueOf(a);
                    NO1[10]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal_necesario_200(a));
                    break;
                case 300:
                    a=Math.random();
                    NO1[6]=String.valueOf(a);
                    NO1[7]=String.valueOf(7*proyecto_simulacion.Tablas_Probabilidad.duracion_300(a));
                    a=Math.random();
                    NO1[9]=String.valueOf(a);
                    NO1[10]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal_necesario_300(a));
                    break;
                case 400:
                    a=Math.random();
                    NO1[6]=String.valueOf(a);
                    NO1[7]=String.valueOf(7*proyecto_simulacion.Tablas_Probabilidad.duracion_400(a));
                    a=Math.random();
                    NO1[9]=String.valueOf(a);
                    NO1[10]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal_necesario_400(a));
                    break;
                case 500:
                    a=Math.random();
                    NO1[6]=String.valueOf(a);
                    NO1[7]=String.valueOf(7*proyecto_simulacion.Tablas_Probabilidad.duracion_500(a));
                    a=Math.random();
                    NO1[9]=String.valueOf(a);
                    NO1[10]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal_necesario_500(a));
                    break;
            }
        NO1[8]=String.valueOf(Integer.parseInt(NO1[7])+Integer.parseInt(NO1[3]));
        personal=cuadrillas_maximas-Integer.parseInt(NO1[10]);
        NO1[11]=String.valueOf(personal);
        a=Math.random();
        NO1[12]=String.valueOf(a);
        NO1[13]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tipo_de_acabado(a));
        a=Math.random();
        NO1[14]=String.valueOf(a);
        NO1[15]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.volumen(a));
        a=Math.random();
        NO1[16]=String.valueOf(a);
        NO1[17]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.volumen(a));
        a=Math.random();
        NO1[18]=String.valueOf(a);
        NO1[19]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.volumen(a));
        NO2[0]=String.valueOf(iteraciones);
        /*TS[0]=String.valueOf(contador);
        a=Math.random();
        TS[1]=String.valueOf(a);
        TS[2]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tiempo_espera_ts(a));
        TS[3]=String.valueOf(Integer.parseInt(TS[2])+Integer.parseInt(TS[0]));
        a=Math.random();
        TS[4]=String.valueOf(a);
        TS[5]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.actividad_ts(a));
        a=Math.random();
        TS[6]=String.valueOf(a);
        TS[7]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.actividad_ts(a));*/
        a=Math.random();
        NO1[2]=String.valueOf(a);
        
        //tabla trabajos simples
        TS[0]=String.valueOf(contador);
        a=Math.random();
        TS[1] = String.valueOf(a);
        TS[2]=String.valueOf((proyecto_simulacion.Tablas_Probabilidad.trabajos_simples(a)));
        TS[3] = String.valueOf(contador+Integer.parseInt(TS[2]));
        a=Math.random();
        TS[4]=String.valueOf(a);
        TS[5]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.actividad_ts(a));
        a=Math.random();
        TS[6] = String.valueOf(a);
        TS[7] = String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tiempo_espera_ts(a));
        TS[8] = String.valueOf(Integer.parseInt(TS[3])+Integer.parseInt(TS[7]));
        //L1[8]=dia termino;
        a=Math.random();
        TS[9] = String.valueOf(a);
        TS[10] = String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tipo_de_acabado(a));  
         a=Math.random();
        TS[11] = String.valueOf(a);
        TS[12] = String.valueOf(proyecto_simulacion.Tablas_Probabilidad.m2_remodelacion(a));  
        a=Math.random();
        TS[13] = String.valueOf(a);
        TS[14] = String.valueOf(proyecto_simulacion.Tablas_Probabilidad.volumen1(a));  
        
        //L1[15] = String.valueOf(a);  precio
         if("Interes_social".equals(String.valueOf(TS[10]))){
            TS[15] = String.valueOf(pre_social*Double.parseDouble(TS[14])*Integer.parseInt(TS[12]));
        //System.out.println("Es un acabado de interes social");
    }
    else if ("Popular".equals(String.valueOf(TS[10]))){
             TS[15] = String.valueOf(pre_popular*Double.parseDouble(TS[14])*Integer.parseInt(TS[12]));
         //System.out.println("Es un acabado Popular");
    }
    else if ("Residencial".equals(String.valueOf(TS[10]))){
             TS[15] = String.valueOf(pre_resi*Double.parseDouble(TS[14])*Integer.parseInt(TS[12]));
        //System.out.println("Es un acabado Recidencial");
       
    }
        a=Math.random();
        TS[16] = String.valueOf(a);
        TS[17] = String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal(a));  
        if ("no".equals(String.valueOf(TS[17])))
        {
            TS[18] = String.valueOf(0);
        }
        else if ("foranea".equals(String.valueOf(TS[17])))
        {
            TS[18] = String.valueOf(cuadrilla_fo*(Double.parseDouble(TS[7])/7));
        }
        else if ("certificado".equals(String.valueOf(TS[17])))
        {
             TS[18] = String.valueOf((cuadrilla_fo*1.2)*Double.parseDouble(TS[7])/7);
        }
        else if ("especialista".equals(String.valueOf(TS[17])))
        {
             TS[18] = String.valueOf((cuadrilla_fo*1.4)*Double.parseDouble(TS[7])/7);
        }
        
        
        TS[19] = String.valueOf(fact_utilidad*Double.parseDouble(TS[15]));
        TS[20] = String.valueOf(Double.parseDouble(TS[15])-Double.parseDouble(TS[19])-Double.parseDouble(TS[18]));
        //L1[18] = String.valueOf(a); costo personal
        //L1[19] = String.valueOf(a);  costo material
        
        
        //codigo aparte 
        L1[0]="Enero";
a=Math.random();
L1[1]=String.valueOf(a);
L1[2]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tipo_obra_gobierno(a));
a=Math.random();
L1[3]=String.valueOf(a);
L1[4]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.magnitud_obra_gobierno(a));
a=Math.random();
L1[5]=String.valueOf(a);
L1[6]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal_necesario(a));
L1[7]=String.valueOf(Integer.parseInt(L1[4])*30);
L1[8]=String.valueOf(contador);
a=Math.random();
L1[9]=String.valueOf(a);
L1[10]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.precio_licitacion(a));
     L1[11]=String.valueOf(Integer.parseInt(L1[7])*Integer.parseInt(L1[10]));
L1[12]=String.valueOf(Integer.parseInt(L1[4])*30+contador);
L1[13]=String.valueOf(Integer.parseInt(L1[7])*(sueldo_cua/7));
personal=cuadrillas_maximas-Integer.parseInt(L1[6]);
L1[14]=String.valueOf(personal);
a=Math.random();
L1[15]=String.valueOf(a);
L1[16]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.recision_contrato(a));
a=Math.random();
L1[17]=String.valueOf(a);
L1[18]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.clausuras(a));
L2[0]="Enero";
a=Math.random();
L2[1]=String.valueOf(a);
L2[2]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.accidentes(a));
a=Math.random();
L2[3]=String.valueOf(a);
L2[4]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.cuadrilla_eficiente(a));
a=Math.random();
L2[5]=String.valueOf(a);
L2[6]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.enfermedad(a));
a=Math.random();
L2[7]=String.valueOf(a);
L2[8]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.necesidad_laboratorio(a));
a=Math.random();
L2[9]=String.valueOf(a);
L2[10]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.ocasiones_laboratorio(a));
a=Math.random();
L2[11]=String.valueOf(a);
L2[12]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal(a));
a=Math.random();
L2[13]=String.valueOf(a);

        if ("no".equals(String.valueOf(L2[12])))
        {
            L2[14] = String.valueOf(0);
            personales=0.0;
        }
        else if ("foranea".equals(String.valueOf(L2[12])))
        {
            L2[14]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tiempo_cuadrilla_foranea(a));
            personales=sueldo_cua;
        }
        else if ("certificado".equals(String.valueOf(L2[12])))
        {
             L2[14]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tiempo_certificada(a));
             personales=sueldo_cua*1.2;
        }
        else if ("especialista".equals(String.valueOf(L2[12])))
        {
             L2[14]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.tiempo_especialista(a));
             personales=sueldo_cua*1.4;
        }
//L2[14]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.personal(a));
L2[15]=String.valueOf(costo_maquina*Integer.parseInt(L1[7]));

a=Math.random();
L2[17]=String.valueOf(proyecto_simulacion.Tablas_Probabilidad.carnes_asadas(a));


L2[16]=String.valueOf(Integer.parseInt(L1[11])*(fact_utilidad));

aux=personales*Double.parseDouble(L2[16]);

accidentes = Double.parseDouble(L2[2])*costo_aci;
enfermedad=Double.parseDouble(L2[6])*dia_perdido;
ocaciones=costo_laboratorio*Double.parseDouble(L2[10]);

L2[18]=String.valueOf(((Integer.parseInt(L1[7])*Integer.parseInt(L1[10]))+(Integer.parseInt(L2[4])*(sueldo_cua/7)*(Integer.parseInt(L1[6]))))-aux-accidentes-enfermedad-ocaciones-((Integer.parseInt(L2[17]))*car_asada)-Double.parseDouble(L2[16])-Double.parseDouble(L2[15]));
total=Double.parseDouble(L2[18])*0.6;
L2[19]=String.valueOf(Double.parseDouble(L2[18])-total);
modelo2.addRow(L1);
modelo3.addRow(L2);
        
        
        
        
        modelo12.addRow(NO2);
        modelo1.addRow(NO1);
        modelo.addRow(TS);
        
        //modelo.addRow(L1);
        break;
        
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        boton_resultados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla3 = new javax.swing.JTable();
        Licitaciones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1890, 40));

        boton_resultados.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        boton_resultados.setText("Mostrar Resultados");
        boton_resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_resultadosMouseClicked(evt);
            }
        });
        getContentPane().add(boton_resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 650, 50));

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabla1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1130, 80));

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(Tabla2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1130, 70));

        Tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(Tabla3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1890, 60));

        Licitaciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Licitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Licitaciones.setText("Licitaciones");
        getContentPane().add(Licitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 1910, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Obras Normales");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1910, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Trabajos simples");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1910, 40));

        Tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(Tabla4);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 1130, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_resultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_resultadosMouseClicked
    int[] NO1=new int[20];
    int[] NO2=new int[23];
    int[] TS=new int[20];
    int[] L1=new int[19];
    int[] L2=new int[18];
        
    }//GEN-LAST:event_boton_resultadosMouseClicked

    
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
            java.util.logging.Logger.getLogger(resultados_simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultados_simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultados_simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultados_simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultados_simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Licitaciones;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTable Tabla3;
    private javax.swing.JTable Tabla4;
    private javax.swing.JButton boton_resultados;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}

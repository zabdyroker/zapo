
package diseño;




import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IngresoCliente extends javax.swing.JInternalFrame {
    DefaultTableModel model;

    public IngresoCliente() {
        initComponents();
        bloquear();
        cargar("");
        mostrartipo();
        municipio();
        idclien();
    }
     void bloquear(){
    txtcod.setEnabled(false);
    txtnom.setEnabled(false);
    txtpaterno.setEnabled(false);
    txtdir.setEnabled(false);
    
    
    txtruc.setEnabled(false);
    
    cbosexo.setEnabled(false);
    btnguardar.setEnabled(false);
    btnnuevo.setEnabled(true);
    btncancelar.setEnabled(false);
    btnactualizar.setEnabled(false);
    
    }
    void limpiar(){
    txtcod.setText("");
    txtnom.setText("");
    txtdir.setText("");
    txtmaterno.setText("");
    
    txtruc.setText("");
    
    txtpaterno.setText("");
    
    }
    void desbloquear(){
    txtcod.setEnabled(true);
    txtnom.setEnabled(true);
    txtpaterno.setEnabled(true);
    txtdir.setEnabled(true);
    txtmaterno.setEnabled(true);
    
    txtruc.setEnabled(true);
    
    cbosexo.setEnabled(true);
    btnguardar.setEnabled(true);
    btnnuevo.setEnabled(false);
    btncancelar.setEnabled(true);
    btnactualizar.setEnabled(false);
    cobotipo.setEnabled(true);
    }
    void cargar(String valor){
    String mostrar="SELECT * FROM cat_cliente INNER JOIN domicilio ON cat_cliente.idcat_cliente = domicilio.id_cliente WHERE (idcat_cliente) LIKE '%"+valor+"%'";
    String []titulos={"Codigo","Apellido Paterno","Apellido materno","RFC","tipo","Razon Social","Sexo","ID domicilio","Codigo Postal","Calle","Numero Exterior","Numero Interior","Colonia","Localidad","Municipio","Distrito","Entre Calles","Calle Poterior","Descripcion","Telefono","ID Cliente"};
    String []Registros=new String[22];
    model= new DefaultTableModel(null,titulos);
  
        try {
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString(1);
                  Registros[1]= rs.getString(2);
                  Registros[2]= rs.getString(3);
                  Registros[3]= rs.getString(4);
                  Registros[4]= rs.getString(5);
                  Registros[5]= rs.getString(6);
                  Registros[6]= rs.getString(7);
                  Registros[7]= rs.getString(8);
                  Registros[8]= rs.getString(9);
                  Registros[9]= rs.getString(10);
                  Registros[10]= rs.getString(11);
                  Registros[11]= rs.getString(12);
                  Registros[12]= rs.getString(13);
                  Registros[13]= rs.getString(14);
                  Registros[14]= rs.getString(15);
                  Registros[15]= rs.getString(16);
                  Registros[16]= rs.getString(17);
                  Registros[17]= rs.getString(18);
                  Registros[18]= rs.getString(19);
                  Registros[19]= rs.getString(20);
                  Registros[20]= rs.getString(21);
                  Registros[21]= rs.getString(22);
                 
                  
                  model.addRow(Registros);
              }
              tbclientes.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
    void codigosclientes(){
     int j;
        int cont=1;
        String num="";
        String c="";
         String SQL="select max(idcat_cliente) from cat_cliente";
       // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next())
            {              
                 c=rs.getString(1);
            }
           
                  
            if(c==null){
                txtcod.setText("CC0001");
            }
            else{
            char r1=c.charAt(2);
            char r2=c.charAt(3);
            char r3=c.charAt(4);
            char r4=c.charAt(5);
            String r="";
            r=""+r1+r2+r3+r4;
            
                 j=Integer.parseInt(r);
                 GenerarCodigos gen= new GenerarCodigos();
                 gen.generar(j);
                 txtcod.setText("CC"+gen.serie());
                
            
            }
       
          
                  
           
           
         
        } catch (SQLException ex) {
           Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnmodificar = new javax.swing.JMenuItem();
        mneliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbosexo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtdir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        cobotipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtmaterno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        cbo0 = new javax.swing.JComboBox<>();
        cbo1 = new javax.swing.JComboBox<>();
        txtLocalidad = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNumeroEx = new javax.swing.JTextField();
        txtNumeroIn = new javax.swing.JTextField();
        txtCalles = new javax.swing.JTextField();
        txtCallesPos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextArea();
        txtTelefono = new javax.swing.JTextField();
        cbo2 = new javax.swing.JComboBox<>();
        btnnuevo = new javax.swing.JButton();

        mnmodificar.setText("Modificar");
        mnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnmodificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnmodificar);

        mneliminar.setText("Eliminar");
        mneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneliminar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO DE CLIENTES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Cliente"));

        jLabel1.setText("Codigo:");

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombres:");

        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellidos Paterno");

        txtpaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpaternoKeyTyped(evt);
            }
        });

        jLabel5.setText("Sexo:");

        cbosexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cbosexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosexoActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo");

        jLabel8.setText("Razon social");

        jLabel9.setText("RFC:");

        txtruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrucKeyTyped(evt);
            }
        });

        cobotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fisica", "Moral" }));

        jLabel4.setText("Apellido Materno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cobotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cobotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnactualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsalir)
                .addContainerGap())
        );

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbclientes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tbclientes);

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        btnbuscar.setText("Mostrar Todos");

        jLabel10.setText("BUSCAR:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Domicilio Cliente"));

        jLabel12.setText("Codigo Postal");

        jLabel13.setText("Calle");

        jLabel14.setText("Numero exterior");

        jLabel15.setText("Numero Interior");

        jLabel16.setText("Colonia");

        jLabel17.setText("Localidad");

        jLabel18.setText(" Municipio");

        jLabel19.setText("Estado");

        jLabel20.setText("Distrito");

        jLabel21.setText("Entre que Calles ");

        jLabel22.setText("Calle Posterior:");

        jLabel23.setText("Descripcion");

        jLabel24.setText("Telefono");

        jLabel25.setText("ID Cliente");

        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        txtLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidadActionPerformed(evt);
            }
        });

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });

        txtNumeroEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroExActionPerformed(evt);
            }
        });

        txtNumeroIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroInActionPerformed(evt);
            }
        });

        txtDescrip.setColumns(20);
        txtDescrip.setRows(5);
        jScrollPane1.setViewportView(txtDescrip);

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCallesPos))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCalles, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(txtNumeroIn))))
                        .addGap(71, 71, 71)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDistrito)
                                                .addComponent(cbo0, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtLocalidad)
                                                .addComponent(txtColonia)
                                                .addComponent(txtCalle)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNumeroEx)))))
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel23)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel20)
                                            .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel19)
                                            .addComponent(cbo0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel18)
                                            .addComponent(cbo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel16))
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(cbo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumeroEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNumeroIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtCalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtCallesPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
// TODO add your handling code here:
    try {
        PreparedStatement pst = cn.prepareStatement("UPDATE cat_cliente SET sexo='"
           
            +cbosexo.getSelectedItem().toString()+"',paterno='"
            +txtnom.getText()+"',materno='"
            +txtpaterno.getText()+"',nombre='"
            +txtmaterno.getText()+"',RFC='"
            +txtruc.getText()+"',tipo='"
            +txtdir.getText()+"',razon_social='"
            +cobotipo.getSelectedItem().toString()+"' WHERE idcat_cliente='"+txtcod.getText()+"'");
           
                
      
        pst.executeUpdate();
        cargar("");
          bloquear();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
    
}//GEN-LAST:event_btnactualizarActionPerformed

private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_btnsalirActionPerformed

private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
// TODO add your handling code here:
     desbloquear();
     limpiar();
     codigosclientes();
     txtcod.requestFocus();
}//GEN-LAST:event_btnnuevoActionPerformed

private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
// TODO add your handling code here:
    bloquear();
}//GEN-LAST:event_btncancelarActionPerformed

private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
// TODO add your handling code here:
    String cod,razon,nom,ape,apellima,sex,tipo,rfc;
            String sql="";
            cod=txtcod.getText();
            nom=txtnom.getText();
            ape=txtpaterno.getText();
            apellima=txtmaterno.getText();
            rfc=txtruc.getText();
            razon=txtdir.getText();
            tipo=cobotipo.getSelectedItem().toString();
            sex=cbosexo.getSelectedItem().toString();
           
            
           
         
            sql="INSERT INTO cat_cliente (idcat_cliente,paterno,materno,nombre,RFC,tipo,razon_social,sexo) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, cod);
            pst.setString(2, nom);
            pst.setString(3, ape);
            pst.setString(4, apellima);
            pst.setString(5, rfc);
            pst.setString(6, razon);
            pst.setString(7, sex);
            pst.setString(8, tipo);
            int n=pst.executeUpdate();
            if(n>0){
        
                
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            bloquear();
            }
            cargar("");
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnguardarActionPerformed

private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_txtbuscarActionPerformed

private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
// TODO add your handling code here:
    cargar(txtbuscar.getText());
}//GEN-LAST:event_txtbuscarKeyReleased

private void txtrucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrucKeyTyped
// TODO add your handling code here:
char car = evt.getKeyChar();
if(txtruc.getText().length()>=11) evt.consume();
if((car<'0' || car>'9')) evt.consume();
}//GEN-LAST:event_txtrucKeyTyped

private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
// TODO add your handling code here:
char car = evt.getKeyChar();    
if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
{
   evt.consume();
}
}//GEN-LAST:event_txtnomKeyTyped

private void txtpaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaternoKeyTyped
// TODO add your handling code here:
    char car = evt.getKeyChar();    
if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
{
   evt.consume();
}
}//GEN-LAST:event_txtpaternoKeyTyped

private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
// TODO add your handling code here:
    int fila= tbclientes.getSelectedRow();
    String cod="";
    cod=tbclientes.getValueAt(fila, 0).toString();
    if(fila>=0)
    {
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM cliente WHERE cod_cli='"+cod+"'");
            pst.executeUpdate();
            cargar("");
        } catch (SQLException ex) {
            Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else
    {
        JOptionPane.showMessageDialog(this, "No ha selecionada ninguna fila");
    }
        
}//GEN-LAST:event_mneliminarActionPerformed

private void mnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmodificarActionPerformed
// TODO add your handling code here:
    desbloquear();
     btnactualizar.setEnabled(true);
    int filamodificar= tbclientes.getSelectedRow();
    if(filamodificar>=0)
    {
        txtcod.setText(tbclientes.getValueAt(filamodificar, 0).toString());
        txtnom.setText(tbclientes.getValueAt(filamodificar, 1).toString());
        txtpaterno.setText(tbclientes.getValueAt(filamodificar, 2).toString());
        txtmaterno.setText(tbclientes.getValueAt(filamodificar, 3).toString());
        txtruc.setText(tbclientes.getValueAt(filamodificar, 4).toString());
        txtdir.setText(tbclientes.getValueAt(filamodificar, 5).toString());
        cbosexo.setSelectedItem(tbclientes.getValueAt(filamodificar, 6).toString());
        cobotipo.setSelectedItem(tbclientes.getValueAt(filamodificar, 7).toString());
        
        
       
        
       
    }
    else
    {
        JOptionPane.showMessageDialog(this,"No ha seleccionado ");
    }
}//GEN-LAST:event_mnmodificarActionPerformed

    private void cbosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbosexoActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void txtNumeroInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroInActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalidadActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void txtNumeroExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroExActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroExActionPerformed
void mostrartipo (){
 String sql="select * from entidad";
   

 
     try {
         Statement st = cn.createStatement();
         ResultSet rs =st.executeQuery(sql);
     while (rs.next())
     {
     cbo0.addItem(rs.getString("nom_ent"));
     
     
     }
     
     
     
     } catch (SQLException ex) {
         Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
     }
 
 
 
 
 }
void idclien (){
 String sql="select * from domicilio";
   

 
     try {
         Statement st = cn.createStatement();
         ResultSet rs =st.executeQuery(sql);
     while (rs.next())
     {
     cbo0.addItem(rs.getString("id_cliente"));
     
     
     }
     
     
     
     } catch (SQLException ex) {
         Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
     }
 
 
 
 
 }
void municipio (){
 String sql="select * from municipio";
   

 
     try {
         Statement st = cn.createStatement();
         ResultSet rs =st.executeQuery(sql);
     while (rs.next())
     {
     cbo1.addItem(rs.getString("nom_mun"));
     
     
     }
     
     
     
     } catch (SQLException ex) {
         Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
     }
 
 
 
 
 }
void boton2(){
 String cod,Dis,Loca,Coloni,Calle,Estado,Municipio,IDcliente,Calles,Interior,Exterior,Tel,Descrip;
            String sql="";
            cod=txtcodigo.getText();
            Dis=txtDistrito.getText();
            Estado=cbo0.getSelectedItem().toString();
            Municipio=cbo1.getSelectedItem().toString();
            Loca=txtLocalidad.getText();
            Coloni=txtColonia.getText();
            Calle=txtCalle.getText();
            Interior=txtNumeroIn.getText();
            Exterior= txtNumeroEx.getText();
            Calles=txtCalles.getText();
            Descrip=txtDescrip.getText();
            Tel=txtTelefono.getText();
            IDcliente=cbo2.getSelectedItem().toString();
            
            
         
            sql="INSERT INTO domicilio (codigo_postal,calle,num_ext,num_int,colonia,localidad,mun_del,distrito_federal,entre_calles,calle_posterior,descripcion,telefono,id_cliente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst  = cn.prepareStatement(sql);
            pst.setString(1, cod);
            pst.setString(2, Dis);
            pst.setString(3, Estado);
            pst.setString(4, Municipio);
            pst.setString(5, Loca);
            pst.setString(6, Coloni);
            pst.setString(7, Calle);
            pst.setString(8, Interior);
            pst.setString(9, Exterior);
            pst.setString(10, Calles);
            pst.setString(11, Descrip);
            pst.setString(12, Tel);
            pst.setString(13, IDcliente);
            int n=pst.executeUpdate();
            if(n>0){
        
                
                JOptionPane.showMessageDialog(null, "Registro Guardado con Exito");
            bloquear();
            }
            cargar("");
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }



}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbo0;
    private javax.swing.JComboBox<String> cbo1;
    private javax.swing.JComboBox<String> cbo2;
    private javax.swing.JComboBox cbosexo;
    private javax.swing.JComboBox<String> cobotipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnmodificar;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCalles;
    private javax.swing.JTextField txtCallesPos;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextArea txtDescrip;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNumeroEx;
    private javax.swing.JTextField txtNumeroIn;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpaterno;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
conecta cc= new conecta();
Connection cn= cc.conexion();
}

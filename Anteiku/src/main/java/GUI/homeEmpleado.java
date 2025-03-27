package GUI;

import DAO.clienteDAO;
import DAO.empleadoDAO;
import DAO.ingredienteDAO;
import DAO.usuarioDAO;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.cliente;
import objetos.empleado;
import objetos.usuario;

public class homeEmpleado extends javax.swing.JFrame {
    
    ingredienteDAO iDao = new ingredienteDAO();
    
    List<Long> arrayIngrediente = new ArrayList<>();
    
    public homeEmpleado() {
        initComponents();
        agregarListenersDeVisibilidad();
        cambiarEstadoDeColor();
        eliminarEstilosPorDedefectoBotones();
        
    }
    
    private void llenarTablaEmpleado(){
    
        empleadoDAO eDao = new empleadoDAO();
        
        DefaultTableModel model = (DefaultTableModel) jtablaEmpleado.getModel();
        model.setRowCount(0);
        
        List<empleado> listaEmpleado = eDao.listar();
        
        for(empleado e : listaEmpleado){
            model.addRow(new Object[]{
                e.getCedulaUsuario(),
                e.getNombreUsuario(),
                e.getApellidoUsuario(),
                e.getCorreoUsuario(),
                e.getCotraseniaUsuario(),
                e.getTelefonoUsuario(),
                e.getGenero(),
                e.getFechaIngreso(),
                e.getTipoContrato(),
                e.getTurnoTrabajo()
            });
        }
        
    }
    
    private void llenarTablaClientes(){
    
        clienteDAO cDao = new clienteDAO();
        
       DefaultTableModel model = (DefaultTableModel) jtablaCliente.getModel();
       model.setRowCount(0);
        
       List<cliente> listaClientes = cDao.listar();
       
       for(cliente c : listaClientes){
           model.addRow(new Object[]{
               c.getCedulaUsuario(),
               c.getNombreUsuario(),
               c.getApellidoUsuario(),
               c.getCorreoUsuario(),
               c.getCotraseniaUsuario(),
               c.getTelefonoUsuario(),
               c.getFechaNacimiento(),
               c.getGenero()
           });
       }
        
    }
    
    private void eliminarEstilosPorDedefectoBotones(){
        btnInsertar.setContentAreaFilled(false); 
        btnInsertar.setBorderPainted(false); 
        btnInsertar.setFocusPainted(false);
        btnMostrar.setContentAreaFilled(false); 
        btnMostrar.setBorderPainted(false); 
        btnMostrar.setFocusPainted(false);
        btnEliminar.setContentAreaFilled(false); 
        btnEliminar.setBorderPainted(false); 
        btnEliminar.setFocusPainted(false);
        btnModificar.setContentAreaFilled(false); 
        btnModificar.setBorderPainted(false); 
        btnModificar.setFocusPainted(false);
        btnBuscar.setContentAreaFilled(false); 
        btnBuscar.setBorderPainted(false); 
        btnBuscar.setFocusPainted(false);  
    }
    
    private void cambiarEstadoDeColor() {
        if (panelInfoIncio.isVisible() && !panelInfoClientes.isVisible() && !panelInfoProductos.isVisible()
                && !panelInfoVentas.isVisible()) {
            panelinicio.setBackground(new Color(19, 17, 17));
            panelCliente.setBackground(new Color(53, 49, 49));
        } else if (panelInfoClientes.isVisible() && !panelInfoIncio.isVisible() && !panelInfoProductos.isVisible()
                && !panelInfoVentas.isVisible()) {
            panelCliente.setBackground(new Color(19, 17, 17));
            panelinicio.setBackground(new Color(53, 49, 49));
        } else {
            panelinicio.setBackground(new Color(53, 49, 49));
            panelCliente.setBackground(new Color(53, 49, 49));
        }
    }
    
    private void agregarListenersDeVisibilidad() {
        agregarListener(panelInfoIncio);
        agregarListener(panelInfoClientes);
        agregarListener(panelInfoProductos);
        agregarListener(panelInfoVentas);
    }

    private void agregarListener(javax.swing.JPanel panel) {
        panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cambiarEstadoDeColor();
            }

            @Override
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cambiarEstadoDeColor();
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMenu = new javax.swing.JPopupMenu();
        jPanel16 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        menuPanelLateral = new componente.PanelRound_1();
        panelinicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelVenta = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelUsuario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelUsuario1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        Jtabbed = new javax.swing.JTabbedPane();
        panelInfoIncio = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablaProductos = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator7 = new javax.swing.JSeparator();
        panelRound_12 = new componente.PanelRound_1();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panelRound_14 = new componente.PanelRound_1();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panelRound_15 = new componente.PanelRound_1();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        panelRound_11 = new componente.PanelRound_1();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelInfoClientes = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnInsertar = new componente.ButtonRound();
        btnMostrar = new componente.ButtonRound();
        btnEliminar = new componente.ButtonRound();
        btnModificar = new componente.ButtonRound();
        btnBuscar = new componente.ButtonRound();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaCliente = new javax.swing.JTable();
        panelInfoVentas = new javax.swing.JPanel();
        panelInfoProductos = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        agregarIngrediente = new componente.ButtonRound();
        btnInsertar1 = new componente.ButtonRound();
        btnMostrar1 = new componente.ButtonRound();
        btnCrearIngrediente = new componente.ButtonRound();
        btnEliminar1 = new componente.ButtonRound();
        btnModificar1 = new componente.ButtonRound();
        btnBuscar1 = new componente.ButtonRound();
        jButton5 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panelEmpleado = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtCedula1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCorreo1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        cbJornada = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        cbContrato = new javax.swing.JComboBox<>();
        jdcFechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        cbGenero1 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnInsertar2 = new componente.ButtonRound();
        btnMostrar2 = new componente.ButtonRound();
        btnEliminar2 = new componente.ButtonRound();
        btnModificar2 = new componente.ButtonRound();
        btnBuscar2 = new componente.ButtonRound();
        txtBuscar2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtablaEmpleado = new javax.swing.JTable();
        panelCategoria = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        idc = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        nombrec = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        panelUsusario = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(34, 34, 34));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 204, 46));
        jLabel1.setText("COFFE ANTEIKU");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        jPanel1.setBackground(new java.awt.Color(238, 207, 176));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1318, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1320, 50));

        panelMenu.setBackground(new java.awt.Color(34, 34, 34));
        panelMenu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelMenuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        menuPanelLateral.setBackground(new java.awt.Color(53, 49, 49));
        menuPanelLateral.setRoundTopLeft(50);
        menuPanelLateral.setRoundTopRight(50);

        panelinicio.setBackground(new java.awt.Color(53, 49, 49));
        panelinicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelinicioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setBackground(new java.awt.Color(53, 49, 49));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Inicio");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelinicioLayout = new javax.swing.GroupLayout(panelinicio);
        panelinicio.setLayout(panelinicioLayout);
        panelinicioLayout.setHorizontalGroup(
            panelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelinicioLayout.setVerticalGroup(
            panelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCliente.setBackground(new java.awt.Color(53, 49, 49));
        panelCliente.setPreferredSize(new java.awt.Dimension(127, 44));
        panelCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clientes");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        panelVenta.setBackground(new java.awt.Color(53, 49, 49));
        panelVenta.setPreferredSize(new java.awt.Dimension(127, 44));
        panelVenta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelVentaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ventas");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelUsuario.setBackground(new java.awt.Color(53, 49, 49));
        panelUsuario.setPreferredSize(new java.awt.Dimension(127, 44));
        panelUsuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelUsuarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informacion Usuario");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelProducto.setBackground(new java.awt.Color(53, 49, 49));
        panelProducto.setPreferredSize(new java.awt.Dimension(127, 44));
        panelProducto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelProductoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Productos");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelUsuario1.setBackground(new java.awt.Color(53, 49, 49));
        panelUsuario1.setPreferredSize(new java.awt.Dimension(127, 44));
        panelUsuario1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelUsuario1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Empleados");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelUsuario1Layout = new javax.swing.GroupLayout(panelUsuario1);
        panelUsuario1.setLayout(panelUsuario1Layout);
        panelUsuario1Layout.setHorizontalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        panelUsuario1Layout.setVerticalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelLateralLayout = new javax.swing.GroupLayout(menuPanelLateral);
        menuPanelLateral.setLayout(menuPanelLateralLayout);
        menuPanelLateralLayout.setHorizontalGroup(
            menuPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelinicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(panelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(panelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(panelUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        menuPanelLateralLayout.setVerticalGroup(
            menuPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLateralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panelinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 220, 810));

        Jtabbed.setBackground(new java.awt.Color(34, 34, 34));
        Jtabbed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtabbedMouseClicked(evt);
            }
        });

        panelInfoIncio.setBackground(new java.awt.Color(243, 229, 215));

        jPanel11.setBackground(new java.awt.Color(58, 53, 53));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel12.setBackground(new java.awt.Color(34, 34, 34));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Productos");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtablaProductos.setBackground(new java.awt.Color(34, 34, 34));
        JtablaProductos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        JtablaProductos.setForeground(new java.awt.Color(255, 255, 255));
        JtablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtablaProductos.setFocusable(false);
        JtablaProductos.setRowHeight(25);
        JtablaProductos.setSelectionBackground(new java.awt.Color(34, 34, 34));
        JtablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JtablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JtablaProductos);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(58, 53, 53));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 204, 46)));

        jPanel14.setBackground(new java.awt.Color(34, 34, 34));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ultimos Clientes Registrados");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Correo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));

        panelRound_12.setBackground(new java.awt.Color(58, 53, 53));
        panelRound_12.setRoundBottomLeft(50);
        panelRound_12.setRoundBottomRight(50);
        panelRound_12.setRoundTopLeft(50);
        panelRound_12.setRoundTopRight(50);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(250, 204, 46));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(243, 229, 215));
        jLabel22.setText("Ventas");

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(243, 229, 215));
        jLabel29.setText("0");

        javax.swing.GroupLayout panelRound_12Layout = new javax.swing.GroupLayout(panelRound_12);
        panelRound_12.setLayout(panelRound_12Layout);
        panelRound_12Layout.setHorizontalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_12Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel20)
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_12Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel29))
                    .addGroup(panelRound_12Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel22)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelRound_12Layout.setVerticalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addGroup(panelRound_12Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)))
                .addGap(32, 32, 32))
        );

        panelRound_14.setBackground(new java.awt.Color(58, 53, 53));
        panelRound_14.setRoundBottomLeft(50);
        panelRound_14.setRoundBottomRight(50);
        panelRound_14.setRoundTopLeft(50);
        panelRound_14.setRoundTopRight(50);

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(250, 204, 46));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(243, 229, 215));
        jLabel21.setText("0");

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(243, 229, 215));
        jLabel30.setText("Categorias");

        javax.swing.GroupLayout panelRound_14Layout = new javax.swing.GroupLayout(panelRound_14);
        panelRound_14.setLayout(panelRound_14Layout);
        panelRound_14Layout.setHorizontalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_14Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel26)
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel21))
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel30)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelRound_14Layout.setVerticalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_14Layout.createSequentialGroup()
                .addGroup(panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30))
                    .addGroup(panelRound_14Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel26)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panelRound_15.setBackground(new java.awt.Color(58, 53, 53));
        panelRound_15.setRoundBottomLeft(50);
        panelRound_15.setRoundBottomRight(50);
        panelRound_15.setRoundTopLeft(50);
        panelRound_15.setRoundTopRight(50);

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(250, 204, 46));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(243, 229, 215));
        jLabel32.setText("Productos");

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(243, 229, 215));
        jLabel33.setText("0");

        javax.swing.GroupLayout panelRound_15Layout = new javax.swing.GroupLayout(panelRound_15);
        panelRound_15.setLayout(panelRound_15Layout);
        panelRound_15Layout.setHorizontalGroup(
            panelRound_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_15Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel31)
                .addGroup(panelRound_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_15Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel32))
                    .addGroup(panelRound_15Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel33)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelRound_15Layout.setVerticalGroup(
            panelRound_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_15Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(panelRound_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addGroup(panelRound_15Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)))
                .addGap(32, 32, 32))
        );

        panelRound_11.setBackground(new java.awt.Color(58, 53, 53));
        panelRound_11.setRoundBottomLeft(70);
        panelRound_11.setRoundBottomRight(70);

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pedidos pedientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound_11Layout = new javax.swing.GroupLayout(panelRound_11);
        panelRound_11.setLayout(panelRound_11Layout);
        panelRound_11Layout.setHorizontalGroup(
            panelRound_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound_11Layout.setVerticalGroup(
            panelRound_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_11Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 433, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoIncioLayout = new javax.swing.GroupLayout(panelInfoIncio);
        panelInfoIncio.setLayout(panelInfoIncioLayout);
        panelInfoIncioLayout.setHorizontalGroup(
            panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoIncioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7)
                    .addGroup(panelInfoIncioLayout.createSequentialGroup()
                        .addGroup(panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoIncioLayout.createSequentialGroup()
                                .addComponent(panelRound_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelRound_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelRound_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfoIncioLayout.createSequentialGroup()
                                .addComponent(panelRound_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 315, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInfoIncioLayout.setVerticalGroup(
            panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoIncioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound_14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoIncioLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        Jtabbed.addTab("tab1", panelInfoIncio);

        panelInfoClientes.setBackground(new java.awt.Color(243, 229, 215));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setBorder(null);

        jPanel7.setBackground(new java.awt.Color(59, 47, 47));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PERSONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 229, 215));
        jLabel12.setText("Cedula");

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(59, 47, 47));
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 229, 215));
        jLabel8.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(59, 47, 47));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(243, 229, 215));
        jLabel9.setText("Apellido");

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(59, 47, 47));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 229, 215));
        jLabel11.setText("Telefono");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(59, 47, 47));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 229, 215));
        jLabel7.setText("Fecha nacimiento");

        jdcFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jdcFechaNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        jdcFechaNacimiento.setForeground(new java.awt.Color(59, 47, 47));
        jdcFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(243, 229, 215));
        jLabel13.setText("Genero");

        cbGenero.setBackground(new java.awt.Color(243, 229, 215));
        cbGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbGenero.setForeground(new java.awt.Color(59, 47, 47));
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Hombre", "Mujer" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(243, 229, 215));
        jLabel10.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\richa\\OneDrive\\Documentos\\NetBeansProjects\\anteiku\\anteiku\\src\\main\\java\\tamplates\\coffeeinter (3).png")); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(250, 204, 46));
        jLabel45.setText("COFFE ANTEIKU");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel44)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombre)
                                    .addComponent(txtCedula)
                                    .addComponent(txtTelefono)
                                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbGenero, 0, 240, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 182, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(59, 47, 47));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        btnInsertar.setBackground(new java.awt.Color(250, 204, 46));
        btnInsertar.setBorder(null);
        btnInsertar.setForeground(new java.awt.Color(59, 47, 47));
        btnInsertar.setText("Insertar");
        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertar.setRoundBottomLeft(30);
        btnInsertar.setRoundBottomRight(30);
        btnInsertar.setRoundTopLeft(30);
        btnInsertar.setRoundTopRight(30);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(250, 204, 46));
        btnMostrar.setBorder(null);
        btnMostrar.setForeground(new java.awt.Color(59, 47, 47));
        btnMostrar.setText("Mostrar");
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMostrar.setRoundBottomLeft(30);
        btnMostrar.setRoundBottomRight(30);
        btnMostrar.setRoundTopLeft(30);
        btnMostrar.setRoundTopRight(30);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(250, 204, 46));
        btnEliminar.setBorder(null);
        btnEliminar.setForeground(new java.awt.Color(59, 47, 47));
        btnEliminar.setText("Elimnar");
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setRoundBottomLeft(30);
        btnEliminar.setRoundBottomRight(30);
        btnEliminar.setRoundTopLeft(30);
        btnEliminar.setRoundTopRight(30);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(250, 204, 46));
        btnModificar.setBorder(null);
        btnModificar.setForeground(new java.awt.Color(59, 47, 47));
        btnModificar.setText("Modificar");
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setRoundBottomLeft(30);
        btnModificar.setRoundBottomRight(30);
        btnModificar.setRoundTopLeft(30);
        btnModificar.setRoundTopRight(30);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(250, 204, 46));
        btnBuscar.setBorder(null);
        btnBuscar.setForeground(new java.awt.Color(59, 47, 47));
        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setRoundBottomLeft(30);
        btnBuscar.setRoundBottomRight(30);
        btnBuscar.setRoundTopLeft(30);
        btnBuscar.setRoundTopRight(30);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(250, 204, 46));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(59, 47, 47));
        jButton1.setText("BORRAR CAMPOS DE TEXTO");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(59, 47, 47));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR POR NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(59, 47, 47))); // NOI18N

        jButton4.setBackground(new java.awt.Color(250, 204, 46));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(59, 47, 47));
        jButton4.setText("RANGO DE FECHAS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(59, 47, 47));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA DE REGISTROS DE CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jtablaCliente.setBackground(new java.awt.Color(255, 255, 255));
        jtablaCliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Contraseña", "Telefono", "Fecha nacimiento", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtablaCliente);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoClientesLayout = new javax.swing.GroupLayout(panelInfoClientes);
        panelInfoClientes.setLayout(panelInfoClientesLayout);
        panelInfoClientesLayout.setHorizontalGroup(
            panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoClientesLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoClientesLayout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelInfoClientesLayout.setVerticalGroup(
            panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInfoClientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInfoClientesLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
        );

        Jtabbed.addTab("tab2", panelInfoClientes);

        javax.swing.GroupLayout panelInfoVentasLayout = new javax.swing.GroupLayout(panelInfoVentas);
        panelInfoVentas.setLayout(panelInfoVentasLayout);
        panelInfoVentasLayout.setHorizontalGroup(
            panelInfoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        panelInfoVentasLayout.setVerticalGroup(
            panelInfoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );

        Jtabbed.addTab("tab3", panelInfoVentas);

        panelInfoProductos.setBackground(new java.awt.Color(243, 229, 215));

        jPanel10.setBackground(new java.awt.Color(59, 47, 47));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(243, 229, 215));
        jLabel24.setText("ID");

        jTextField6.setBackground(new java.awt.Color(243, 229, 215));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(243, 229, 215));
        jLabel14.setText("Categoria");

        jComboBox1.setBackground(new java.awt.Color(243, 229, 215));
        jComboBox1.setForeground(new java.awt.Color(59, 47, 47));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(243, 229, 215));
        jLabel15.setText("Nombre");

        jTextField8.setBackground(new java.awt.Color(243, 229, 215));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(243, 229, 215));
        jLabel19.setText("Precio");

        jTextField9.setBackground(new java.awt.Color(243, 229, 215));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(243, 229, 215));
        jLabel23.setText("Cantidad");

        jTextField10.setBackground(new java.awt.Color(243, 229, 215));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(243, 229, 215));
        jLabel27.setText("Ingredientes");

        jComboBox2.setBackground(new java.awt.Color(243, 229, 215));
        jComboBox2.setForeground(new java.awt.Color(59, 47, 47));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(243, 229, 215));
        jLabel25.setText("Descripcion");

        jTextArea1.setBackground(new java.awt.Color(243, 229, 215));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tamplates/coffeepequeño (1).png"))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(250, 204, 46));
        jLabel47.setText("COFFE ANTEIKU");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel25)
                        .addComponent(jLabel27)
                        .addComponent(jLabel23)
                        .addComponent(jLabel19)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addComponent(jLabel24)
                        .addComponent(jTextField10)
                        .addComponent(jComboBox2, 0, 243, Short.MAX_VALUE)
                        .addComponent(jTextField9)
                        .addComponent(jTextField8)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(59, 47, 47));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        agregarIngrediente.setBackground(new java.awt.Color(250, 204, 46));
        agregarIngrediente.setBorder(null);
        agregarIngrediente.setForeground(new java.awt.Color(59, 47, 47));
        agregarIngrediente.setText("agregar");
        agregarIngrediente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarIngrediente.setRoundBottomLeft(30);
        agregarIngrediente.setRoundBottomRight(30);
        agregarIngrediente.setRoundTopLeft(30);
        agregarIngrediente.setRoundTopRight(30);
        agregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngredienteActionPerformed(evt);
            }
        });

        btnInsertar1.setBackground(new java.awt.Color(250, 204, 46));
        btnInsertar1.setBorder(null);
        btnInsertar1.setForeground(new java.awt.Color(59, 47, 47));
        btnInsertar1.setText("Insertar");
        btnInsertar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertar1.setRoundBottomLeft(30);
        btnInsertar1.setRoundBottomRight(30);
        btnInsertar1.setRoundTopLeft(30);
        btnInsertar1.setRoundTopRight(30);

        btnMostrar1.setBackground(new java.awt.Color(250, 204, 46));
        btnMostrar1.setBorder(null);
        btnMostrar1.setForeground(new java.awt.Color(59, 47, 47));
        btnMostrar1.setText("Mostrar");
        btnMostrar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMostrar1.setRoundBottomLeft(30);
        btnMostrar1.setRoundBottomRight(30);
        btnMostrar1.setRoundTopLeft(30);
        btnMostrar1.setRoundTopRight(30);
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });

        btnCrearIngrediente.setBackground(new java.awt.Color(250, 204, 46));
        btnCrearIngrediente.setBorder(null);
        btnCrearIngrediente.setForeground(new java.awt.Color(59, 47, 47));
        btnCrearIngrediente.setText("crear producto");
        btnCrearIngrediente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrearIngrediente.setRoundBottomLeft(30);
        btnCrearIngrediente.setRoundBottomRight(30);
        btnCrearIngrediente.setRoundTopLeft(30);
        btnCrearIngrediente.setRoundTopRight(30);
        btnCrearIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearIngredienteActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(250, 204, 46));
        btnEliminar1.setBorder(null);
        btnEliminar1.setForeground(new java.awt.Color(59, 47, 47));
        btnEliminar1.setText("Elimnar");
        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar1.setRoundBottomLeft(30);
        btnEliminar1.setRoundBottomRight(30);
        btnEliminar1.setRoundTopLeft(30);
        btnEliminar1.setRoundTopRight(30);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnModificar1.setBackground(new java.awt.Color(250, 204, 46));
        btnModificar1.setBorder(null);
        btnModificar1.setForeground(new java.awt.Color(59, 47, 47));
        btnModificar1.setText("Modificar");
        btnModificar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar1.setRoundBottomLeft(30);
        btnModificar1.setRoundBottomRight(30);
        btnModificar1.setRoundTopLeft(30);
        btnModificar1.setRoundTopRight(30);
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        btnBuscar1.setBackground(new java.awt.Color(250, 204, 46));
        btnBuscar1.setBorder(null);
        btnBuscar1.setForeground(new java.awt.Color(59, 47, 47));
        btnBuscar1.setText("Buscar");
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar1.setRoundBottomLeft(30);
        btnBuscar1.setRoundBottomRight(30);
        btnBuscar1.setRoundTopLeft(30);
        btnBuscar1.setRoundTopRight(30);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(250, 204, 46));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(59, 47, 47));
        jButton5.setText("BORRAR CAMPOS DE TEXTO");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnCrearIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(agregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(1, 1, 1))))
                .addGap(56, 56, 56)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCrearIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jPanel17.setBackground(new java.awt.Color(59, 47, 47));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA DE REGISTRO DE PRODUTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jTable3.setBackground(new java.awt.Color(243, 229, 215));
        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Contraseña", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoProductosLayout = new javax.swing.GroupLayout(panelInfoProductos);
        panelInfoProductos.setLayout(panelInfoProductosLayout);
        panelInfoProductosLayout.setHorizontalGroup(
            panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProductosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        panelInfoProductosLayout.setVerticalGroup(
            panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProductosLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoProductosLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoProductosLayout.createSequentialGroup()
                        .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        Jtabbed.addTab("tab4", panelInfoProductos);

        panelEmpleado.setBackground(new java.awt.Color(243, 229, 215));

        jPanel2.setBackground(new java.awt.Color(59, 47, 47));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS PERSONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        txtNombre1.setBackground(new java.awt.Color(243, 229, 215));
        txtNombre1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(243, 229, 215));
        jLabel39.setText("Cedula");

        txtCedula1.setBackground(new java.awt.Color(243, 229, 215));
        txtCedula1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCedula1.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(243, 229, 215));
        jLabel36.setText("Apellido");

        txtApellido1.setBackground(new java.awt.Color(243, 229, 215));
        txtApellido1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(243, 229, 215));
        jLabel38.setText("Telefono");

        txtTelefono1.setBackground(new java.awt.Color(243, 229, 215));
        txtTelefono1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(243, 229, 215));
        jLabel37.setText("Correo");

        txtCorreo1.setBackground(new java.awt.Color(243, 229, 215));
        txtCorreo1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCorreo1.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(243, 229, 215));
        jLabel43.setText("Jornada");

        cbJornada.setBackground(new java.awt.Color(243, 229, 215));
        cbJornada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbJornada.setForeground(new java.awt.Color(59, 47, 47));
        cbJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mañana", "Tarde", "Noche", "Mixta", " " }));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(243, 229, 215));
        jLabel42.setText("Tipo contrato");

        cbContrato.setBackground(new java.awt.Color(243, 229, 215));
        cbContrato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbContrato.setForeground(new java.awt.Color(59, 47, 47));
        cbContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Trabajo", "Prestacion de servicios" }));
        cbContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContratoActionPerformed(evt);
            }
        });

        jdcFechaNacimiento1.setBackground(new java.awt.Color(255, 255, 255));
        jdcFechaNacimiento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        jdcFechaNacimiento1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(243, 229, 215));
        jLabel41.setText("Fecha ingreso");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(243, 229, 215));
        jLabel34.setText("Fecha nacimiento");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(243, 229, 215));
        jLabel40.setText("Genero");

        cbGenero1.setBackground(new java.awt.Color(243, 229, 215));
        cbGenero1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbGenero1.setForeground(new java.awt.Color(59, 47, 47));
        cbGenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Hombre", "Mujer" }));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(243, 229, 215));
        jLabel35.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35)
                    .addComponent(jLabel40)
                    .addComponent(jLabel34)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel36)
                    .addComponent(jLabel39)
                    .addComponent(txtCorreo1)
                    .addComponent(cbJornada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbContrato, 0, 260, Short.MAX_VALUE)
                    .addComponent(jdcFechaNacimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbGenero1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono1)
                    .addComponent(txtApellido1)
                    .addComponent(txtNombre1)
                    .addComponent(txtCedula1))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jPanel5.setBackground(new java.awt.Color(59, 47, 47));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        btnInsertar2.setBackground(new java.awt.Color(250, 204, 46));
        btnInsertar2.setBorder(null);
        btnInsertar2.setForeground(new java.awt.Color(59, 47, 47));
        btnInsertar2.setText("Insertar");
        btnInsertar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsertar2.setRoundBottomLeft(30);
        btnInsertar2.setRoundBottomRight(30);
        btnInsertar2.setRoundTopLeft(30);
        btnInsertar2.setRoundTopRight(30);
        btnInsertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar2ActionPerformed(evt);
            }
        });

        btnMostrar2.setBackground(new java.awt.Color(250, 204, 46));
        btnMostrar2.setBorder(null);
        btnMostrar2.setForeground(new java.awt.Color(59, 47, 47));
        btnMostrar2.setText("Mostrar");
        btnMostrar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMostrar2.setRoundBottomLeft(30);
        btnMostrar2.setRoundBottomRight(30);
        btnMostrar2.setRoundTopLeft(30);
        btnMostrar2.setRoundTopRight(30);
        btnMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar2ActionPerformed(evt);
            }
        });

        btnEliminar2.setBackground(new java.awt.Color(250, 204, 46));
        btnEliminar2.setBorder(null);
        btnEliminar2.setForeground(new java.awt.Color(59, 47, 47));
        btnEliminar2.setText("Elimnar");
        btnEliminar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar2.setRoundBottomLeft(30);
        btnEliminar2.setRoundBottomRight(30);
        btnEliminar2.setRoundTopLeft(30);
        btnEliminar2.setRoundTopRight(30);
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        btnModificar2.setBackground(new java.awt.Color(250, 204, 46));
        btnModificar2.setBorder(null);
        btnModificar2.setForeground(new java.awt.Color(59, 47, 47));
        btnModificar2.setText("Modificar");
        btnModificar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar2.setRoundBottomLeft(30);
        btnModificar2.setRoundBottomRight(30);
        btnModificar2.setRoundTopLeft(30);
        btnModificar2.setRoundTopRight(30);
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });

        btnBuscar2.setBackground(new java.awt.Color(250, 204, 46));
        btnBuscar2.setBorder(null);
        btnBuscar2.setForeground(new java.awt.Color(59, 47, 47));
        btnBuscar2.setText("Buscar");
        btnBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar2.setRoundBottomLeft(30);
        btnBuscar2.setRoundBottomRight(30);
        btnBuscar2.setRoundTopLeft(30);
        btnBuscar2.setRoundTopRight(30);
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        txtBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtBuscar2.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(59, 47, 47))); // NOI18N

        jButton2.setBackground(new java.awt.Color(250, 204, 46));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(59, 47, 47));
        jButton2.setText("BORRAR CAMPOS DE TEXTO");

        jButton3.setBackground(new java.awt.Color(250, 204, 46));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(59, 47, 47));
        jButton3.setText("RANGO POR FECHA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnInsertar2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnMostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsertar2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(59, 47, 47));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA DE REGISTROS DE EMPLEADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jtablaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jtablaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Contraseña", "Telefono", "Fecha nc", "Genero", "Fecha ingreso", "Contrato", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jtablaEmpleado);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEmpleadoLayout = new javax.swing.GroupLayout(panelEmpleado);
        panelEmpleado.setLayout(panelEmpleadoLayout);
        panelEmpleadoLayout.setHorizontalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEmpleadoLayout.setVerticalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Jtabbed.addTab("tab2", panelEmpleado);

        panelCategoria.setBackground(new java.awt.Color(243, 229, 215));

        jPanel18.setBackground(new java.awt.Color(59, 47, 47));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DATOS DE CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        jLabel48.setText("IDC");

        idc.setBackground(new java.awt.Color(243, 229, 215));
        idc.setForeground(new java.awt.Color(59, 47, 47));

        jLabel49.setText("NOMBREC");

        nombrec.setBackground(new java.awt.Color(243, 229, 215));
        nombrec.setForeground(new java.awt.Color(59, 47, 47));

        jLabel50.setText("DESCRIPCIÓN");

        descripcion.setBackground(new java.awt.Color(243, 229, 215));
        descripcion.setColumns(20);
        descripcion.setForeground(new java.awt.Color(59, 47, 47));
        descripcion.setRows(5);
        jScrollPane7.setViewportView(descripcion);

        jLabel51.setIcon(new javax.swing.ImageIcon("C:\\Users\\richa\\OneDrive\\Documentos\\NetBeansProjects\\anteiku\\anteiku\\src\\main\\java\\tamplates\\coffeeinter (3).png")); // NOI18N

        jLabel52.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(250, 204, 46));
        jLabel52.setText("COFFE ANTEIKU");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idc)
                                .addComponent(jLabel49)
                                .addComponent(nombrec, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                            .addComponent(jLabel50)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel51))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrec, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(59, 47, 47));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "TABLA D REGSITRO DE CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IDC", "NOMBRE", "DESCRIPCION"
            }
        ));
        jScrollPane8.setViewportView(tabla);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(59, 47, 47));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "FUNCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(250, 204, 46))); // NOI18N

        agregar.setBackground(new java.awt.Color(250, 204, 46));
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(59, 47, 47));
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        mostrar.setBackground(new java.awt.Color(250, 204, 46));
        mostrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrar.setForeground(new java.awt.Color(59, 47, 47));
        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(250, 204, 46));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(59, 47, 47));
        buscar.setText("BUSCAR");

        actualizar.setBackground(new java.awt.Color(250, 204, 46));
        actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actualizar.setForeground(new java.awt.Color(59, 47, 47));
        actualizar.setText("ACTUALIZAR");

        borrar.setBackground(new java.awt.Color(250, 204, 46));
        borrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(59, 47, 47));
        borrar.setText("BORRAR");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Jtabbed.addTab("tab6", panelCategoria);

        panelUsusario.setBackground(new java.awt.Color(243, 229, 215));

        javax.swing.GroupLayout panelUsusarioLayout = new javax.swing.GroupLayout(panelUsusario);
        panelUsusario.setLayout(panelUsusarioLayout);
        panelUsusarioLayout.setHorizontalGroup(
            panelUsusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        panelUsusarioLayout.setVerticalGroup(
            panelUsusarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );

        Jtabbed.addTab("tab7", panelUsusario);

        getContentPane().add(Jtabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Jtabbed.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Jtabbed.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void panelinicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelinicioAncestorAdded
        
    }//GEN-LAST:event_panelinicioAncestorAdded

    private void panelClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelClienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelClienteAncestorAdded

    private void panelVentaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelVentaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelVentaAncestorAdded

    private void panelUsuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelUsuarioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelUsuarioAncestorAdded

    private void panelProductoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelProductoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelProductoAncestorAdded

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Jtabbed.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Jtabbed.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Jtabbed.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        panelMenu.setVisible(!panelMenu.isVisible());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void panelMenuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelMenuAncestorAdded

    }//GEN-LAST:event_panelMenuAncestorAdded

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        Jtabbed.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void panelUsuario1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelUsuario1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelUsuario1AncestorAdded

    private void JtabbedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtabbedMouseClicked

    }//GEN-LAST:event_JtabbedMouseClicked

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar2ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar2ActionPerformed
        llenarTablaEmpleado();
    }//GEN-LAST:event_btnMostrar2ActionPerformed

    private void btnInsertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar2ActionPerformed
        
        String Scedula = txtCedula1.getText();
        String nombre = txtNombre1.getText();
        String apellido = txtApellido1.getText();
        String correo = txtCorreo1.getText();
        String telefono = txtTelefono1.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimiento1.getDate();
        String genero = cbGenero1.getSelectedItem().toString();
        java.util.Date fechIngreso = jdcFechaNacimiento1.getDate();
        String contrato = cbContrato.getSelectedItem().toString();
        String jornada = cbJornada.getSelectedItem().toString();
        
        if (Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
            || telefono.isEmpty() || fechaNacimiento == null || fechIngreso == null) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }
        
        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());
        java.sql.Date fechaIngresoSQL = new java.sql.Date(fechIngreso.getTime());
        
        long cedula = Long.parseLong(Scedula);

        usuario u = new usuario();

        u.setCedulaUsuario(cedula);
        u.setNombreUsuario(nombre);
        u.setApellidoUsuario(apellido);
        u.setCorreoUsuario(correo);
        u.setCotraseniaUsuario(String.valueOf(cedula));
        u.setTelefonoUsuario(telefono);
        u.setRolUsuario("cliente");
        u.setFechaNacimiento(fechaNacimientoSQL);
        u.setGenero(genero);
        
        empleado e = new empleado();
        
        e.setCedulaUsuario(cedula);
        e.setFechaIngreso(fechaIngresoSQL);
        e.setTipoContrato(contrato);
        e.setTurnoTrabajo(jornada);
        
        usuarioDAO uDao = new usuarioDAO();
        empleadoDAO eDao = new empleadoDAO();
        
        if(uDao.crear(u)){
            if(eDao.crear(e))JOptionPane.showMessageDialog(this, "Empleado registrado");
        }
        
    }//GEN-LAST:event_btnInsertar2ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String Sid = txtBuscar.getText();

        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de buscar");
            return;
        }

        long id = Long.parseLong(Sid);

        clienteDAO cDao = new clienteDAO();

        cliente c = cDao.obtener(id);

        if(cDao.buscar(id)){
            if(c != null){
                txtCedula.setText(String.valueOf(c.getCedulaUsuario()));
                txtNombre.setText(c.getNombreUsuario());
                txtApellido.setText(c.getApellidoUsuario());
                txtCorreo.setText(c.getCorreoUsuario());
                txtTelefono.setText(c.getTelefonoUsuario());
                jdcFechaNacimiento.setDate(c.getFechaNacimiento());
                cbGenero.setSelectedItem(c.getGenero());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        String Sid = txtBuscar.getText();

        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de buscar");
            return;
        }

        String Scedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimiento.getDate();
        String genero = cbGenero.getSelectedItem().toString();

        if (Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
            || telefono.isEmpty() || fechaNacimiento == null) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }

        long cedula = Long.parseLong(Scedula);

        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());

        usuario u = new usuario();

        u.setCedulaUsuario(cedula);
        u.setNombreUsuario(nombre);
        u.setApellidoUsuario(apellido);
        u.setCorreoUsuario(correo);
        u.setCotraseniaUsuario(String.valueOf(cedula));
        u.setTelefonoUsuario(telefono);
        u.setRolUsuario("cliente");
        u.setFechaNacimiento(fechaNacimientoSQL);
        u.setGenero(genero);

        usuarioDAO uDao = new usuarioDAO();

        if(uDao.modificar(u))JOptionPane.showMessageDialog(this, "Cambios realizados");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String Sid = txtBuscar.getText();

        if(Sid.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una cedula antes de buscar");
            return;
        }

        long id = Long.parseLong(Sid);

        usuarioDAO uDao = new usuarioDAO();

        if(uDao.eliminar(id))JOptionPane.showMessageDialog(this, "Cliente eliminado con exito");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        llenarTablaClientes();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        String Scedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimiento.getDate();
        String genero = cbGenero.getSelectedItem().toString();

        if (Scedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()
            || telefono.isEmpty() || fechaNacimiento == null) {

            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de insertar");
            return;
        }

        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());

        long cedula = Long.parseLong(Scedula);

        usuario u = new usuario();

        u.setCedulaUsuario(cedula);
        u.setNombreUsuario(nombre);
        u.setApellidoUsuario(apellido);
        u.setCorreoUsuario(correo);
        u.setCotraseniaUsuario(String.valueOf(cedula));
        u.setTelefonoUsuario(telefono);
        u.setRolUsuario("cliente");
        u.setFechaNacimiento(fechaNacimientoSQL);
        u.setGenero(genero);

        //hola
        
        cliente c = new cliente();
        c.setCedulaUsuario(cedula);

        usuarioDAO uDao = new usuarioDAO();
        clienteDAO cDao = new clienteDAO();

        if (uDao.crear(u)) {
            if (cDao.crear(c)) {
                JOptionPane.showMessageDialog(this, "Cliente registrado con éxito");
            }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void cbContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbContratoActionPerformed

    private void btnCrearIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearIngredienteActionPerformed

    private void agregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarIngredienteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
      
        
        
        
    }//GEN-LAST:event_agregarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Jtabbed;
    private javax.swing.JTable JtablaProductos;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private componente.ButtonRound agregarIngrediente;
    private javax.swing.JButton borrar;
    private componente.ButtonRound btnBuscar;
    private componente.ButtonRound btnBuscar1;
    private componente.ButtonRound btnBuscar2;
    private componente.ButtonRound btnCrearIngrediente;
    private componente.ButtonRound btnEliminar;
    private componente.ButtonRound btnEliminar1;
    private componente.ButtonRound btnEliminar2;
    private componente.ButtonRound btnInsertar;
    private componente.ButtonRound btnInsertar1;
    private componente.ButtonRound btnInsertar2;
    private componente.ButtonRound btnModificar;
    private componente.ButtonRound btnModificar1;
    private componente.ButtonRound btnModificar2;
    private componente.ButtonRound btnMostrar;
    private componente.ButtonRound btnMostrar1;
    private componente.ButtonRound btnMostrar2;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cbContrato;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbGenero1;
    private javax.swing.JComboBox<String> cbJornada;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField idc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.toedter.calendar.JDateChooser jdcFechaIngreso;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento1;
    private javax.swing.JTable jtablaCliente;
    private javax.swing.JTable jtablaEmpleado;
    private componente.PanelRound_1 menuPanelLateral;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombrec;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelInfoClientes;
    private javax.swing.JPanel panelInfoIncio;
    private javax.swing.JPanel panelInfoProductos;
    private javax.swing.JPanel panelInfoVentas;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProducto;
    private componente.PanelRound_1 panelRound_11;
    private componente.PanelRound_1 panelRound_12;
    private componente.PanelRound_1 panelRound_14;
    private componente.PanelRound_1 panelRound_15;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JPanel panelUsuario1;
    private javax.swing.JPanel panelUsusario;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JPanel panelinicio;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}

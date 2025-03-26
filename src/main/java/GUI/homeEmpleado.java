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
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaCliente = new javax.swing.JTable();
        btnInsertar = new componente.ButtonRound();
        btnMostrar = new componente.ButtonRound();
        btnEliminar = new componente.ButtonRound();
        btnModificar = new componente.ButtonRound();
        btnBuscar = new componente.ButtonRound();
        txtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        panelInfoVentas = new javax.swing.JPanel();
        panelInfoProductos = new javax.swing.JPanel();
        panelInfoClientes1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnInsertar1 = new componente.ButtonRound();
        btnMostrar1 = new componente.ButtonRound();
        btnEliminar1 = new componente.ButtonRound();
        btnModificar1 = new componente.ButtonRound();
        btnBuscar1 = new componente.ButtonRound();
        txtBuscar1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        agregarIngrediente = new componente.ButtonRound();
        btnCrearIngrediente = new componente.ButtonRound();
        panelInfoUsuario = new javax.swing.JPanel();
        panelEmpleado = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtablaEmpleado = new javax.swing.JTable();
        btnInsertar2 = new componente.ButtonRound();
        btnMostrar2 = new componente.ButtonRound();
        btnEliminar2 = new componente.ButtonRound();
        btnModificar2 = new componente.ButtonRound();
        btnBuscar2 = new componente.ButtonRound();
        txtBuscar2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtCedula1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCorreo1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jdcFechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        cbGenero1 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        cbContrato = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        cbJornada = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(34, 34, 34));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 204, 46));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dvill\\Documents\\NetBeansProjects\\Anteiku\\src\\main\\java\\tamplates\\coffeepequeño (1).png")); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(477, Short.MAX_VALUE))
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
        JtablaProductos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        JtablaProductos.setRowHeight(25);
        JtablaProductos.setSelectionBackground(new java.awt.Color(34, 34, 34));
        JtablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        JtablaProductos.setShowVerticalLines(false);
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
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\dvill\\Documents\\NetBeansProjects\\Anteiku\\src\\main\\java\\tamplates\\venta128.png")); // NOI18N

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
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\dvill\\Documents\\NetBeansProjects\\Anteiku\\src\\main\\java\\tamplates\\categoria128.png")); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound_15.setBackground(new java.awt.Color(58, 53, 53));
        panelRound_15.setRoundBottomLeft(50);
        panelRound_15.setRoundBottomRight(50);
        panelRound_15.setRoundTopLeft(50);
        panelRound_15.setRoundTopRight(50);

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(250, 204, 46));
        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\dvill\\Documents\\NetBeansProjects\\Anteiku\\src\\main\\java\\tamplates\\producto128.png")); // NOI18N

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
                .addContainerGap(28, Short.MAX_VALUE)
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
                        .addGap(0, 286, Short.MAX_VALUE)))
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

        btnInsertar.setBackground(new java.awt.Color(34, 34, 34));
        btnInsertar.setBorder(null);
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("Insertar");
        btnInsertar.setRoundBottomLeft(30);
        btnInsertar.setRoundBottomRight(30);
        btnInsertar.setRoundTopLeft(30);
        btnInsertar.setRoundTopRight(30);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(34, 34, 34));
        btnMostrar.setBorder(null);
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.setRoundBottomLeft(30);
        btnMostrar.setRoundBottomRight(30);
        btnMostrar.setRoundTopLeft(30);
        btnMostrar.setRoundTopRight(30);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(34, 34, 34));
        btnEliminar.setBorder(null);
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Elimnar");
        btnEliminar.setRoundBottomLeft(30);
        btnEliminar.setRoundBottomRight(30);
        btnEliminar.setRoundTopLeft(30);
        btnEliminar.setRoundTopRight(30);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(34, 34, 34));
        btnModificar.setBorder(null);
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setRoundBottomLeft(30);
        btnModificar.setRoundBottomRight(30);
        btnModificar.setRoundTopLeft(30);
        btnModificar.setRoundTopRight(30);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(34, 34, 34));
        btnBuscar.setBorder(null);
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setRoundBottomLeft(30);
        btnBuscar.setRoundBottomRight(30);
        btnBuscar.setRoundTopLeft(30);
        btnBuscar.setRoundTopRight(30);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(34, 34, 34));
        jLabel7.setText("Fecha nacimiento");

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(34, 34, 34));
        jLabel8.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(34, 34, 34));
        jLabel9.setText("Apellido");

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(34, 34, 34));
        jLabel10.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(34, 34, 34));
        jLabel11.setText("Telefono");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(34, 34, 34));
        jLabel12.setText("Cedula");

        jdcFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jdcFechaNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        jdcFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(34, 34, 34));
        jLabel13.setText("Genero");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        javax.swing.GroupLayout panelInfoClientesLayout = new javax.swing.GroupLayout(panelInfoClientes);
        panelInfoClientes.setLayout(panelInfoClientesLayout);
        panelInfoClientesLayout.setHorizontalGroup(
            panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoClientesLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInfoClientesLayout.createSequentialGroup()
                        .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(cbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(72, 72, 72)
                .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInfoClientesLayout.createSequentialGroup()
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelInfoClientesLayout.setVerticalGroup(
            panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoClientesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBuscar)))
                    .addGroup(panelInfoClientesLayout.createSequentialGroup()
                        .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(txtCedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbGenero)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(329, Short.MAX_VALUE))
        );

        Jtabbed.addTab("tab2", panelInfoClientes);

        javax.swing.GroupLayout panelInfoVentasLayout = new javax.swing.GroupLayout(panelInfoVentas);
        panelInfoVentas.setLayout(panelInfoVentasLayout);
        panelInfoVentasLayout.setHorizontalGroup(
            panelInfoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1535, Short.MAX_VALUE)
        );
        panelInfoVentasLayout.setVerticalGroup(
            panelInfoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );

        Jtabbed.addTab("tab3", panelInfoVentas);

        panelInfoClientes1.setBackground(new java.awt.Color(243, 229, 215));

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
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

        btnInsertar1.setBackground(new java.awt.Color(34, 34, 34));
        btnInsertar1.setBorder(null);
        btnInsertar1.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar1.setText("Insertar");
        btnInsertar1.setRoundBottomLeft(30);
        btnInsertar1.setRoundBottomRight(30);
        btnInsertar1.setRoundTopLeft(30);
        btnInsertar1.setRoundTopRight(30);

        btnMostrar1.setBackground(new java.awt.Color(34, 34, 34));
        btnMostrar1.setBorder(null);
        btnMostrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar1.setText("Mostrar");
        btnMostrar1.setRoundBottomLeft(30);
        btnMostrar1.setRoundBottomRight(30);
        btnMostrar1.setRoundTopLeft(30);
        btnMostrar1.setRoundTopRight(30);
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(34, 34, 34));
        btnEliminar1.setBorder(null);
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("Elimnar");
        btnEliminar1.setRoundBottomLeft(30);
        btnEliminar1.setRoundBottomRight(30);
        btnEliminar1.setRoundTopLeft(30);
        btnEliminar1.setRoundTopRight(30);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnModificar1.setBackground(new java.awt.Color(34, 34, 34));
        btnModificar1.setBorder(null);
        btnModificar1.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar1.setText("Modificar");
        btnModificar1.setRoundBottomLeft(30);
        btnModificar1.setRoundBottomRight(30);
        btnModificar1.setRoundTopLeft(30);
        btnModificar1.setRoundTopRight(30);
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        btnBuscar1.setBackground(new java.awt.Color(34, 34, 34));
        btnBuscar1.setBorder(null);
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Buscar");
        btnBuscar1.setRoundBottomLeft(30);
        btnBuscar1.setRoundBottomRight(30);
        btnBuscar1.setRoundTopLeft(30);
        btnBuscar1.setRoundTopRight(30);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        txtBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtBuscar1.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar1.setBorder(null);

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(34, 34, 34));
        jLabel14.setText("Categoria");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(34, 34, 34));
        jLabel15.setText("Nombre");

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(34, 34, 34));
        jLabel19.setText("Precio");

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(34, 34, 34));
        jLabel23.setText("Cantidad");

        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(34, 34, 34));
        jLabel24.setText("ID");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(34, 34, 34));
        jLabel25.setText("Descripcion");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(34, 34, 34));
        jLabel27.setText("Ingredientes");

        agregarIngrediente.setBackground(new java.awt.Color(34, 34, 34));
        agregarIngrediente.setBorder(null);
        agregarIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        agregarIngrediente.setText("agregar");
        agregarIngrediente.setRoundBottomLeft(30);
        agregarIngrediente.setRoundBottomRight(30);
        agregarIngrediente.setRoundTopLeft(30);
        agregarIngrediente.setRoundTopRight(30);

        btnCrearIngrediente.setBackground(new java.awt.Color(34, 34, 34));
        btnCrearIngrediente.setBorder(null);
        btnCrearIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearIngrediente.setText("crear producto");
        btnCrearIngrediente.setRoundBottomLeft(30);
        btnCrearIngrediente.setRoundBottomRight(30);
        btnCrearIngrediente.setRoundTopLeft(30);
        btnCrearIngrediente.setRoundTopRight(30);

        javax.swing.GroupLayout panelInfoClientes1Layout = new javax.swing.GroupLayout(panelInfoClientes1);
        panelInfoClientes1.setLayout(panelInfoClientes1Layout);
        panelInfoClientes1Layout.setHorizontalGroup(
            panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoClientes1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addGroup(panelInfoClientes1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInfoClientes1Layout.createSequentialGroup()
                        .addComponent(btnInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelInfoClientes1Layout.setVerticalGroup(
            panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoClientes1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoClientes1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                    .addGroup(panelInfoClientes1Layout.createSequentialGroup()
                        .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInfoClientes1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(3, 3, 3)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInfoProductosLayout = new javax.swing.GroupLayout(panelInfoProductos);
        panelInfoProductos.setLayout(panelInfoProductosLayout);
        panelInfoProductosLayout.setHorizontalGroup(
            panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1619, Short.MAX_VALUE)
            .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelInfoProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInfoClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelInfoProductosLayout.setVerticalGroup(
            panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
            .addGroup(panelInfoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelInfoProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInfoClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Jtabbed.addTab("tab4", panelInfoProductos);

        javax.swing.GroupLayout panelInfoUsuarioLayout = new javax.swing.GroupLayout(panelInfoUsuario);
        panelInfoUsuario.setLayout(panelInfoUsuarioLayout);
        panelInfoUsuarioLayout.setHorizontalGroup(
            panelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1535, Short.MAX_VALUE)
        );
        panelInfoUsuarioLayout.setVerticalGroup(
            panelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );

        Jtabbed.addTab("tab5", panelInfoUsuario);

        panelEmpleado.setBackground(new java.awt.Color(243, 229, 215));

        jtablaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jtablaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Contraseña", "Telefono", "Fecha nacimiento", "Genero", "Fecha ingreso", "Contrato", "Turno"
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

        btnInsertar2.setBackground(new java.awt.Color(34, 34, 34));
        btnInsertar2.setBorder(null);
        btnInsertar2.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar2.setText("Insertar");
        btnInsertar2.setRoundBottomLeft(30);
        btnInsertar2.setRoundBottomRight(30);
        btnInsertar2.setRoundTopLeft(30);
        btnInsertar2.setRoundTopRight(30);
        btnInsertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar2ActionPerformed(evt);
            }
        });

        btnMostrar2.setBackground(new java.awt.Color(34, 34, 34));
        btnMostrar2.setBorder(null);
        btnMostrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar2.setText("Mostrar");
        btnMostrar2.setRoundBottomLeft(30);
        btnMostrar2.setRoundBottomRight(30);
        btnMostrar2.setRoundTopLeft(30);
        btnMostrar2.setRoundTopRight(30);
        btnMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar2ActionPerformed(evt);
            }
        });

        btnEliminar2.setBackground(new java.awt.Color(34, 34, 34));
        btnEliminar2.setBorder(null);
        btnEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar2.setText("Elimnar");
        btnEliminar2.setRoundBottomLeft(30);
        btnEliminar2.setRoundBottomRight(30);
        btnEliminar2.setRoundTopLeft(30);
        btnEliminar2.setRoundTopRight(30);
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        btnModificar2.setBackground(new java.awt.Color(34, 34, 34));
        btnModificar2.setBorder(null);
        btnModificar2.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar2.setText("Modificar");
        btnModificar2.setRoundBottomLeft(30);
        btnModificar2.setRoundBottomRight(30);
        btnModificar2.setRoundTopLeft(30);
        btnModificar2.setRoundTopRight(30);
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });

        btnBuscar2.setBackground(new java.awt.Color(34, 34, 34));
        btnBuscar2.setBorder(null);
        btnBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar2.setText("Buscar");
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
        txtBuscar2.setBorder(null);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(34, 34, 34));
        jLabel34.setText("Fecha nacimiento");

        txtCedula1.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCedula1.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(34, 34, 34));
        jLabel35.setText("Nombre");

        txtNombre1.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(34, 34, 34));
        jLabel36.setText("Apellido");

        txtApellido1.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(34, 34, 34));
        jLabel37.setText("Correo");

        txtCorreo1.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCorreo1.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(34, 34, 34));
        jLabel38.setText("Telefono");

        txtTelefono1.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(34, 34, 34));
        jLabel39.setText("Cedula");

        jdcFechaNacimiento1.setBackground(new java.awt.Color(255, 255, 255));
        jdcFechaNacimiento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        jdcFechaNacimiento1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(34, 34, 34));
        jLabel40.setText("Genero");

        cbGenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(34, 34, 34));
        jLabel41.setText("Fecha ingreso");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(34, 34, 34));
        jLabel42.setText("Tipo contrato");

        cbContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabajo", "Prestacion de servicios" }));
        cbContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContratoActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(34, 34, 34));
        jLabel43.setText("Jornada");

        cbJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Noche", "Mixta", " " }));

        javax.swing.GroupLayout panelEmpleadoLayout = new javax.swing.GroupLayout(panelEmpleado);
        panelEmpleado.setLayout(panelEmpleadoLayout);
        panelEmpleadoLayout.setHorizontalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadoLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(txtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel40)
                    .addComponent(jLabel34)
                    .addComponent(jdcFechaNacimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(cbGenero1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41)
                    .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbContrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbJornada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(btnInsertar2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelEmpleadoLayout.setVerticalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInsertar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnModificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBuscar2)))
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcFechaNacimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(txtCedula1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbGenero1)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbContrato)
                            .addComponent(txtCorreo1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbJornada)))))
                .addContainerGap(329, Short.MAX_VALUE))
        );

        Jtabbed.addTab("tab2", panelEmpleado);

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
    private componente.ButtonRound agregarIngrediente;
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
    private javax.swing.JComboBox<String> cbContrato;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbGenero1;
    private javax.swing.JComboBox<String> cbJornada;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
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
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JPanel panelInfoClientes;
    private javax.swing.JPanel panelInfoClientes1;
    private javax.swing.JPanel panelInfoIncio;
    private javax.swing.JPanel panelInfoProductos;
    private javax.swing.JPanel panelInfoUsuario;
    private javax.swing.JPanel panelInfoVentas;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProducto;
    private componente.PanelRound_1 panelRound_11;
    private componente.PanelRound_1 panelRound_12;
    private componente.PanelRound_1 panelRound_14;
    private componente.PanelRound_1 panelRound_15;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JPanel panelUsuario1;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JPanel panelinicio;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar1;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlabprogra2;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ofici
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        Personas.add(new Empleado("Administrador", "Nasralla", 50, 8011, 8777, "Copán", 123456));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup4 = new javax.swing.ButtonGroup();
        tp_Principal = new javax.swing.JTabbedPane();
        Agregar = new javax.swing.JPanel();
        tp_Agregar = new javax.swing.JTabbedPane();
        pa_Persona = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EdadTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IdTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DineroTf = new javax.swing.JTextField();
        IdBoletTf = new javax.swing.JTextField();
        btAgregarPersona = new javax.swing.JButton();
        tp_TipoPersona = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        EmpleoTf = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        CarreraTf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        AfiliacionCb = new javax.swing.JComboBox<>();
        DepartamentoCb = new javax.swing.JComboBox<>();
        pa_Listar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTb = new javax.swing.JTable();
        pa_Modificar = new javax.swing.JPanel();
        ModificarCb = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaModTb = new javax.swing.JTable();
        ModificarBt = new javax.swing.JButton();
        pa_Eliminar = new javax.swing.JPanel();
        CerrarBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tp_Principal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tp_PrincipalStateChanged(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("ID");

        jLabel4.setText("ID del Boleto");

        jLabel5.setText("Departamento");

        jLabel6.setText("Dinero");

        btAgregarPersona.setText("Agregar");
        btAgregarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarPersonaMouseClicked(evt);
            }
        });

        jLabel9.setText("Empleo");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(EmpleoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(EmpleoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        tp_TipoPersona.addTab("Empleado", jPanel7);

        jLabel13.setText("Carrera que estudia");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CarreraTf, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CarreraTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        tp_TipoPersona.addTab("Estudiante", jPanel8);

        jLabel31.setText("Afiliación");

        AfiliacionCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Partido Nacional", "Partido Libertad y Refundación", "Partido Liberal", "Partido Anticorrupción", "Democracia Cristiana", "Unificación Democrática", "Partido Innovación y Unidad", "Partido Frente Amplio Político Electoral en Resistencia", "Alianza Patriótica Hondureña" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(AfiliacionCb, 0, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(AfiliacionCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        tp_TipoPersona.addTab("Politico", jPanel1);

        DepartamentoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Francisco Morazán", "Islas de la Bahía", "Cortés", "Atlántida", "Yoro", "Colón", "Comayagua", "Valle", "Choluteca", "Olancho", "La Paz", "El Paraíso", "Ocotepeque", "Copán", "Santa Bárbara", "Intibucá", "Gracias a Dios", "Lempira" }));

        javax.swing.GroupLayout pa_PersonaLayout = new javax.swing.GroupLayout(pa_Persona);
        pa_Persona.setLayout(pa_PersonaLayout);
        pa_PersonaLayout.setHorizontalGroup(
            pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_PersonaLayout.createSequentialGroup()
                .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_PersonaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DineroTf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdBoletTf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NombreTf)
                                .addComponent(EdadTf)
                                .addComponent(IdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DepartamentoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138)
                        .addComponent(tp_TipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pa_PersonaLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btAgregarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pa_PersonaLayout.setVerticalGroup(
            pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_PersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_PersonaLayout.createSequentialGroup()
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(EdadTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(IdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(IdBoletTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(DepartamentoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pa_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DineroTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tp_TipoPersona))
                .addGap(18, 18, 18)
                .addComponent(btAgregarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        tp_Agregar.addTab("Persona", pa_Persona);

        javax.swing.GroupLayout AgregarLayout = new javax.swing.GroupLayout(Agregar);
        Agregar.setLayout(AgregarLayout);
        AgregarLayout.setHorizontalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_Agregar)
                .addContainerGap())
        );
        AgregarLayout.setVerticalGroup(
            AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_Agregar)
                .addContainerGap())
        );

        tp_Principal.addTab("Agregar", Agregar);

        ListaTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "ID", "ID_Boleto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ListaTb);

        javax.swing.GroupLayout pa_ListarLayout = new javax.swing.GroupLayout(pa_Listar);
        pa_Listar.setLayout(pa_ListarLayout);
        pa_ListarLayout.setHorizontalGroup(
            pa_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_ListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        pa_ListarLayout.setVerticalGroup(
            pa_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_ListarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        tp_Principal.addTab("Listar", pa_Listar);

        ModificarCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ModificarCbItemStateChanged(evt);
            }
        });

        jLabel27.setText("Persona");

        ListaModTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", " ", "", "", ""
            }
        ));
        jScrollPane3.setViewportView(ListaModTb);

        ModificarBt.setText("Guardar Cambios");
        ModificarBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pa_ModificarLayout = new javax.swing.GroupLayout(pa_Modificar);
        pa_Modificar.setLayout(pa_ModificarLayout);
        pa_ModificarLayout.setHorizontalGroup(
            pa_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_ModificarLayout.createSequentialGroup()
                .addGroup(pa_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ModificarBt)
                    .addGroup(pa_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pa_ModificarLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel27)
                            .addGap(65, 65, 65)
                            .addComponent(ModificarCb, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pa_ModificarLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pa_ModificarLayout.setVerticalGroup(
            pa_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pa_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(ModificarBt)
                .addContainerGap())
        );

        tp_Principal.addTab("Modificar", pa_Modificar);

        javax.swing.GroupLayout pa_EliminarLayout = new javax.swing.GroupLayout(pa_Eliminar);
        pa_Eliminar.setLayout(pa_EliminarLayout);
        pa_EliminarLayout.setHorizontalGroup(
            pa_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        pa_EliminarLayout.setVerticalGroup(
            pa_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        tp_Principal.addTab("Eliminar", pa_Eliminar);

        CerrarBt.setText("Cerrar Sesión");
        CerrarBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarBtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CerrarBt))
                    .addComponent(tp_Principal))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_Principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CerrarBt)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBtMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CerrarBtMouseClicked

    private void btAgregarPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarPersonaMouseClicked
        // TODO add your handling code here:
        if (tp_TipoPersona.getSelectedIndex() == 0) {
            try {
                Personas.add(new Empleado(
                        EmpleoTf.getText(), NombreTf.getText(),
                        Integer.parseInt(EdadTf.getText()), 
                        Integer.parseInt(IdTf.getText()),
                        Integer.parseInt(IdBoletTf.getText()),
                        DepartamentoCb.getItemAt(DepartamentoCb.getSelectedIndex()),
                        Float.parseFloat(DineroTf.getText())));
                JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Debe llenar todo el formulario");
            }
        }
        if (tp_TipoPersona.getSelectedIndex() == 1) {
            try {
                Estudiante p = new Estudiante();
                p.setDepartamento(DepartamentoCb.getItemAt(DepartamentoCb.getSelectedIndex()));
                p.setDinero(Float.parseFloat(DineroTf.getText()));
                p.setEdad(Integer.parseInt(EdadTf.getText()));
                p.setID(Integer.parseInt(IdTf.getText()));
                p.setID_Boleto(Integer.parseInt(IdBoletTf.getText()));
                p.setNombre(NombreTf.getText());
                ((Estudiante) p).setCarrera(CarreraTf.getText());
                Personas.add(p);
                JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Debe llenar todo el formulario");
            }
        }
        if (tp_TipoPersona.getSelectedIndex() == 2) {
            try {
                Politico p = new Politico();
                p.setDepartamento(DepartamentoCb.getItemAt(DepartamentoCb.getSelectedIndex()));
                p.setDinero(Float.parseFloat(DineroTf.getText()));
                p.setEdad(Integer.parseInt(EdadTf.getText()));
                p.setID(Integer.parseInt(IdTf.getText()));
                p.setID_Boleto(Integer.parseInt(IdBoletTf.getText()));
                p.setNombre(NombreTf.getText());
                ((Politico) p).setAfiliacion(AfiliacionCb.getItemAt(AfiliacionCb.getSelectedIndex()));
                Personas.add(p);
                JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Debe llenar todo el formulario");
            }
        }
    }//GEN-LAST:event_btAgregarPersonaMouseClicked

    private void tp_PrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tp_PrincipalStateChanged
        // TODO add your handling code here:
        if (tp_Principal.getSelectedIndex() == 1) {
            ListaTb.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Nombre", "Edad", "ID", "ID del Boleto"
                    }
            ));
            DefaultTableModel modelo = (DefaultTableModel) ListaTb.getModel();
            for (Persona t : Personas) {
                Object[] filanueva = {
                    t.getNombre(),
                    t.getEdad(),
                    t.getID(),
                    t.getID_Boleto()
                };
                modelo.addRow(filanueva);
            }
            ListaTb.setModel(modelo);
        }

        if (tp_Principal.getSelectedIndex() == 2) {
            ListaModTb.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Nombre", "Edad", "ID", "ID del Boleto",
                         "Departamento", "Dinero", "Atributo"
                    }
            ));
            DefaultComboBoxModel modeloCB = new DefaultComboBoxModel();
            for (Persona t : Personas) {
                modeloCB.addElement(t.getNombre());
            }
            ModificarCb.setModel(modeloCB);
        }
    }//GEN-LAST:event_tp_PrincipalStateChanged

    private void ModificarCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ModificarCbItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == 2) {
            if (Personas.get(ModificarCb.getSelectedIndex())instanceof Empleado) {
                ListaModTb.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Edad", "ID", "ID del Boleto",
                             "Departamento", "Dinero", "Empleo"
                        }
                ));
                DefaultTableModel modelo = (DefaultTableModel) ListaModTb.getModel();
                Empleado t = (Empleado) Personas.get(ModificarCb.getSelectedIndex());
                Object[] filanueva = {
                    t.getNombre(),
                    t.getEdad(),
                    t.getID(),
                    t.getID_Boleto(),t.getDepartamento(),
                    t.getDinero(),t.getEmpleo()
                };
                modelo.addRow(filanueva);
                ListaModTb.setModel(modelo);
            }
            if (Personas.get(ModificarCb.getSelectedIndex())instanceof Estudiante) {
                ListaModTb.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Edad", "ID", "ID del Boleto",
                             "Departamento", "Dinero", "Carrera que estudia"
                        }
                ));
                DefaultTableModel modelo = (DefaultTableModel) ListaModTb.getModel();
                Estudiante t = (Estudiante) Personas.get(ModificarCb.getSelectedIndex());
                Object[] filanueva = {
                    t.getNombre(),
                    t.getEdad(),
                    t.getID(),
                    t.getID_Boleto(),t.getDepartamento(),
                    t.getDinero(),t.getCarrera()
                };
                modelo.addRow(filanueva);
                ListaModTb.setModel(modelo);
            }
            if (Personas.get(ModificarCb.getSelectedIndex())instanceof Politico) {
                ListaModTb.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Edad", "ID", "ID del Boleto",
                             "Departamento", "Dinero", "Afiliacion"
                        }
                ));
                DefaultTableModel modelo = (DefaultTableModel) ListaModTb.getModel();
                Politico t = (Politico) Personas.get(ModificarCb.getSelectedIndex());
                Object[] filanueva = {
                    t.getNombre(),
                    t.getEdad(),
                    t.getID(),
                    t.getID_Boleto(),t.getDepartamento(),
                    t.getDinero(),t.getAfiliacion()
                };
                modelo.addRow(filanueva);
                ListaModTb.setModel(modelo);
            }
        }
    }//GEN-LAST:event_ModificarCbItemStateChanged

    private void ModificarBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarBtMouseClicked
        // TODO add your handling code here:
        try {
            int pos = ModificarCb.getSelectedIndex();
            Personas.get(pos).setNombre(ListaModTb.getValueAt(0, 0).toString());
            Personas.get(pos).setEdad(Integer.parseInt(ListaModTb.getValueAt(0, 1).toString()));
            Personas.get(pos).setID(Integer.parseInt(ListaModTb.getValueAt(0, 2).toString()));
            Personas.get(pos).setID_Boleto(Integer.parseInt(ListaModTb.getValueAt(0, 3).toString()));
            Personas.get(pos).setDepartamento(ListaModTb.getValueAt(0, 4).toString());
            Personas.get(pos).setDinero(Float.parseFloat(ListaModTb.getValueAt(0, 5).toString()));
            if (Personas.get(pos) instanceof Empleado) {
                ((Empleado)Personas.get(pos)).setEmpleo(ListaModTb.getValueAt(0, 6).toString());
            }
            if (Personas.get(pos) instanceof Estudiante) {
                ((Estudiante)Personas.get(pos)).setCarrera(ListaModTb.getValueAt(0, 6).toString());
            }
            if (Personas.get(pos) instanceof Politico) {
                ((Politico)Personas.get(pos)).setAfiliacion(ListaModTb.getValueAt(0, 6).toString());
            }
            JOptionPane.showMessageDialog(this, "Se guardaron los cambios");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salió mal");
        }

    }//GEN-LAST:event_ModificarBtMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AfiliacionCb;
    private javax.swing.JPanel Agregar;
    private javax.swing.JTextField CarreraTf;
    private javax.swing.JButton CerrarBt;
    private javax.swing.JComboBox<String> DepartamentoCb;
    private javax.swing.JTextField DineroTf;
    private javax.swing.JTextField EdadTf;
    private javax.swing.JTextField EmpleoTf;
    private javax.swing.JTextField IdBoletTf;
    private javax.swing.JTextField IdTf;
    private javax.swing.JTable ListaModTb;
    private javax.swing.JTable ListaTb;
    private javax.swing.JButton ModificarBt;
    private javax.swing.JComboBox<String> ModificarCb;
    private javax.swing.JTextField NombreTf;
    private javax.swing.JButton btAgregarPersona;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pa_Eliminar;
    private javax.swing.JPanel pa_Listar;
    private javax.swing.JPanel pa_Modificar;
    private javax.swing.JPanel pa_Persona;
    private javax.swing.JTabbedPane tp_Agregar;
    private javax.swing.JTabbedPane tp_Principal;
    private javax.swing.JTabbedPane tp_TipoPersona;
    // End of variables declaration//GEN-END:variables
    ArrayList<Persona> Personas = new ArrayList();
}

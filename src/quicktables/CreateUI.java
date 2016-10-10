/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicktables;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author David
 */
public class CreateUI extends javax.swing.JFrame {

    int currentCourse = 0;
    int currentDay = 0;
    ArrayList<Course> courseList = new ArrayList<>();   
    ArrayList<Day> dayList = new ArrayList<>();
    DefaultListModel model = new DefaultListModel();    //Contents of JLists from which courses are selected.
    
    /**
     * Creates new form UI
     */
    public CreateUI() {
        initComponents();
        
        lstHomeroom.setModel(model);    //Set JLists to listmodel so they all display the same content
        lstPeriod1.setModel(model);
        lstPeriod2.setModel(model);
        lstPeriod3.setModel(model);
        lstPeriod4.setModel(model);
        lstPeriod5.setModel(model);
        
    }

    private void updateText(){
        model.removeAllElements();  //Clear current DefaultListModel
        txtaCourses.setText(null);  //Clear courses list textarea
        txtaDays.setText(null);
        for(int i =0; i<currentCourse; i++){    //Populate DefaultListModel and courses textarea
            model.addElement(courseList.get(i).getCourseName());
            txtaCourses.append(courseList.get(i).getCourseName()+"\n");
        }
        for(int i =0; i<currentDay; i++){   //Loops for every day
            for(int k =0; k<currentCourse; k++){    //Every course within the day
                txtaDays.append("Day "+(i+1)+"\n");
                Course course = dayList.get(i).getCourse(k);
                txtaDays.append(course.getCourseCode()+"\n");
                txtaDays.append(course.getCourseName()+"\n");
                txtaDays.append(course.getRoom()+"\n");
                txtaDays.append(course.getTeacher()+"\n");
                txtaDays.append("\n");
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameAndGrade = new javax.swing.JLabel();
        lblSchoolAndYear = new javax.swing.JLabel();
        txtSchoolAndYear = new javax.swing.JTextField();
        txtNameAndGrade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDays = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaCourses = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstHomeroom = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPeriod1 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPeriod2 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstPeriod3 = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstPeriod4 = new javax.swing.JList();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstPeriod5 = new javax.swing.JList();
        lblNewDay = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
        lblCourses = new javax.swing.JLabel();
        lblNewCourse = new javax.swing.JLabel();
        lblCourseCode = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblHomeroom = new javax.swing.JLabel();
        lblPeriod1 = new javax.swing.JLabel();
        lblPeriod2 = new javax.swing.JLabel();
        lblPeriod3 = new javax.swing.JLabel();
        lblPeriod4 = new javax.swing.JLabel();
        lblPeriod5 = new javax.swing.JLabel();
        lblRoomCampus = new javax.swing.JLabel();
        lblTeacherName = new javax.swing.JLabel();
        txtCourseCode = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        txtRoomCampus = new javax.swing.JTextField();
        txtTeacherName = new javax.swing.JTextField();
        btnCreateCourse = new javax.swing.JButton();
        btnCreateDay = new javax.swing.JButton();
        btnCreateTimetable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameAndGrade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNameAndGrade.setText("Name and Grade");
        getContentPane().add(lblNameAndGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lblSchoolAndYear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSchoolAndYear.setText("School and Year");
        getContentPane().add(lblSchoolAndYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 11, 344, -1));
        getContentPane().add(txtSchoolAndYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 39, 132, -1));
        getContentPane().add(txtNameAndGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 127, -1));

        txtaDays.setEditable(false);
        txtaDays.setColumns(20);
        txtaDays.setRows(5);
        jScrollPane1.setViewportView(txtaDays);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 270, 676));

        txtaCourses.setEditable(false);
        txtaCourses.setColumns(20);
        txtaCourses.setRows(5);
        jScrollPane2.setViewportView(txtaCourses);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, 377));

        jScrollPane3.setMaximumSize(new java.awt.Dimension(87, 87));

        lstHomeroom.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstHomeroom);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, 87, -1));

        jScrollPane4.setMaximumSize(new java.awt.Dimension(65, 65));

        lstPeriod1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstPeriod1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 179, 65, -1));

        jScrollPane5.setMaximumSize(new java.awt.Dimension(65, 32767));

        lstPeriod2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lstPeriod2);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 179, 65, -1));

        jScrollPane6.setMaximumSize(new java.awt.Dimension(65, 32767));

        lstPeriod3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(lstPeriod3);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 179, 65, -1));

        jScrollPane7.setMaximumSize(new java.awt.Dimension(65, 32767));

        lstPeriod4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(lstPeriod4);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 179, 65, -1));

        jScrollPane8.setMaximumSize(new java.awt.Dimension(65, 32767));

        lstPeriod5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(lstPeriod5);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 179, 65, -1));

        lblNewDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNewDay.setText("New Day");
        getContentPane().add(lblNewDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 111, -1, -1));

        lblDays.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDays.setText("Days");
        getContentPane().add(lblDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        lblCourses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCourses.setText("Courses");
        getContentPane().add(lblCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        lblNewCourse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNewCourse.setText("New Course");
        getContentPane().add(lblNewCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 394, -1, -1));

        lblCourseCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCourseCode.setText("Course Code");
        getContentPane().add(lblCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 429, -1, -1));

        lblCourseName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCourseName.setText("Course Name");
        getContentPane().add(lblCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 455, -1, -1));

        lblHomeroom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHomeroom.setText("Homeroom");
        getContentPane().add(lblHomeroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        lblPeriod1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeriod1.setText("Period 1");
        getContentPane().add(lblPeriod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 151, -1, -1));

        lblPeriod2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeriod2.setText("Period 2");
        getContentPane().add(lblPeriod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 151, -1, -1));

        lblPeriod3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeriod3.setText("Period 3");
        getContentPane().add(lblPeriod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 151, -1, -1));

        lblPeriod4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeriod4.setText("Period 4");
        getContentPane().add(lblPeriod4, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 151, -1, -1));

        lblPeriod5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeriod5.setText("Period 5");
        getContentPane().add(lblPeriod5, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 151, -1, -1));

        lblRoomCampus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRoomCampus.setText("Room and Campus");
        getContentPane().add(lblRoomCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 481, -1, -1));

        lblTeacherName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTeacherName.setText("Teacher Name");
        getContentPane().add(lblTeacherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 507, -1, -1));
        getContentPane().add(txtCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 427, 180, -1));
        getContentPane().add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 453, 180, -1));
        getContentPane().add(txtRoomCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 479, 180, -1));
        getContentPane().add(txtTeacherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 505, 180, -1));

        btnCreateCourse.setText("Create");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 531, -1, -1));

        btnCreateDay.setText("Create");
        btnCreateDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDayActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        btnCreateTimetable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreateTimetable.setText("Generate Timetable");
        btnCreateTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTimetableActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateTimetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        // TODO add your handling code here:
        Course course = new Course(txtCourseCode.getText(), txtCourseName.getText(), txtRoomCampus.getText(), txtTeacherName.getText());
        courseList.add(course);
        currentCourse++;
        updateText();
    }//GEN-LAST:event_btnCreateCourseActionPerformed

    private void btnCreateDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDayActionPerformed
        // TODO add your handling code here:
        int homeroom = lstHomeroom.getSelectedIndex();
        int period1 = lstPeriod1.getSelectedIndex();
        int period2 = lstPeriod2.getSelectedIndex();
        int period3 = lstPeriod3.getSelectedIndex();
        int period4 = lstPeriod4.getSelectedIndex();
        int period5 = lstPeriod5.getSelectedIndex();
        
        Day day = new Day(courseList.get(homeroom), courseList.get(period1), courseList.get(period2), courseList.get(period3), courseList.get(period4), courseList.get(period5));
        dayList.add(day);
        currentDay ++;
        updateText();
        
    }//GEN-LAST:event_btnCreateDayActionPerformed

    private void btnCreateTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTimetableActionPerformed
        // TODO add your handling code here:
        String nameAndGrade = txtNameAndGrade.getText();        //Create schedule object to serialize
        String schoolAndYear = txtSchoolAndYear.getText();
        Schedule schedule = new Schedule(nameAndGrade, schoolAndYear, dayList.get(0), dayList.get(1), dayList.get(2), dayList.get(3), dayList.get(4), dayList.get(5), dayList.get(6), dayList.get(7));
        File directory = null;
        JFileChooser saveDialog = new JFileChooser();   //Create file chooser dialog
        saveDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //Select only folders, as file will be saved to folder
        
        if(saveDialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){   //If a directory is selected
            directory = saveDialog.getSelectedFile();   //Get directory
        }
        
        try{
            String outputDirectory = directory.getAbsolutePath()+"\\timetable.ser"; //File will be named timetable.ser within the directory. Double slash as first slash is escape character.
            FileOutputStream output = new FileOutputStream(outputDirectory);
            ObjectOutputStream objectOut = new ObjectOutputStream(output);
            objectOut.writeObject(schedule);
            objectOut.close();
            output.close();
        }
        catch(IOException i){
            System.out.println(i);
        }
        
    }//GEN-LAST:event_btnCreateTimetableActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JButton btnCreateDay;
    private javax.swing.JButton btnCreateTimetable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCourses;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblHomeroom;
    private javax.swing.JLabel lblNameAndGrade;
    private javax.swing.JLabel lblNewCourse;
    private javax.swing.JLabel lblNewDay;
    private javax.swing.JLabel lblPeriod1;
    private javax.swing.JLabel lblPeriod2;
    private javax.swing.JLabel lblPeriod3;
    private javax.swing.JLabel lblPeriod4;
    private javax.swing.JLabel lblPeriod5;
    private javax.swing.JLabel lblRoomCampus;
    private javax.swing.JLabel lblSchoolAndYear;
    private javax.swing.JLabel lblTeacherName;
    private javax.swing.JList lstHomeroom;
    private javax.swing.JList lstPeriod1;
    private javax.swing.JList lstPeriod2;
    private javax.swing.JList lstPeriod3;
    private javax.swing.JList lstPeriod4;
    private javax.swing.JList lstPeriod5;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtNameAndGrade;
    private javax.swing.JTextField txtRoomCampus;
    private javax.swing.JTextField txtSchoolAndYear;
    private javax.swing.JTextField txtTeacherName;
    private javax.swing.JTextArea txtaCourses;
    private javax.swing.JTextArea txtaDays;
    // End of variables declaration//GEN-END:variables
}

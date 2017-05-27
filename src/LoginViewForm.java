
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.sql.*;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class LoginViewForm extends javax.swing.JFrame implements SerialPortEventListener {

    /**
     * Creates new form LoginViewForm
     */
    public String uname;
    public String password;

    public LoginViewForm() {
        initComponents();
         SerialRead();
        //restrict resizing
        
        //begin serial read process 
        //SerialRead();
        setResizable(false);
        //set the jframe always on top
        setAlwaysOnTop(true);
        //set jframe always middle of the screen
        setLocationRelativeTo(null);
        //disable closing
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //set the title
        setTitle("SAVROS Control Panel 1.0");
        setIcon();

        //decrypt the credential file
        //Encrypt en = new Encrypt();
        //en.decr();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        userNameValidate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/managed.PNG"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        userNameValidate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userNameValidate.setForeground(new java.awt.Color(255, 204, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PadLock.png"))); // NOI18N

        Status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //close the current jframe when button click
        
        closePort();
        
        this.dispose();

        UpdateLogin ul = new UpdateLogin();
        ul.setVisible(true);
        ul.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //decrypt the credential file
        Encrypt en = new Encrypt();
        en.decr();

        uname = jTextField1.getText();
        char password[] = jPasswordField1.getPassword();
        try {
            String b = new String(password);
            //call the compare function
            compare(uname, b);
            

        } catch (Exception er) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel userNameValidate;
    // End of variables declaration//GEN-END:variables

    //method to set the iconimage
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Images\\titleIcon.png"));
    }

    //compare and authentication function
    public void compare(String uname, String password) throws IOException {

        String filename = "src\\Credentials\\credentials.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        try {
            String line;
            boolean valid = false;
            //as long as there are lines in the file, print them

            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                String A[] = line.split(" ");

                if (uname.equals(A[0])) {
                    if (password.equals(A[1])) {
                        valid = true;

                        //encrypt
                        Encrypt en = new Encrypt();
                        en.encr();
                            
                        
                        //close the serial read process
                        closePort();
                        
                        
                        
                        //close the current jframe when button click  
                        this.dispose();

                        //load adminform jframe when button clicked
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                //try {
                                    //new AdminForm().setVisible(true);
                                    new p1().setVisible(true);
                               // } catch (IOException ex) {
                                   // Logger.getLogger(LoginViewForm.class.getName()).log(Level.SEVERE, null, ex);
                               // }
                            }
                        });

                        //load the about jframe
                        About abt = new About();
                        abt.setVisible(true);
                        abt.pack();
                    }
                }
            }
            if (valid == false) {

                String st1 = "** Invalid Login Details";
                // JOptionPane.showMessageDialog(null,st);
                userNameValidate.setText(st1);

                if (jTextField1.getText().isEmpty()) {
                    String st2 = "**You can't leave empty fields.";
                    // JOptionPane.showMessageDialog(null,st);
                    userNameValidate.setText(st2);

                }

                Encrypt en = new Encrypt();
                en.encr();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //display the success message when password updation scceeded
    public void setText() {
        userNameValidate.setText("Credentials successfully updated!");
    }

    //======Serial Read =========
    SerialPort serialPort;
    private static final String PORT_NAMES[] = {"COM7"}; //com6 usb has connected with Sashika's arduino
    private BufferedReader input; //converting the bytes into characters from InputStreamReader
    private OutputStream output;
    private static final int TIME_OUT = 2000; //Milliseconds to block while waiting for port open
    private static final int DATA_RATE = 9600; //Default bits per second for COM port
    public String inputLine;
    
    //count
     public int count=0;

    public void initialize() {
        CommPortIdentifier portId = null;
        Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

        //First, Find an instance of serial port as set in PORT_NAMES.
        while (portEnum.hasMoreElements()) {
            CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
            for (String portName : PORT_NAMES) {
                if (currPortId.getName().equals(portName)) {
                    portId = currPortId;
                    break;
                }
            }
        }

        if (portId == null) {
            System.out.println("Could not find COM port.");
            return;
        }

        try {
            // open serial port, and use class name for the appName.
            serialPort = (SerialPort) portId.open(this.getClass().getName(), TIME_OUT);

            // set port parameters
            serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

            // open the streams
            input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
            output = serialPort.getOutputStream();

            // add event listeners
            serialPort.addEventListener((SerialPortEventListener) this);
            serialPort.notifyOnDataAvailable(true);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    /**
     * This should be called when you stop using the port. This will prevent
     * port locking on platforms like Linux.
     *
     * public synchronized void close() { if (serialPort != null) {
     * serialPort.removeEventListener(); serialPort.close(); } }
     */
    /**
     * Handle an event on the serial port. Read the data and print it.
     */
    public synchronized void serialEvent(SerialPortEvent oEvent) {
        
       

        if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            try {
                inputLine = input.readLine();
                System.out.println(inputLine);
                changeStatus();
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
        // Ignore all the other eventTypes, but you should consider the other ones.
    }

    public void SerialRead() {

        initialize();

        Thread t = new Thread() {
            public void run() {
                //the following line will keep this app alive for 1000 seconds,
                //waiting for events to occur and responding to them (printing incoming messages to console).
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException ie) {
                }
            }
        };
        t.start();
        System.out.println("Started");

    }

    public void changeStatus() throws IOException {
        //-----------
        String array[] = inputLine.split(" ");

        String digit01 = array[0];
        String digit02 = array[1];
        String digit03 = array[2];
        String digit04 = array[3];

        ImageIcon icon;
        Connection con = DBConnect.connectDB();
        switch (digit04) {

            case "0":
                //String status1 = "Error";
                //Status.setText(status1);
                
               // returnNotificationValue(0);
                
                icon = new ImageIcon(this.getClass().getResource("images/managed.png"));
                jLabel5.setIcon(icon);
                
                count = 0;
                
                
                break;
            //-----------
            case "1":
                //String status2 = "OK";
                //Status.setText(status2);
               // returnNotificationValue(1);
                
                icon = new ImageIcon(this.getClass().getResource("images/mismanaged.png"));
                jLabel5.setIcon(icon);

                String start_point = digit02;
                String end_point = digit01;
                //put to the databse
                try {
                    
                   
                    count++;
                   if(count < 2){
                    Statement stat = (Statement) con.createStatement();
                    String str = "insert into congest(start_point, end_point) values('" + start_point + "','" + end_point + "')";
                    
                    stat.executeUpdate(str);
                   }
                } catch (Exception e) {
                }
                break;

        }

        /*switch(digit02){
         case "":
                
         }*/
    }
    
public void closePort()
{

   try
   {
      if (serialPort != null)
      {
         serialPort.getInputStream().close();
         serialPort.getOutputStream().close();

         new CloseThread().start();

      }

   } catch (Exception e) {}
}
   

class CloseThread extends Thread
{
   public void run()
   {
      serialPort.removeEventListener();
      serialPort.close();
   }
}


}
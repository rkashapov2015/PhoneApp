
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.eclipsesource.json.*;
import components.Sender;
import components.asterisk.*;
import java.awt.*;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import org.ini4j.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rinat
 */
public class MainFrame extends javax.swing.JFrame {

    private List<Queue> queues;
    private String oldResult;
    public SubThread thread;
    private List<JPanel> queuesPanels;
    private String urlAddress;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        queues = new ArrayList<>();
        oldResult = "";
        queuesPanels = new ArrayList<>();
        /*getDataAsterisk();
        renderPhones();*/
        //rePaint();
        thread = new SubThread(this);
        initConfig();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jtUrl = new javax.swing.JTextField();
        jlUrl = new javax.swing.JLabel();
        jbSave = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jbGear = new javax.swing.JButton();
        jpPhones = new javax.swing.JPanel();
        jpIndicator = new javax.swing.JPanel();

        jtUrl.setText("http://10.1.51.6:3000/monitor.php");

        jlUrl.setText("Ссылка");

        jbSave.setText("Сохранить");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUrl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jbSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setMinimumSize(new java.awt.Dimension(760, 302));

        jbGear.setText("\t⚙");
        jbGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGearActionPerformed(evt);
            }
        });

        jpPhones.setMinimumSize(new java.awt.Dimension(608, 253));

        javax.swing.GroupLayout jpPhonesLayout = new javax.swing.GroupLayout(jpPhones);
        jpPhones.setLayout(jpPhonesLayout);
        jpPhonesLayout.setHorizontalGroup(
            jpPhonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpPhonesLayout.setVerticalGroup(
            jpPhonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        jpIndicator.setPreferredSize(new java.awt.Dimension(2, 0));

        javax.swing.GroupLayout jpIndicatorLayout = new javax.swing.GroupLayout(jpIndicator);
        jpIndicator.setLayout(jpIndicatorLayout);
        jpIndicatorLayout.setHorizontalGroup(
            jpIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jpIndicatorLayout.setVerticalGroup(
            jpIndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jpIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGear))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPhones, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPhones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGearActionPerformed
        jDialog1.setSize(390, 200);
        jDialog1.setResizable(false);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setTitle("Настройки");
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jbGearActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        urlAddress = jtUrl.getText();
    }//GEN-LAST:event_jbSaveActionPerformed

    private synchronized boolean getDataAsterisk() {
        //String result = "{\"queue\":{\"4000\":{\"402\":[\"Unavailable\"],\"401\":[\"Unavailable\"],\"400\":[\"Unavailable\"]},\"2000\":{\"200\":[\"Not in use\"],\"202\":[\"Busy\",\"paused\"],\"201\":[\"Unavailable\"]},\"3000\":{\"302\":[\"Unavailable\"],\"301\":[\"Unavailable\"],\"300\":[\"Unavailable\"]}}}";

        //JsonObject jsonObject = Json.parse(result).asObject();
        Sender sender = new Sender(urlAddress);
        try {
            String result = sender.getRequest();
            //System.out.println(result);
            //System.out.println(this.oldResult.equals(result));
            if (result.equals("error")) {
                //System.out.println("Меняем индикатор");
                checkIndicator(true);
                return false;
            }
            if (!result.equals(this.oldResult)) {
                this.oldResult = result;
                //System.out.println(result);
                JsonObject jsonObject = Json.parse(result).asObject();
                JsonObject queueObject = jsonObject.get("queue").asObject();
                //JsonArray queues = jsonObject.get("queue").asArray();

                for (JsonObject.Member member : queueObject) {

                    String name = member.getName();
                    Queue queue = null;
                    for (Queue queueEl : this.queues) {
                        
                        if (queueEl.getName().equals(name)) {
                            
                            if (this.queues.remove(queueEl)) {
                            }
                            break;
                        }
                    }

                    queue = new Queue(name);

                    JsonObject phones = member.getValue().asObject();
                    for (JsonObject.Member phoneMember : phones) {

                        String phoneNum = phoneMember.getName();
                        Phone phone = queue.getPhone(phoneNum);
                        if (phone.getName() != null) {
                            queue.removePhone(phone);
                        }
                        phone = new Phone(phoneNum);
                        //System.out.print(phoneNum + ": ");
                        JsonArray statuses = phoneMember.getValue().asArray();
                        for (JsonValue status : statuses) {
                            phone.addStatus(status.asString());
                            //System.out.print(status.asString() + "; ");
                        }
                        //System.out.println("");
                        queue.addPhone(phone);
                    }
                    this.queues.add(queue);
                }
            } else {
                checkIndicator(false);
                return false;
            }
            
            
        } catch (java.lang.NullPointerException e) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, e);
            checkIndicator(true);
            return false;
        } catch (UnsupportedOperationException e) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, e);
            checkIndicator(true);
            return false;
        } catch (com.eclipsesource.json.ParseException e) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, e);
            checkIndicator(true);
            return false;
        }
        return true;
        
    }

    private synchronized void renderPhones() {

        /*if (this.queuesPanels == null) {
            this.queuesPanels = new ArrayList<>();
        }*/
        GridLayout layout = new GridLayout(this.queues.size(), 1);
        //System.out.println("count queues: " + queues.size());
        //mainPanel.get
        jpPhones.setLayout(layout);
        jpPhones.removeAll();
        JPanel queuePanel = null;
        Font font = new Font("Dialog", Font.PLAIN, 12);

        for (Queue queue : this.queues) {
            boolean existPanel = false;
            if ((queuePanel = queue.getPanel()) != null) {
                //System.out.println("panel exist");
                existPanel = true;
                queuePanel.removeAll();
            } else {
                GridLayout newLayout = new GridLayout(0, 4);
                queuePanel = new JPanel(newLayout);
                Border blackline = BorderFactory.createLineBorder(Color.gray);
                //System.out.println("queue:" + queue.getName());
                Border border = BorderFactory.createTitledBorder(blackline, queue.getName());
                //Border border = BorderFactory.createLineBorder(Color.gray);
                queuePanel.setBorder(border);
            }

            for (Phone objPhone : queue.getPhones()) {
                JButton button = new JButton(objPhone.getName());
                Color color = new Color(50, 50, 50);
                if (objPhone.getStatus() == Phone.STATUS_UNKNOWN) {
                    continue;
                }
                if (objPhone.getStatus() == Phone.STATUS_READY) {
                    color = new Color(0, 204, 51);
                }
                if (objPhone.getStatus() == Phone.STATUS_BUSY) {
                    color = new Color(204, 0, 51);
                }
                button.setBackground(color);
                button.setFont(font);
                queuePanel.add(button);
            }

            queue.setPanel(queuePanel);
            if (!existPanel) {
                this.jpPhones.add(queuePanel);
            }
            //System.out.println(jpPhones.getComponents().length);
        }

        jpPhones.revalidate();
        jpPhones.invalidate();
        jpPhones.repaint();

    }

    public void rePaint() {
        if (getDataAsterisk()) {    
            renderPhones();
        }
    }

    private void initConfig() {
        try {
            File file = new File("config.ini");
            if (!file.exists()) {
                if (file.createNewFile()) {
                    //System.out.println("file created");
                }
            }
            Wini ini = new Wini(file);
            if (ini.isEmpty()) {
                ini.put("main", "url", "http://10.1.51.6:3000/monitor.php");
                ini.store();
                urlAddress = "http://10.1.51.6:3000/monitor.php";
            } else {
                urlAddress = ini.get("main", "url", String.class);
            }

            //ini.put("main",)
            //Ini ini = new Ini(new File("config.ini"));
            //java.util.prefs.Preferences prefs = new IniPreferences(ini);
            //System.out.println("grumpy/homePage: " + prefs.node("grumpy").get("homePage", null));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void checkIndicator(boolean isError) {
        Color color = jpIndicator.getBackground();
        if (isError) {
            //System.out.println("серый");
            color = Color.gray;
        } else {
            if (color == Color.red) {
                color = Color.green;
            } else {
                color = Color.red;
            }
        }

        jpIndicator.setBackground(color);
        jpIndicator.revalidate();
        jpIndicator.invalidate();
        jpIndicator.repaint();
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String[] imagePaths = {
                    "images/ico20.png",
                    "images/ico40.png",
                    "images/ico60.png",
                    "images/ico80.png",
                    "images/ico128.png",
                    "images/ico256.png"
                };
                ArrayList<BufferedImage> icons = new ArrayList<>();

                for (String imagePath : imagePaths) {
                    InputStream imgStream = MainFrame.class.getResourceAsStream(imagePath);
                    BufferedImage myImg = null;
                    try {
                        myImg = ImageIO.read(imgStream);
                    } catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    icons.add(myImg);
                }

                MainFrame mainFrame = new MainFrame();
                mainFrame.setResizable(false);
                //mainFrame.setIconImage(myImg);
                mainFrame.setIconImages(icons);
                //mainFrame.setLocationRelativeTo(null);
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
                Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
                int x = (int) rect.getMaxX() - mainFrame.getWidth();
                //int y = (int) rect.getMaxY() - mainFrame.getHeight();
                int y = 0;
                mainFrame.setLocation(x, y);
                mainFrame.setTitle("Индикатор состояния телефонов");
                mainFrame.setVisible(true);
                mainFrame.thread.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGear;
    private javax.swing.JButton jbSave;
    private javax.swing.JLabel jlUrl;
    private javax.swing.JPanel jpIndicator;
    private javax.swing.JPanel jpPhones;
    private javax.swing.JTextField jtUrl;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}

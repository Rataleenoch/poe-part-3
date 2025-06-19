/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import com.google.gson.*;
import java.util.List;
/**
 *
 * @author RC_Student_lab
 */
public class Massenger extends javax.swing.JFrame {
    private ArrayList<String> sendMessage = new ArrayList<>();
    ArrayList<String> messagePreSend = new ArrayList<>();
    ArrayList<String> messageSendLater = new ArrayList<>();
    ArrayList<MessagesJSON> messageJsonFile = new ArrayList<>();
    
    /**
     * Creates new form Massenger
     */
    public Massenger() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always

*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check Session Message List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Message Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("All Messages");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Quit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("MASSENGER MENU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addGap(0, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        msgnLoop();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        msgnPrint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        msgnTotal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        search();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
public void search(){
       String reportOption = JOptionPane.showInputDialog("""
                                                          Message Reports:
                                                          a. Display sender and receipient of all messages
                                                          b. Display the longest sent messages
                                                          c. Search for a message by ID
                                                          d. Search for a message by Hash
                                                          e. Search for a message by reciepient
                                                          f. Display full details of all sent messages
                                                          """);
                
        switch (reportOption.toLowerCase()){
            case "a": displaySenderAndRecipients();
                break;
            case "b": displayLongestMessage();
                break;
            case "c": searchMessageByID();
                break;
            case "d": searchMessageByHash();
                break;
            case "e": searchMessageByRecipient();
                break;
            case "f": displayFullMessageDetails();
                break;
            default: 
        }
    }
    public void msgnLoop(){
        String userID = JOptionPane.showInputDialog("Enter the username of the person you want to message:");
            if (userID == null || userID.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Recipient ID cannot be empty.");

                return;
    }
    
        String userTelNum;
            while (true) {
        userTelNum = JOptionPane.showInputDialog("Enter user contact phone number:");
        if (userTelNum == null || userTelNum.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone number cannot be empty.");
            return; 

        } else if (!isValidPhoneNumber(userTelNum)) {
            JOptionPane.showMessageDialog(this,"Phone number must be 10 digits long and start with country code (e.g., +27XXXXXXXXX)","Invalid Phone Number",JOptionPane.ERROR_MESSAGE);
        } else {
            break; 
        }
    }


        String messNumInput = JOptionPane.showInputDialog("Please enter the number of messages you would like to send");
        int numMessages;
        
        try {
            numMessages = Integer.parseInt(messNumInput);
            if (numMessages <= 0 || numMessages > 10) {
                JOptionPane.showMessageDialog(this, "Please enter a number between 1 and 10.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number entered.");
            return;
        }
        collectMsgn(numMessages,userTelNum,userID);
    }
    
    public boolean  isValidPhoneNumber(String phnNum){
		String saCode = "+27";
		String firstThreeChars = phnNum.substring(0, 3); // Gets characters from index 0 to 2 (inclusive)
		int fourthDigit = Character.getNumericValue(phnNum.charAt(3));//Gets and convert the fourth digit
		if(phnNum.length() <= 12 && firstThreeChars.equals(saCode) && fourthDigit >= 6 && fourthDigit <= 8){
			return true;
		}
		else{
			return false;
		}
	}
    public void collectMsgn(int count, String phone, String identifier){
        for (int i = 1; i <= count; i++) {
            String message = JOptionPane.showInputDialog("Enter message #" + i + ":");
            if (message == null) {
                JOptionPane.showMessageDialog(this, "Message entry cancelled.");
                return;
            }
            if(message.trim().isEmpty()){
                

JOptionPane.showMessageDialog(this, "Message cannot be empty.");
                i--;
                continue;
            }
            if (message.length() > 250) {
                JOptionPane.showMessageDialog(this, "Message exceeds 250 characters.");
                i--;
                continue;
            }
            

            String messageID = msgnID();
            String hash = msgnHash(messageID, i, message);
            
            int choice = msgnReview(i, message, messageID, hash);

            switch (choice) {
                case 1 -> {
                    String fullMessage = "ID: " + messageID + " | Hash: " + hash + " | Message: " + message;
                    messagePreSend.add(fullMessage);
                    sendMessage.add(fullMessage);
                }
                case 2 -> messageSendLater.add("ID: " + messageID + " | Hash: " + hash + " | Message: " + message);
                default -> JOptionPane.showMessageDialog(this, "Message #" + i + " disregarded.");
            }
        }
        JOptionPane.showMessageDialog(this, messagePreSend.size() + " message(s) ready to send.\n" + messageSendLater.size() + " saved to send later.");
        for (String fullMessage : sendMessage) {
            String[] parts = fullMessage.split(" \\| ");
            if (parts.length == 3) {
                String id = parts[0].substring(4);   
                String hash = parts[1].substring(6); 
                String content = parts[2].substring(9); 
                messageJsonFile.add(new MessagesJSON(id, hash, content, identifier));
            }
        }

        msgnJSONSave(messageJsonFile, "messages.json");
    }
    
    public String msgnID(){
        Random random = new Random();
        StringBuilder idBuilder = new StringBuilder();

        for (int i = 0; i < 10; i++) {

            idBuilder.append(random.nextInt(10));
        }

        return idBuilder.toString();
    }
    
    public String msgnHash(String messageID, int messageNumber, String messageText) {
        String[] words = messageText.trim().split("\\s+");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        String hash = messageID.substring(0, 2) + ":" + messageNumber + ":" + firstWord + lastWord;
        return hash.toUpperCase();
    }
    
    public int msgnReview(int i, String message, String messageID, String messageHash) {
        Object[] options = {"Disregard", "Send Now", "Send Later"};

        return 

JOptionPane.showOptionDialog(this, "Review Message #" + i + ":\n\n" + message + "\n\nID: " + messageID + "\nHash: " + messageHash, "Review Message", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
    }
    
    public void msgnPrint() {
        if (sendMessage.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No messages have been sent during this session.");
            return;
        }

        StringBuilder messLog = new StringBuilder("Sent Messages:\n\n");
        int count = 1;
        for (String msg : sendMessage) {
            messLog.append(count++).append(". ").append(msg).append("\n\n");
        }

        JTextArea textArea = new JTextArea(messLog.toString());

        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(500, 300));

        JOptionPane.showMessageDialog(this, scrollPane, "Messages Sent", JOptionPane.INFORMATION_MESSAGE);
        
}
    

    public int msgnTotal() {
    int total = sendMessage.size();
    String message = "Total number of messages sent: " + total;
    JOptionPane.showMessageDialog(this, message, "Message Count", JOptionPane.INFORMATION_MESSAGE);
    return total;
}
    
    public void msgnJSONSave(List<MessagesJSON> messages, String filePath) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    try {
        FileWriter writer = new FileWriter(filePath);
        gson.toJson(messages, writer);
        writer.close();
        java.io.File file = new java.io.File(filePath);
        String absolutePath = file.getAbsolutePath();
        JOptionPane.showMessageDialog(this, "Messages saved to:\n" + absolutePath);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving messages: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void displaySenderAndRecipients() {
        if (messageJsonFile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No messages to display.");
            return;
        }

        StringBuilder display = new StringBuilder("Sender and Recipient Details:\n\n");
        for (MessagesJSON msg : messageJsonFile) {
             display.append("Message ID: ").append(msg.getID()).append("\n");
             display.append("Hash: ").append(msg.getHash()).append("\n");
             display.append("Message: ").append(msg.getMess()).append("\n");
             display.append("Recipient: ").append(msg.getRecipient() != null ? msg.getRecipient() : "N/A").append("\n"); // --- NEW LINE: Display recipient ---
             display.append("---------------------\n\n"); // --- MODIFIED: Added extra newline for better spacing ---
        }

        JTextArea textArea = new JTextArea(display.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(500, 300));
        JOptionPane.showMessageDialog(this, scrollPane, "Sender and Recipient Details", JOptionPane.INFORMATION_MESSAGE);
    }
        private void displayLongestMessage() {
        if (messageJsonFile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No messages to analyze for longest message.");
            return;
        }

        MessagesJSON longestMessage = null;
        int maxLength = -1;

        for (MessagesJSON msg : messageJsonFile) {
            if (msg.getMess() != null && msg.getMess().length() > maxLength) {
                maxLength = msg.getMess().length();
                longestMessage = msg;
            }
        }

        if (longestMessage != null) {
            String message = "Longest Message:\n" +
                             "ID: " + longestMessage.getID() + "\n" +
                             "Hash: " + longestMessage.getHash() + "\n" +
                             "Content: " + longestMessage.getMess() + "\n" +
                             "Length: " + maxLength + " characters";
            JOptionPane.showMessageDialog(this, message, "Longest Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Could not determine the longest message.");
        }
    }
            public void searchMessageByID() {
        if (messageJsonFile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No messages to search.");
            return;
        }

        StringBuilder idListDisplay = new StringBuilder("Available Message IDs:\n");
        for (MessagesJSON m : messageJsonFile) {
            idListDisplay.append("- ").append(m.getID()).append("\n");
        }
        JOptionPane.showMessageDialog(null, idListDisplay.toString(), "Available IDs", JOptionPane.INFORMATION_MESSAGE);
        
        String searchID = JOptionPane.showInputDialog("Enter the Message ID to search for:");
        if (searchID == null || searchID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Message ID cannot be empty.");
            return;
        }

        StringBuilder result = new StringBuilder();
        boolean found = false;
        
        for (MessagesJSON msg : messageJsonFile) {
            if (msg.getID().equalsIgnoreCase(searchID.trim())) {
                result.append("Message Found:\n")
                      .append("ID: ").append(msg.getID()).append("\n")
                      .append("Hash: ").append(msg.getHash()).append("\n")
                      .append("Message: ").append(msg.getMess()).append("\n")
                      .append("---------------------\n");
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "No message found with the given ID: " + searchID + ".");
        } else {
            JTextArea textArea = new JTextArea(result.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(400, 200));
            JOptionPane.showMessageDialog(this, scrollPane, "Search Result by ID", JOptionPane.INFORMATION_MESSAGE);
        }
    }
            private void searchMessageByHash() {
        if (messageJsonFile.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No messages to search.");
        return;
    }

    StringBuilder hashList = new StringBuilder("Available Hashes:\n");
    for (MessagesJSON m : messageJsonFile) {
        hashList.append("- ").append(m.hash).append("\n");
    }
    JOptionPane.showMessageDialog(null, hashList.toString());
    
    String hash = JOptionPane.showInputDialog("Enter the hash to search for:");
    if (hash == null || hash.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Hash cannot be empty.");
        return;
    }

    StringBuilder result = new StringBuilder();
    for (MessagesJSON msg : messageJsonFile) {
        if (msg.getHash().equalsIgnoreCase(hash.trim())) {
            result.append("ID: ").append(msg.getID())
                  .append("\nHash: ").append(msg.getHash())
                  .append("\nMessage: ").append(msg.getMess())
                  .append("\n---------------------\n");
        }
    }

    if (result.length() == 0) {
        JOptionPane.showMessageDialog(this, "No message found with the given hash.");
    } else {
        JTextArea textArea = new JTextArea(result.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200));
        JOptionPane.showMessageDialog(this, scrollPane, "Search Result", JOptionPane.INFORMATION_MESSAGE);
    }
    }
            private void searchMessageByRecipient() {
        if (messageJsonFile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No messages to search.");
            return;
        }

        Set<String> uniqueRecipients = new HashSet<>();
        for (MessagesJSON msg : messageJsonFile) {
            if (msg.getRecipient() != null && !msg.getRecipient().trim().isEmpty()) {
                uniqueRecipients.add(msg.getRecipient());
            }
        }

        if (uniqueRecipients.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No recipient information available in messages.");
            return;
        }

        StringBuilder recipientListDisplay = new StringBuilder("Available Recipients:\n");
        for (String rec : uniqueRecipients) {
            recipientListDisplay.append("- ").append(rec).append("\n");
        }
        JOptionPane.showMessageDialog(null, recipientListDisplay.toString(), "Available Recipients", JOptionPane.INFORMATION_MESSAGE);

        String searchRecipient = JOptionPane.showInputDialog("Enter the recipient to search for:");
        if (searchRecipient == null || searchRecipient.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Recipient cannot be empty.");
            return;
        }

        StringBuilder result = new StringBuilder();
        boolean found = false;
        for (MessagesJSON msg : messageJsonFile) {
            if (msg.getRecipient() != null && msg.getRecipient().equalsIgnoreCase(searchRecipient.trim())) {
                result.append("Message Found for Recipient: ").append(msg.getRecipient()).append("\n")
                      .append("ID: ").append(msg.getID()).append("\n")
                      .append("Hash: ").append(msg.getHash()).append("\n")
                      .append("Message: ").append(msg.getMess()).append("\n")
                      .append("---------------------\n");
                found = true;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "No messages found for the given recipient: " + searchRecipient + ".");
        } else {
            JTextArea textArea = new JTextArea(result.toString());
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(400, 200));
            JOptionPane.showMessageDialog(this, scrollPane, "Search Result by Recipient", JOptionPane.INFORMATION_MESSAGE);
        }
    }
            private void displayFullMessageDetails() {if (messageJsonFile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No messages to display details for.");
            return;
        }

        StringBuilder allDetails = new StringBuilder("Full Details of All Sent Messages:\n\n");
        for (MessagesJSON msg : messageJsonFile) {
            allDetails.append("ID: ").append(msg.getID()).append("\n");
            allDetails.append("Hash: ").append(msg.getHash()).append("\n");
            allDetails.append("Message: ").append(msg.getMess()).append("\n");
            allDetails.append("---------------------\n\n");
        }

        JTextArea textArea = new JTextArea(allDetails.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(500, 400));
        JOptionPane.showMessageDialog(this, scrollPane, "All Message Details", JOptionPane.INFORMATION_MESSAGE);
    }
    
    class MessagesJSON {
        private String id;
        private String hash;
        private String content;
        private String recipient;


        public MessagesJSON(String id, String hash, String content, String recipient) {
            this.id = id;
            this.hash = hash;
            this.content = content;
            this.recipient = recipient;
            
            
        }
        
        public String getHash(){
            return hash;
        }
        
        public String getID(){
            return id;
        }
        
        public String getMess(){
            return content;
        }
        
        public String getRecipient(){
            return recipient;
        }
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
            java.util.logging.Logger.getLogger(Massenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Massenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Massenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Massenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Massenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainFrame extends JFrame implements ActionListener{

   JFrame mainFrame;
   JPanel northPanel,midPanel, southPanel;
   JLabel chatLabel;
   JTextArea midTextArea;
   GridBagConstraints gbc;
   JButton sendButton;
   JTextField chatTextField;



    public MainFrame(){

    mainFrame = new JFrame("Chat Application");
    mainFrame.setLayout(new GridLayout(3, 0));

    //northPanel
    northPanel = new JPanel();
    chatLabel = new JLabel("My Chat Application");
    
    northPanel.add(chatLabel);
    mainFrame.add(northPanel, BorderLayout.NORTH );
    

    //midPanel
    midPanel = new JPanel(new GridBagLayout());
    midPanel.setSize(300, 300);
    gbc = new GridBagConstraints();
    gbc.gridwidth = GridBagConstraints.REMAINDER;
    midTextArea = new JTextArea();
    JScrollPane sc  = new JScrollPane(midTextArea);


    midPanel.setSize(320, 350);
    midPanel.add(sc);
    mainFrame.add(midPanel, BorderLayout.CENTER);




    //southPanel
    southPanel = new JPanel(new GridLayout(0, 2));
    southPanel.setSize(300, 150);
    sendButton  = new JButton("send");
    chatTextField  = new JTextField();

    sendButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           if(midTextArea.getText().isEmpty()){
               midTextArea.setText(chatTextField.getText());;
           }else{
                

             for(int i = 0 ; i < 5 ; i++){
                
                 midTextArea.append( i + " pending \n");

                try {
                 Thread.sleep(1000);   
                } catch (Exception error) {

                }


             }

        
           }
           chatTextField.setText("");
        }
     });
    

    southPanel.add(chatTextField);
    southPanel.add(sendButton);
    mainFrame.add(southPanel, BorderLayout.SOUTH);

    

 
    mainFrame.setVisible(true);
    mainFrame.setSize(350, 500);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args){
        new MainFrame();    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
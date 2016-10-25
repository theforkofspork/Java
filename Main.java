
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Main
{
    public static void main(String[] args){
        JFrame frame = new JFrame("Window");
        JLabel EnterNumberOfTeams = new JLabel("Enter number of teams: ");
        JButton Enter = new JButton("Enter");
        JSpinner spin = new JSpinner();
        SpinnerNumberModel model = new SpinnerNumberModel(24,4,1028,1);
        JPanel Panel = new JPanel();
        spin.setModel(model);
        spin.setPreferredSize(new Dimension(55,30));
        Enter.setPreferredSize(new Dimension(60,30));
        Panel.setPreferredSize(new Dimension(100,100));
        Panel.add(EnterNumberOfTeams);
        Panel.add(spin);
        Panel.add(Enter);
        Panel.setBackground(Color.lightGray);
        Panel.setSize(100,100);
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(Panel);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Enter.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
           int NumberOfTeams = (int)spin.getValue();
           long Insp1 = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long Insp2 = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long Insp3 = Math.round(Math.random()*(NumberOfTeams-1)+1);
           while(Insp1 == Insp2 || Insp2 == Insp3 || Insp3 == Insp1){
              Insp1 = Math.round(Math.random()*(NumberOfTeams-1)+1);
              Insp2 = Math.round(Math.random()*(NumberOfTeams-1)+1);
              Insp3 = Math.round(Math.random()*(NumberOfTeams-1)+1);
           }
           long Connect = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long Think = Math.round(Math.random()*(NumberOfTeams-1)+1);
           while(Connect == Think){
               Connect = Math.round(Math.random()*(NumberOfTeams-1)+1);
               Think = Math.round(Math.random()*(NumberOfTeams-1)+1);
           }
           long RCIA = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long PTC = Math.round(Math.random()*(NumberOfTeams-1)+1);
           while(RCIA == PTC){
               RCIA = Math.round(Math.random()*(NumberOfTeams-1)+1);
               PTC = Math.round(Math.random()*(NumberOfTeams-1)+1);
           }
           long Control = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long WAC = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long WAPO = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long WAPT = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long FAC = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long FAPO = Math.round(Math.random()*(NumberOfTeams-1)+1);
           long FAPT = Math.round(Math.random()*(NumberOfTeams-1)+1);
           while(((WAC | WAPO | (WAPT)) == (FAC | FAPO | FAPT)) || ((FAC == FAPO) ||
                   (FAPO == FAPT) || (FAPT == FAC)) || ((WAC == WAPO) || (WAPO == WAPT) ||
                   (WAPT == WAC))){
              WAC = Math.round(Math.random()*(NumberOfTeams-1)+1);
              WAPO = Math.round(Math.random()*(NumberOfTeams-1)+1);
              WAPT = Math.round(Math.random()*(NumberOfTeams-1)+1);
              FAC = Math.round(Math.random()*(NumberOfTeams-1)+1);
              FAPO = Math.round(Math.random()*(NumberOfTeams-1)+1);
              FAPT = Math.round(Math.random()*(NumberOfTeams-1)+1);
           }
           JTextArea Winners = new JTextArea("Team " + String.valueOf(Insp1) + " wins the Inspire Award!\n\n"
           + "Team " + String.valueOf(Insp2) + " wins the second place Inspire Award!\n\n" + "Team "
           + String.valueOf(Insp3) + " wins the third place Inspire Award!\n\n" + "Team " 
           + String.valueOf(Connect) + " wins the Connect Award!\n\n" + "Team " 
           + String.valueOf(Think) + " wins the Think Award!\n\n" + "Team " 
           + String.valueOf(RCIA) + " wins the Rockwell Collins Innovate Award!\n\n" + "Team " 
           + String.valueOf(PTC) + " wins the PTC Design Award!\n\n" + "Team " 
           + String.valueOf(Control) + " wins the Control Award!\n\n" + "Team " 
           + String.valueOf(WAC) + " is the Winning Alliance Captain!\n\n" + "Team " 
           + String.valueOf(WAPO) + " is the Winning Alliance first pick!\n\n" + "Team " 
           + String.valueOf(WAPT) + " is the Winning Alliance second pick!\n\n" + "Team " 
           + String.valueOf(FAC) + " is the Finalist Alliance Captain!\n\n" + "Team " 
           + String.valueOf(FAPO) + " is the Finalist Alliance first pick!\n\n" + "Team " 
           + String.valueOf(FAPT) + " is the Finalist Alliance second pick!\n\nWriting to file will create a file with this information,    appearing in the same place as where you opened this program, overwriting an existing file with the same      name and will close this window");
           JButton WriteToFile = new JButton("Write to file");
           Winners.setPreferredSize(new Dimension(350,550));
           Winners.setLineWrap(true);
           Winners.setBackground(Color.lightGray);
           WriteToFile.setPreferredSize(new Dimension(100,30));
           Panel.add(Winners);
           Panel.add(WriteToFile);
           Panel.setSize(100,100);
           spin.setVisible(false);
           Enter.setVisible(false);
           EnterNumberOfTeams.setVisible(false);
           frame.add(Panel);
           SwingUtilities.updateComponentTreeUI(frame);
           WriteToFile.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
             WriteFile(Winners); 
             frame.setVisible(false);
             System.exit(0);
           }
           });
        }
       });
    }
    private static void WriteFile(JTextArea TextArea){
        try{
            File file = new File ("FTC Tournament Random Winners.txt");
            file.setLocation("/Users/Sam/Desktop/");
            PrintWriter printWriter = new PrintWriter ("FTC Tournament Random Winners.txt");
            printWriter.println(TextArea.getText());
            printWriter.close();
        }
        catch(IOException ex){
        }
    }
    private static void Sleep(long milli){
        try {
            Thread.sleep(milli);
        }
        catch(InterruptedException ex)
        {

        }
    }
}

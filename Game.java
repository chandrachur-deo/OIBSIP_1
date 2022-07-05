import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.accessibility.Accessible;
class Game implements ActionListener {

    TextField t;
    Button b;

    public Game() {
        Frame f=new Frame();
        b=new Button("Submit");
        b.setBounds(180,250,120,30);
        b.addActionListener(this);
        Label l=new Label("Welcome to the Game");
        l.setBounds(105,20,400,100);
        l.setFont(new Font("Book Antiqua",Font.BOLD,30));
        Label l1=new Label("Enter The Number");
        l1.setBounds(140,120,400,100);
        l1.setFont(new Font("Book Antiqua",Font.BOLD,22));
        t=new TextField(20);
        t.setBounds(160,210,165,30);
        f.add(t);
        f.add(l);
        f.add(l1);
        f.add(b);
        f.setSize(500,500);
        f.setTitle("Number Guessing Game");
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing (WindowEvent windowEvent)
            {
                System.exit(0);
            }});
    }

public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==b) {
        String s=t.getText();
        int min=1;
        int max=9;
        int a=(int)(Math.random()*(9-1+1)+1);
        int b=Integer.parseInt(s);
        if(b==a) {
            System.out.println("Congratulations !! You got it Right");
        }

        else if(b<a) {
            System.out.println("Sorry! Your Guess is Higher than the Number");
        }

        else if(b>a) {
            System.out.println("Sorry! Your Guess is Lower than the Number");
        }
        
    }
}

    public static void main(String[] args) {
        Game obj=new Game();
    }

}
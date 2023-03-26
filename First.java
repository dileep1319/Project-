import javax.swing.*;
 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First implements ActionListener {
    JFrame fr = new JFrame();
    JButton buy_a_car,close;
    JLabel heading1,bgLabel;
    Container c= fr.getContentPane();
    First(){
        fr.setSize(700, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon back = new ImageIcon("car.jpg");
        bgLabel=new JLabel(back);
        buy_a_car = new JButton("Buy a Car");
        close = new JButton("EXIT");
        buy_a_car.setBackground(Color.YELLOW);
        close.setBackground(Color.YELLOW);
        heading1 = new JLabel("Welcome To Auto-Smart Car ShowRoom");
        heading1.setSize(new Dimension(750,100));
        buy_a_car.setBounds(200,150,100,50);
        close.setBounds(200,300,100,50);
        Font f= new Font("Lucida Calligraphy",Font.BOLD,30);
        heading1.setFont(f);
        c.add(bgLabel);
        c.setLayout(null);
        c.add(heading1);
        c.add(sell_a_car);
        c.add(buy_a_car);
        c.add(close);
        buy_a_car.addActionListener(this);
        close.addActionListener(this);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buy_a_car){
            new Buy();
        }
        else if(e.getSource()==close){
            System.exit(0);
        }
    }
    public static void main(String[] args) {

        new First();
    }
}
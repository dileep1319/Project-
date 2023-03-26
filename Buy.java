import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buy extends JFrame implements ActionListener {
JFrame f = new JFrame("Display");
JButton ent = new JButton("Show");
	Container c = f.getContentPane();
	JFrame fra = new JFrame();
	JButton b1, b2, b3, b4, b5;
	Font d,d1;
Buy(){
	ent.setBackground(Color.YELLOW);
	ent.setBounds(200,160,100,50);
	JLabel lb = new JLabel("Show Available Car Models");
	lb.setSize(new Dimension(500,100));
	 Font g= new Font("Lucida Calligraphy",Font.BOLD,30);
        lb.setFont(g);
	c.add(lb);
	
	c.add(ent);
	f.setSize(500, 500);
	c.setLayout(null);
	ent.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f.setVisible(true);
}
    public void actionPerformed(ActionEvent e) {
	 if(e.getSource()== ent){

	b1 = new JButton("1");
	b1.setBounds(100,400,50,50);
		 b1.setBackground(Color.YELLOW);
	b2 = new JButton("2");
	b2.setBounds(160,400,50,50);
		 b2.setBackground(Color.YELLOW);
	b3 = new JButton("3");
	b3.setBounds(220,400,50,50);
		 b3.setBackground(Color.YELLOW);
	b4 = new JButton("4");
	b4.setBounds(280,400,50,50);
		 b4.setBackground(Color.YELLOW);
	b5 = new JButton("5");
	b5.setBounds(340,400,50,50);
		 b5.setBackground(Color.YELLOW);
	Container cr = fra.getContentPane();
	fra.setSize(700,800);
	cr.setLayout(null);
            JLabel m = new JLabel("Available Car Models are:");
	m.setSize(new Dimension(530,200));
	 d= new Font("Lucida Calligraphy",Font.BOLD,30);
        m.setFont(d);
	    JLabel m1 = new JLabel("1.Toyota Corolla");
		m1.setBounds(50,100,200,150);
	 Font d1= new Font("Arial",Font.ITALIC,20);
        m1.setFont(d1);
	    JLabel m2 = new JLabel("2. Ford Mustang");
	m2.setBounds(50,120,200,150);
	 m2.setFont(d1);
	    JLabel m3 = new JLabel("3.GTR");
	m3.setBounds(50,140,100,150);
	 m3.setFont(d1);
	    JLabel m4 = new JLabel("4. Ferrari ");
	m4.setBounds(50,160,200,150);
	 m4.setFont(d1);
	   JLabel m5 = new JLabel("5.Honda Civic ");
	m5.setBounds(50,180,200,150);
	 m5.setFont(d1);
	cr.add(m);
	cr.add(m1);
	cr.add(m2);
	cr.add(m3);
	cr.add(m4);
	cr.add(m5);
	cr.add(b1);
	cr.add(b2);
	cr.add(b3);
	cr.add(b4);
	cr.add(b5);
		c.setLayout(null);
	  fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  fra.setVisible(true);
        }
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame("Model Information");
				JButton be = new JButton("Back");
				JButton buy = new JButton("Buy");
				be.setBackground(Color.YELLOW);
				buy.setBackground(Color.YELLOW);
				be.setBounds(300, 550, 100, 50);
				buy.setBounds(100, 550, 100, 50);
				Container c1 = f1.getContentPane();
				f1.setSize(800, 800);
				JLabel l1 = new JLabel("1.Toyota Corolla");
				l1.setSize(new Dimension(500, 100));
				l1.setFont(d);
				JLabel p1 = new JLabel("Price = 39.1 - 49.0 lacs");
				p1.setBounds(50,100,400,150);
				Font d1= new Font("Arial",Font.ITALIC,30);
				p1.setFont(d1);
				JLabel t1 = new JLabel("ARAI Mileage  -  13.4 kmp");
				t1.setBounds(50,140,400,150);
				t1.setFont(d1);
				JLabel t2 = new JLabel("Engine Displacement (cc)  -  1794");
				t2.setBounds(50,180,700,150);
				t2.setFont(d1);
				JLabel t3 = new JLabel("Seating Capacity - 5");
				t3.setBounds(50,220,400,150);
				t3.setFont(d1);
				c1.setLayout(null);
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c1.add(l1);
				c1.add(be);
				c1.add(p1);
				c1.add(t1);
				c1.add(t2);
				c1.add(t3);
				c1.add(buy);
				f1.setVisible(true);
				buy.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame f1c = new JFrame();
						f1c.setSize(600,600);
						JLabel l1c = new JLabel("Enter your Name");
						l1c.setBounds(50 , 50,500,100);
						Font g= new Font("Arial",Font.BOLD,30);
						l1c.setFont(g);
						JTextField tf = new JTextField();
						tf.setBounds(100,130 ,200,50);
						JLabel l1c1 = new JLabel("Enter your Number");
						l1c1.setBounds(50 , 200,500,100);
						l1c1.setFont(g);
						JTextField tf1 = new JTextField();
						tf1.setBounds(100,270 ,200,50);
						JButton b1c = new JButton("Buy");
						b1c.setBackground(Color.YELLOW);
						b1c.setBounds(150,400,100,50);
						Container c1s = f1c.getContentPane();
						c1s.setLayout(null);
						c1s.add(tf);
						c1s.add(b1c);
						c1s.add(l1c);
						c1s.add(l1c1);
						c1s.add(tf1);
						b1c.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JOptionPane.showMessageDialog(null,"Thank you ");
							}
						});
						f1c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						f1c.setVisible(true);
					}
				});
				be.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						f1.setVisible(false);
					}
				});
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame();
				JButton be = new JButton("Back");
				JButton buy = new JButton("Buy");
				be.setBackground(Color.YELLOW);
				buy.setBackground(Color.YELLOW);
				be.setBounds(300, 550, 100, 50);
				buy.setBounds(100, 550, 100, 50);
				Container c1 = f1.getContentPane();
				f1.setSize(800, 800);
				JLabel l1 = new JLabel("2. Ford Mustang");
				l1.setSize(new Dimension(500, 100));
				l1.setFont(d);
				JLabel p1 = new JLabel("Price = 40 - 50.0 lacs");
				p1.setBounds(50,100,400,150);
				Font d1= new Font("Arial",Font.ITALIC,30);
				p1.setFont(d1);
				JLabel t1 = new JLabel("ARAI Mileage  -  16.4 kmp");
				t1.setBounds(50,140,400,150);
				t1.setFont(d1);
				JLabel t2 = new JLabel("Engine Displacement (cc)  -  1795");
				t2.setBounds(50,180,700,150);
				t2.setFont(d1);
				JLabel t3 = new JLabel("Seating Capacity - 4");
				t3.setBounds(50,220,400,150);
				t3.setFont(d1);
				c1.setLayout(null);
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c1.add(l1);
				c1.add(be);
				c1.add(p1);
				c1.add(t1);
				c1.add(t2);
				c1.add(t3);
				c1.add(buy);
				f1.setVisible(true);
				buy.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame f1c = new JFrame();
						f1c.setSize(600,600);
						JLabel l1c = new JLabel("Enter your Name");
						l1c.setBounds(50 , 50,500,100);
						Font g= new Font("Arial",Font.BOLD,30);
						l1c.setFont(g);
						JTextField tf = new JTextField();
						tf.setBounds(100,130 ,200,50);
						JLabel l1c1 = new JLabel("Enter your Number");
						l1c1.setBounds(50 , 200,500,100);
						l1c1.setFont(g);
						JTextField tf1 = new JTextField();
						tf1.setBounds(100,270 ,200,50);
						JButton b1c = new JButton("Buy");
						b1c.setBackground(Color.YELLOW);
						b1c.setBounds(150,400,100,50);
						Container c1s = f1c.getContentPane();
						c1s.setLayout(null);
						c1s.add(tf);
						c1s.add(b1c);
						c1s.add(l1c);
						c1s.add(l1c1);
						c1s.add(tf1);
						b1c.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JOptionPane.showMessageDialog(null,"Thank you ");
							}
						});
						f1c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						f1c.setVisible(true);
					}
				});
				be.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						f1.setVisible(false);
					}
				});
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame();
				JButton be = new JButton("Back");
				JButton buy = new JButton("Buy");
				be.setBackground(Color.YELLOW);
				buy.setBackground(Color.YELLOW);
				be.setBounds(300, 550, 100, 50);
				buy.setBounds(100, 550, 100, 50);
				Container c1 = f1.getContentPane();
				f1.setSize(800, 800);
				JLabel l1 = new JLabel("3. GTR");
				l1.setSize(new Dimension(500, 100));
				l1.setFont(d);
				JLabel p1 = new JLabel("Price = 60 - 70.0 lacs");
				p1.setBounds(50,100,400,150);
				Font d1= new Font("Arial",Font.ITALIC,30);
				p1.setFont(d1);
				JLabel t1 = new JLabel("ARAI Mileage  -  18 kmp");
				t1.setBounds(50,140,400,150);
				t1.setFont(d1);
				JLabel t2 = new JLabel("Engine Displacement (cc)  -  1795");
				t2.setBounds(50,180,700,150);
				t2.setFont(d1);
				JLabel t3 = new JLabel("Seating Capacity - 4");
				t3.setBounds(50,220,400,150);
				t3.setFont(d1);
				c1.setLayout(null);
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c1.add(l1);
				c1.add(be);
				c1.add(p1);
				c1.add(t1);
				c1.add(t2);
				c1.add(t3);
				c1.add(buy);
				f1.setVisible(true);
				buy.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame f1c = new JFrame();
						f1c.setSize(600,600);
						JLabel l1c = new JLabel("Enter your Name");
						l1c.setBounds(50 , 50,500,100);
						Font g= new Font("Arial",Font.BOLD,30);
						l1c.setFont(g);
						JTextField tf = new JTextField();
						tf.setBounds(100,130 ,200,50);
						JLabel l1c1 = new JLabel("Enter your Number");
						l1c1.setBounds(50 , 200,500,100);
						l1c1.setFont(g);
						JTextField tf1 = new JTextField();
						tf1.setBounds(100,270 ,200,50);
						JButton b1c = new JButton("Buy");
						b1c.setBackground(Color.YELLOW);
						b1c.setBounds(150,400,100,50);
						Container c1s = f1c.getContentPane();
						c1s.setLayout(null);
						c1s.add(tf);
						c1s.add(b1c);
						c1s.add(l1c);
						c1s.add(l1c1);
						c1s.add(tf1);
						b1c.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JOptionPane.showMessageDialog(null,"Thank you ");
							}
						});
						f1c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						f1c.setVisible(true);
					}
				});
				be.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						f1.setVisible(false);
					}
				});
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame();
				JButton be = new JButton("Back");
				JButton buy = new JButton("Buy");
				be.setBackground(Color.YELLOW);
				buy.setBackground(Color.YELLOW);
				be.setBounds(300, 550, 100, 50);
				buy.setBounds(100, 550, 100, 50);
				Container c1 = f1.getContentPane();
				f1.setSize(800, 800);
				JLabel l1 = new JLabel("4. Ferrari");
				l1.setSize(new Dimension(500, 100));
				l1.setFont(d);
				JLabel p1 = new JLabel("Price = 80 - 99.0 lacs");
				p1.setBounds(50,100,400,150);
				Font d1= new Font("Arial",Font.ITALIC,30);
				p1.setFont(d1);
				JLabel t1 = new JLabel("ARAI Mileage  -  20 kmp");
				t1.setBounds(50,140,400,150);
				t1.setFont(d1);
				JLabel t2 = new JLabel("Engine Displacement (cc)  -  1795");
				t2.setBounds(50,180,700,150);
				t2.setFont(d1);
				JLabel t3 = new JLabel("Seating Capacity - 2");
				t3.setBounds(50,220,400,150);
				t3.setFont(d1);
				c1.setLayout(null);
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c1.add(l1);
				c1.add(be);
				c1.add(p1);
				c1.add(t1);
				c1.add(t2);
				c1.add(t3);
				c1.add(buy);
				f1.setVisible(true);
				buy.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame f1c = new JFrame();
						f1c.setSize(600,600);
						JLabel l1c = new JLabel("Enter your Name");
						l1c.setBounds(50 , 50,500,100);
						Font g= new Font("Arial",Font.BOLD,30);
						l1c.setFont(g);
						JTextField tf = new JTextField();
						tf.setBounds(100,130 ,200,50);
						JLabel l1c1 = new JLabel("Enter your Number");
						l1c1.setBounds(50 , 200,500,100);
						l1c1.setFont(g);
						JTextField tf1 = new JTextField();
						tf1.setBounds(100,270 ,200,50);
						JButton b1c = new JButton("Buy");
						b1c.setBackground(Color.YELLOW);
						b1c.setBounds(150,400,100,50);
						Container c1s = f1c.getContentPane();
						c1s.setLayout(null);
						c1s.add(tf);
						c1s.add(b1c);
						c1s.add(l1c);
						c1s.add(l1c1);
						c1s.add(tf1);
						b1c.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JOptionPane.showMessageDialog(null,"Thank you ");
							}
						});
						f1c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						f1c.setVisible(true);
					}
				});
				be.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						f1.setVisible(false);
					}
				});
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f1 = new JFrame();
				JButton be = new JButton("Back");
				JButton buy = new JButton("Buy");
				be.setBackground(Color.YELLOW);
				buy.setBackground(Color.YELLOW);
				be.setBounds(300, 550, 100, 50);
				buy.setBounds(100, 550, 100, 50);
				Container c1 = f1.getContentPane();
				f1.setSize(800, 800);
				JLabel l1 = new JLabel("5. Honda Civic");
				l1.setSize(new Dimension(500, 100));
				l1.setFont(d);
				JLabel p1 = new JLabel("Price = 65 - 85.0 lacs");
				p1.setBounds(50,100,400,150);
				Font d1= new Font("Arial",Font.ITALIC,30);
				p1.setFont(d1);
				JLabel t1 = new JLabel("ARAI Mileage  -  20 kmp");
				t1.setBounds(50,140,400,150);
				t1.setFont(d1);
				JLabel t2 = new JLabel("Engine Displacement (cc)  -  1795");
				t2.setBounds(50,180,700,150);
				t2.setFont(d1);
				JLabel t3 = new JLabel("Seating Capacity - 5");
				t3.setBounds(50,220,400,150);
				t3.setFont(d1);
				c1.setLayout(null);
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				c1.add(l1);
				c1.add(be);
				c1.add(p1);
				c1.add(t1);
				c1.add(t2);
				c1.add(t3);
				c1.add(buy);
				f1.setVisible(true);
				buy.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame f1c = new JFrame();
						f1c.setSize(600,600);
						JLabel l1c = new JLabel("Enter your Name");
						l1c.setBounds(50 , 50,500,100);
						Font g= new Font("Arial",Font.BOLD,30);
						l1c.setFont(g);
						JTextField tf = new JTextField();
						tf.setBounds(100,130 ,200,50);
						JLabel l1c1 = new JLabel("Enter your Number");
						l1c1.setBounds(50 , 200,500,100);
						l1c1.setFont(g);
						JTextField tf1 = new JTextField();
						tf1.setBounds(100,270 ,200,50);
						JButton b1c = new JButton("Buy");
						b1c.setBackground(Color.YELLOW);
						b1c.setBounds(150,400,100,50);
						Container c1s = f1c.getContentPane();
						c1s.setLayout(null);
						c1s.add(tf);
						c1s.add(b1c);
						c1s.add(l1c);
						c1s.add(l1c1);
						c1s.add(tf1);
						b1c.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JOptionPane.showMessageDialog(null,"Thank you ");
							}
						});
						f1c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						f1c.setVisible(true);
					}
				});
				be.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						f1.setVisible(false);
					}
				});
			}
		});
    }
}

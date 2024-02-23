import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 class Vari
{
        public String nm[]={"K Amit","Sumit","MadhuBala"};
        public static int kl=9;
        public static int km=9;
        public  static int c[]={12181,12182,12183};
        public static String s[]={"765","970","674"};
        public static double amnt[]={10000.00,1500.74,89000.00};
}
/* first page */
class login extends Vari implements ActionListener 
{
    int h=0;
    JFrame frame=new JFrame("Banking");
    JPanel p=new JPanel();
    JLabel l1=new JLabel("User ID");
    JLabel l2=new JLabel("Password");
    JLabel l3=new JLabel(" ");
    JTextField t1=new JTextField(12);
    JTextField t2=new JTextField(20);
    JButton b=new JButton("Login");
    JProgressBar pb=new JProgressBar(0,20);
    Timer tm=new Timer(300,this);
    public login()
    {
        frame.setVisible(true);
        frame.setLayout(null);
        p.setLayout(null);
        p.setSize(380,380);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBackground(Color.lightGray);
        l1.setHorizontalAlignment(JLabel.LEFT);
        l2.setHorizontalAlignment(JLabel.LEFT);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2.setHorizontalAlignment(JTextField.CENTER);
        b.setHorizontalAlignment(JButton.CENTER);
        frame.add(p);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(pb);
        p.add(b);
        p.add(l3);
        l1.setBounds(100,30,100,30);
        t1.setBounds(210,30,100,30);
        l2.setBounds(100,70,100,30);
        t2.setBounds(210,70,100,30);
        l3.setBounds(100,250,300,30);
        b.setBounds(140,140,100,30);
        pb.setBounds(110,120,150,15);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ec)
            {
                for(int i=0;i<3;i++)
                {
                    if(t1.getText().equals( Integer.toString(c[i]) ) && t2.getText().equals(s[i]))
                    {
                        l3.setText(" ");
                        kl=i;
                        tm.start();
                    }
                }
                if(kl==9)
                {
                    l3.setText("User ID or Password is incorrect");
                }
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        
            if(h==20)
            {
                frame.dispose();
                new Firstpage();
            }
            h++;
            pb.setValue(h);
    }
}
/*first class ends */
/*Second class Starts */
 class Firstpage extends Vari implements ActionListener
{
	JFrame f1=new JFrame("Select");
	JLabel l1;
	JButton b1,b2,b3,b4,b5;
	Firstpage() 
	{
		l1=new JLabel(" Click on one button to perform action ");
		b1=new JButton("Account details ");
		b2=new JButton("Cash Withdrawal");
		b3=new JButton("Cash Deposit");
		b4=new JButton("Account to Account transfer");
		b5=new JButton("LOG OUT");
		f1.setSize(700,700);
		f1.setVisible(true);
		f1.setLayout(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.add(l1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		l1.setBounds(230,30,300,30);
		b1.setBounds(15,180,300,30);
		b2.setBounds(370,180,300,30);
		b3.setBounds(15,300,300,30);
		b4.setBounds(370,300,300,30);
		b5.setBounds(200,500,300,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e1)
	{
		if(e1.getSource()==b1)
		{
			f1.dispose();
			Secondpage sp1=new Secondpage();
		}
		if(e1.getSource()==b2)
		{
			f1.dispose();
			Fifthpage ff1=new Fifthpage();
		}
		if(e1.getSource()==b3)
		{
			f1.dispose();
			Thirdframe tf1=new Thirdframe();
		}
		if(e1.getSource()==b4)
		{
			f1.dispose();
			Fourthpage fp1 = new Fourthpage();
		}
		if(e1.getSource()==b5)
		{
            kl=9;
			f1.dispose();
			new login();
		}
	}
	public static void main(String[] args)
	{
		new Firstpage();
	}
}

/* Secondpage Ends */
/*Third page Starts */

 class Secondpage extends Vari implements ActionListener 
{
    JFrame f2=new JFrame("Account Details");
    JLabel ll1,ll2,ll3,ll4,ll5,ll6,ll7;
    JButton bb1;
    Secondpage()
    {
        ll1=new JLabel("User Name : ");
        ll2=new JLabel("Account Number : ");
        ll3=new JLabel("Account Balance : Rs");
        ll4=new JLabel("XY BANK");
        ll5=new JLabel(" ");
        ll6=new JLabel(" ");
        ll7=new JLabel(" ");
        bb1=new JButton("BACK");
        f2.setSize(500,500);
        f2.setVisible(true);
        f2.setLayout(null);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.add(ll1);
        f2.add(ll2);
        f2.add(ll3);
        f2.add(ll4);
        f2.add(ll4);
        f2.add(ll5);
        f2.add(ll6);
        f2.add(ll7);
        f2.add(bb1);
        String sa=Integer.toString(c[kl]);
        String s1a=Double.toString(amnt[kl]);
        ll5.setText(nm[kl]);
        ll6.setText(sa);
        ll7.setText(s1a+"   only");
        ll1.setBounds(20,30,100,30);
        ll2.setBounds(20,90,200,30);
        ll3.setBounds(20,150,200,30);
        ll4.setBounds(220,0,100,30);
        ll5.setBounds(100,30,100,30);
        ll6.setBounds(150,90,100,30);
        ll7.setBounds(150,150,100,30);
        bb1.setBounds(220,300,100,30);
        bb1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e2)
    {
        f2.dispose();
        new Firstpage();
    }
}
/*third frame ends */
/*Fourth frame Starts */
 class Thirdframe extends Vari implements ActionListener 
{
    JFrame f4=new JFrame("Cash Deposit");
    JLabel lll1,lll2;
    JTextField ttt1,ttt2;
    JButton bbb1,bbb2,bbb3;
    Thirdframe()
    {
        lll1=new JLabel("Enter Amount");
        lll2=new JLabel(" ");
        ttt1=new JTextField(20);
        bbb1=new JButton("Deposit ");
        bbb2=new JButton("Back");
        bbb3=new JButton("Exit");
        f4.setSize(700,700);
        f4.setVisible(true);
        f4.setLayout(null);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.add(lll1);
        f4.add(ttt1);
        f4.add(bbb1);
        f4.add(bbb2);
        f4.add(bbb3);
        f4.add(lll2);
        lll1.setBounds(165,30,300,30);
        ttt1.setBounds(300,30,300,30);
        bbb1.setBounds(240,180,300,30);
        bbb2.setBounds(240,300,300,30);
        lll2.setBounds(280,120,300,30);
        bbb3.setBounds(240,500,300,30);
        bbb1.addActionListener(this);
        bbb2.addActionListener(this);
        bbb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e3)
    {
        if(e3.getSource()==bbb1)
        {
            String grx=ttt1.getText();
            double dep_amnt=Double.parseDouble(grx);
            amnt[kl]=amnt[kl]+dep_amnt;
            lll2.setText("Deposit Successfull !!");
        }
        else if(e3.getSource()==bbb2)
        {
            f4.dispose();
            Firstpage fp3 =new Firstpage();
        }
        else
        {
            f4.dispose();
        }
    }
}
/* Fourth page ends */
/* Fifth page starts */

 class Fourthpage extends Vari implements ActionListener 
{
    JFrame f4=new JFrame("ACCOUNT TO ACCOUNT TRANSFER");
    JLabel llll1,llll2,llll3,llll4;
    JTextField tttt1,tttt2,tttt3,tttt4;
    JButton bbbb1,bbbb2;
    Fourthpage()
    {
        llll1=new JLabel("Enter Account Number to You want to send");
        llll2=new JLabel("Enter Amount you want to send");
        llll3=new JLabel(" ");
        tttt1=new JTextField(10);
        tttt2=new JTextField(10);
        bbbb1=new JButton("TRANSFER");
        bbbb2=new JButton("BACK");
        llll4=new JLabel(" ");
        f4.setSize(600,600);
        f4.setVisible(true);
        f4.setLayout(null);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.add(llll1);
        f4.add(llll2);
        f4.add(tttt1);
        f4.add(llll3);
        f4.add(tttt2);
        f4.add(bbbb1);
        f4.add(bbbb2);
        f4.add(llll4);
        llll1.setBounds(50,100,400,30);
        llll2.setBounds(50,150,300,30);
        tttt1.setBounds(370,100,200,30);
        tttt2.setBounds(300,150,200,30);
        bbbb1.setBounds(200,300,200,30);
        bbbb2.setBounds(200,400,200,30);
        llll3.setBounds(220,250,300,30);
        llll4.setBounds(220,210,300,30);
        bbbb1.addActionListener(this);
        bbbb2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e5)
    {
        if(e5.getSource()==bbbb1)
        {
        	double trn_amnt=Double.parseDouble(tttt2.getText());
        	 	for(int i=0;i<3;i++)
            	{
                	if(tttt1.getText().equals( Integer.toString(c[i]) ))
                	{
                    	km=i;
                	}    
            	}
                if(km==9)
                {
                    llll4.setText("Transfer Failed !");
                    llll3.setText("User Not found");
                }
                else if(amnt[kl]>trn_amnt)
                {
                    amnt[km]=amnt[km]+trn_amnt;
                    amnt[kl]=amnt[kl]-trn_amnt;
                    llll3.setText("Transfer Successfull");
                    llll4.setText(" ");
                    km=9;
                }
                else
                {
                    llll4.setText("Transfer Failed !");
                    llll3.setText("You dont have enough balance");
                }
        }
        else
        {
            f4.dispose();
            Firstpage ff4=new Firstpage();
        }
    }
}
/*Fifth page ends */
/*Sixth page starts */
class Fifthpage extends Vari implements ActionListener 
{
    JFrame f5=new JFrame(" Cash WithDrawal ");
    JLabel lllll1,lllll2,lllll3;
    JTextField ttttt1,ttttt2;
    JButton bbbbb1,bbbbb2,bbbbb3;
    Fifthpage()
    {
        lllll1=new JLabel("Enter Amount");
        lllll2=new JLabel(" ");
        ttttt1=new JTextField(20);
        bbbbb1=new JButton("Withdraw");
        bbbbb2=new JButton("Back");
        bbbbb3=new JButton("Exit");
        lllll3=new JLabel(" ");
        f5.setSize(700,700);
        f5.setVisible(true);
        f5.setLayout(null);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.add(lllll1);
        f5.add(ttttt1);
        f5.add(bbbbb1);
        f5.add(bbbbb2);
        f5.add(bbbbb3);
        f5.add(lllll2);
        f5.add(lllll3);
        lllll1.setBounds(165,30,300,30);
        lllll2.setBounds(280,130,300,30);
        ttttt1.setBounds(300,30,300,30);
        bbbbb1.setBounds(240,180,300,30);
        bbbbb2.setBounds(240,300,300,30);
        bbbbb3.setBounds(240,500,300,30);
        lllll3.setBounds(280,100,300,30);
        bbbbb1.addActionListener(this);
        bbbbb2.addActionListener(this);
        bbbbb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e6)
    {
        
        if(e6.getSource()==bbbbb1)
        {
           double wth_amnt=Double.parseDouble(ttttt1.getText());
        	if(amnt[kl]>wth_amnt)
        	{
            	amnt[kl]=amnt[kl]-wth_amnt;
            	lllll2.setText("Withdraw Successfull");
                lllll3.setText(" ");
            }
            else
            {
                lllll3.setText("Withdraw Failed !");
            	lllll2.setText("you dont have enough Money!!");
            }	
        }
        else if(e6.getSource()==bbbbb2)
        {
            f5.dispose();
            Firstpage fp4 =new Firstpage();
        }
        else
        {
        	f5.dispose();
        }
    }
}
/* Sixth page ends */
/*main class*/
public class Banking
{
	public static void main(String[] args)
	{
		login bnk=new login();
	}
}	

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class New extends JFrame
{
static int n=8;
public New() throws HeadlessException
{
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new GridLayout(n,n));
            for(int i=0;i<n;i++)
                {
                    for (int j=0;j<n;j++)
                    {
                        int k= i*n + j+1;
                        if(k>=0) 
                        { JLabel l= new JLabel();
                               if(k==1||k==8)
                             { l=new JLabel (new ImageIcon("hb.png"));
                               }
                              if(k==2||k==7)
                             { l=new JLabel (new ImageIcon("gb.png"));
                               } 
                               if(k==3||k==6)
                             { l=new JLabel (new ImageIcon("ub.png"));
                               }
                                if(k==4)
                             { l=new JLabel (new ImageIcon("qb.png"));
                               }
                                 if(k==5)
                             { l=new JLabel (new ImageIcon("kb.png"));
                               }
                              if(k>8&&k<=16)
                               { l=new JLabel (new ImageIcon("pb.png"));
                               } 
                               if(k>=49&&k<=56)
                             { l=new JLabel (new ImageIcon("pw.png"));
                               }
                                if(k==57||k==64)
                             { l=new JLabel (new ImageIcon("hw.png"));
                               }
                                if(k==58||k==63)
                             { l=new JLabel (new ImageIcon("gw.png"));
                               }
                                if(k==59||k==62)
                             { l=new JLabel (new ImageIcon("uw.png"));
                               }
                                if(k==60)
                             { l=new JLabel (new ImageIcon("kw.png"));
                               }
                               if(k==61)
                             { l=new JLabel (new ImageIcon("qw.png"));
                               }

                           this.add(l);
                           
                            if(i%2==0)
                               { if((k+1)%2==0)
                                 {
                                  l.setBackground(Color.gray);
                                  l.setOpaque(true);
                                                   
                                 }
                               }
                            else
                               {
                                 if((k)%2==0)
                                 {
                                  l.setBackground(Color.gray);
                                   l.setOpaque(true);
                                 }
                                }
                        }


                    }

}
 
}
public static void main(String args[])
{

new New().setVisible(true);
	Pawn po=new Pawn();
	int cl1=po.click1();
	int cl2=po.click2();
	po.movePawn(cl1, cl2);

System.out.println(cl1);
System.out.println(cl2);
}
}










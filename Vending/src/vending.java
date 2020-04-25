import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.html.ImageView;

public class vending {

    // Make the User Interface.
    public static JFrame MyFrame = new JFrame("project-vm");
    public static JPanel MyPanel1 = new JPanel();
    public static JPanel MyPanel2 = new JPanel();
    public static JLabel Welcome = new JLabel("주문할 음식을 선택해주세요.");
    public static JButton order = new JButton("주문");
    public static JButton cancel = new JButton("취소");

    public static JButton menu1 = new JButton("쉬림프 - 8000원");
    public static JLabel lbl_1 = new JLabel("0");
    public static JButton menu2 = new JButton("미트 - 7000원");
    public static JLabel lbl_2 = new JLabel("0");
    public static JButton menu3 = new JButton("그라탕 - 8500원");
    public static JLabel lbl_3 = new JLabel("0");
    public static JButton menu4 = new JButton("까르보 - 7500");
    public static JLabel lbl_4 = new JLabel("0");

    public static JLabel lbl_main = new JLabel();

    public static JLabel lbl_menu1 = new JLabel();
    public static JLabel lbl_menu2 = new JLabel();
    public static JLabel lbl_menu3 = new JLabel();
    public static JLabel lbl_menu4 = new JLabel();

    public static JLabel lbl_price = new JLabel("총 주문금액");
    public static JTextField tf_PRICE = new JTextField();
    public static JLabel plus = new JLabel("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    public static JLabel lbl_in = new JLabel("금액을 입력해주세요.");
    public static JTextField tf_IN = new JTextField();
    public static JLabel lbl_change = new JLabel("거스름돈");
    public static JTextField tf_CHANGE = new JTextField();

    public static JButton Pay = new JButton("PAY");
    public static JButton vm_return = new JButton("반환");

    public static JLabel plus2 = new JLabel("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");



    public static void main(String[] args){

        final int[] count1 = {1};
        final int[] count2 = {1};
        final int[] count3 = {1};
        final int[] count4 = {1};

        MyFrame.setLayout(null);
        MyFrame.setBounds(200,100,700,400);
        MyFrame.setVisible(true);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame.add(MyPanel1);
        MyFrame.add(MyPanel2);
        MyPanel1.setBounds(0,0,400,400);
        MyPanel1.setLayout(null);
        MyPanel1.setBackground(new Color(255,224,219));
        MyPanel2.setBounds(400,0,300,400);
        MyPanel2.setLayout(null);
        MyPanel2.setBackground(new Color(255,234,125));

        Welcome.setBounds(50, 10, 200, 30);
        MyPanel1.add(Welcome);
        order.setBounds(235,10,60,30);
        MyPanel1.add(order);
        cancel.setBounds(300, 10, 60,30 );
        MyPanel1.add(cancel);

        lbl_menu1.setBounds(25,50,130,100);
        MyPanel1.add(lbl_menu1);
        lbl_menu2.setBounds(225,50,130,100);
        MyPanel1.add(lbl_menu2);
        lbl_menu3.setBounds(25,210,130,100);
        MyPanel1.add(lbl_menu3);
        lbl_menu4.setBounds(225,210,130,100);
        MyPanel1.add(lbl_menu4);

        menu1.setBounds(25, 160, 130, 30);
        MyPanel1.add(menu1);
        lbl_1.setBounds(160, 160,30,30);
        MyPanel1.add(lbl_1);
        menu2.setBounds(225, 160, 130, 30);
        MyPanel1.add(menu2);
        lbl_2.setBounds(360, 160,30,30);
        MyPanel1.add(lbl_2);
        menu3.setBounds(25, 320, 130, 30);
        MyPanel1.add(menu3);
        lbl_3.setBounds(160, 320,30,30);
        MyPanel1.add(lbl_3);
        menu4.setBounds(225, 320, 130, 30);
        MyPanel1.add(menu4);
        lbl_4.setBounds(360, 320,30,30);
        MyPanel1.add(lbl_4);


        lbl_main.setBounds(80,0,128,128);
        MyPanel2.add(lbl_main);

        lbl_price.setBounds(50, 120, 120, 30);
        MyPanel2.add(lbl_price);
        tf_PRICE.setBounds(150, 120, 120, 30);
        MyPanel2.add(tf_PRICE);
        tf_PRICE.setEnabled(false);
        plus.setBounds(25, 160, 250, 30);
        MyPanel2.add(plus);
        lbl_in.setBounds(30, 200, 120, 30);
        MyPanel2.add(lbl_in);
        tf_IN.setBounds(150, 200, 120, 30);
        MyPanel2.add(tf_IN);

        lbl_change.setBounds(50, 240, 120, 30);
        MyPanel2.add(lbl_change);
        tf_CHANGE.setBounds(150, 240, 120, 30);
        MyPanel2.add(tf_CHANGE);
        tf_CHANGE.setEnabled(false);

        Pay.setBounds(25, 280, 120, 35);
        MyPanel2.add(Pay);
        vm_return.setBounds(150, 280, 120, 35);
        MyPanel2.add(vm_return);
        plus2.setBounds(25, 320, 250, 30);
        MyPanel2.add(plus2);


        ImageIcon img_main = new ImageIcon(vending.class.getResource("/img/main.png"));
        lbl_main.setIcon(img_main);

        ImageIcon img_menu1 = new ImageIcon(vending.class.getResource("/img/spaghetti11.jpg"));
        lbl_menu1.setIcon(img_menu1);
        ImageIcon img_menu2 = new ImageIcon(vending.class.getResource("/img/spaghetti22.jpg"));
        lbl_menu2.setIcon(img_menu2);
        ImageIcon img_menu3 = new ImageIcon(vending.class.getResource("/img/spaghetti33.jpg"));
        lbl_menu3.setIcon(img_menu3);
        ImageIcon img_menu4 = new ImageIcon(vending.class.getResource("/img/spaghetti44.jpg"));
        lbl_menu4.setIcon(img_menu4);

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count1[0]=0;
                lbl_1.setText(count1[0]+"");
                count1[0]++;
                count2[0]=0;
                lbl_2.setText(count2[0]+"");
                count2[0]++;
                count3[0]=0;
                lbl_3.setText(count3[0]+"");
                count3[0]++;
                count4[0]=0;
                lbl_4.setText(count4[0]+"");
                count4[0]++;
                tf_PRICE.setText("");

            }
        });

        menu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_1.setText(count1[0] +"");
                count1[0]++;
            }
        });

        menu2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_2.setText(count2[0] +"");
                count2[0]++;
            }
        });

        menu3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_3.setText(count3[0] +"");
                count3[0]++;
            }
        });

        menu4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_4.setText(count4[0] +"");
                count4[0]++;
            }
        });

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count1[0]--;
                count2[0]--;
                count3[0]--;
                count4[0]--;
                int sum = count1[0]*8000+count2[0]*7000+count3[0]*8500+count4[0]*7500;
                tf_PRICE.setText(sum+"");
                }
        });

        Pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tf_IN.getText());
                int num2 = Integer.parseInt(tf_PRICE.getText());
                int sub = num1 - num2 ;
                if (sub >= 0) {
                    tf_CHANGE.setText(sub+"");
                }else {JOptionPane.showMessageDialog(null,"금액이 부족합니다.");}
            }
        });

        vm_return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"감사합니다.");

                count1[0]=0;
                lbl_1.setText(count1[0]+"");
                count1[0]++;
                count2[0]=0;
                lbl_2.setText(count2[0]+"");
                count2[0]++;
                count3[0]=0;
                lbl_3.setText(count3[0]+"");
                count3[0]++;
                count4[0]=0;
                lbl_4.setText(count4[0]+"");
                count4[0]++;
                tf_PRICE.setText("");
                tf_CHANGE.setText("");
                tf_IN.setText("");
            }
        });
    }
}
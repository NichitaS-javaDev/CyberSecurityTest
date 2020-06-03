package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class SimpleWindow extends JFrame {
    SimpleWindow() {
        super("Cyber Security Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(resolution.width, resolution.height);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        Box mainBox1 = Box.createVerticalBox();
        Box mainBox2 = Box.createVerticalBox();
        ButtonGroup buttonGroup = new ButtonGroup();

        Font font = new Font("", Font.PLAIN, 24);
        EmptyBorder emptyBorder = new EmptyBorder(10, 25, 10, 10);
        EmptyBorder labelBorder = new EmptyBorder(10, 10, 10, 10);
        ///   TextField   ///
        JLabel label = new JLabel("Nume Prenume :");
        label.setFont(font);
        label.setBorder(new EmptyBorder(2,10,3,0));

        JTextField textField = new JTextField();
        textField.setFont(font);
        textField.setMaximumSize(new Dimension(750,25));

        mainBox1.add(label);
        mainBox1.add(textField);
        ///               ///
        ////   Box1   ////
        Box box = Box.createVerticalBox();

        label = new JLabel("Cea mai sigura parola este...");
        label.setFont(font);
        label.setBorder(labelBorder);
        box.add(label);

        JRadioButton radioButton = new JRadioButton("123456");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        radioButton = new JRadioButton("<Nume Prenume>");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        radioButton = new JRadioButton("<Numarul tau de telefon>");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        JRadioButton radioButton1 = new JRadioButton("BuMK96ioLtQ");
        radioButton1.setBorder(emptyBorder);
        radioButton1.setFont(font);
        buttonGroup.add(radioButton1);
        box.add(radioButton1);



        TitledBorder titledBorder = new TitledBorder("1");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox1.add(box);
        ///          ///

        ///   Box2   ///
        box = Box.createVerticalBox();

        label = new JLabel("NU sunt antivirusi :");
        label.setBorder(new EmptyBorder(10, 10, 10, 117));
        label.setFont(font);
        box.add(label);

        JCheckBox checkBox1 = new JCheckBox(" Avast");
        checkBox1.setFont(font);
        checkBox1.setBorder(emptyBorder);
        box.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox(" AVG");
        checkBox2.setFont(font);
        checkBox2.setBorder(emptyBorder);
        box.add(checkBox2);

        JCheckBox checkBox3 = new JCheckBox(" AWT");
        checkBox3.setFont(font);
        checkBox3.setBorder(emptyBorder);
        box.add(checkBox3);

        JCheckBox checkBox4 = new JCheckBox(" Kaspersky");
        checkBox4.setFont(font);
        checkBox4.setBorder(emptyBorder);
        box.add(checkBox4);

        JCheckBox checkBox5 = new JCheckBox(" Bitdefender");
        checkBox5.setFont(font);
        checkBox5.setBorder(emptyBorder);
        box.add(checkBox5);

        JCheckBox checkBox6 = new JCheckBox(" DOTA-2");
        checkBox6.setFont(font);
        checkBox6.setBorder(emptyBorder);
        box.add(checkBox6);

        JCheckBox checkBox7 = new JCheckBox(" Norton");
        checkBox7.setFont(font);
        checkBox7.setBorder(emptyBorder);
        box.add(checkBox7);

        JCheckBox checkBox8 = new JCheckBox(" ERSET");
        checkBox8.setFont(font);
        checkBox8.setBorder(emptyBorder);
        box.add(checkBox8);

        titledBorder = new TitledBorder("2");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox1.add(box);
        ///          ///
        ///   Box3   ///
        box = Box.createVerticalBox();
        buttonGroup = new ButtonGroup();

        label = new JLabel("Pentru a nu afecta PC-ul cu un virus, trebuie :");
        label.setBorder(labelBorder);
        label.setFont(font);
        box.add(label);

        radioButton = new JRadioButton("Sa nu stranutam langa PC");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        JRadioButton radioButton2 = new JRadioButton("Sa folosim un Anti-Virus");
        radioButton2.setBorder(emptyBorder);
        radioButton2.setFont(font);
        buttonGroup.add(radioButton2);
        box.add(radioButton2);

        radioButton = new JRadioButton("Sa nu folosim reteaua Internet");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        radioButton = new JRadioButton("Sa nu descarcam nimic din reteaua Internet");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        titledBorder = new TitledBorder("3");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox1.add(box);
        ///          ///

        ///   Box4   ///
        box = Box.createVerticalBox();
        buttonGroup = new ButtonGroup();

        label = new JLabel("Cum se raspindesc virusii ?");
        label.setFont(font);
        label.setBorder(emptyBorder);
        box.add(label);

        radioButton = new JRadioButton("Site-uri Web");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        JRadioButton radioButton3 = new JRadioButton("Flash Drive-uri");
        radioButton3.setFont(font);
        radioButton3.setBorder(emptyBorder);
        buttonGroup.add(radioButton3);
        box.add(radioButton3);

        radioButton = new JRadioButton("Camere Web");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        radioButton = new JRadioButton("Tastatura");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        titledBorder = new TitledBorder("4");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox1.add(box);
        ///          ///

        ///   Box5   ///
        box = Box.createVerticalBox();
        buttonGroup = new ButtonGroup();

        label = new JLabel("Ce este un Firewall ?");
        label.setBorder(emptyBorder);
        label.setFont(font);
        box.add(label);

        radioButton = new JRadioButton("Un virus de tip Trojan");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        radioButton = new JRadioButton("Denumire data unui flash drive ce contine virus");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        JRadioButton radioButton4 = new JRadioButton("Un dispozitiv cu rolul de a cripta si filtra traficul Internet");
        radioButton4.setFont(font);
        radioButton4.setBorder(emptyBorder);
        buttonGroup.add(radioButton4);
        box.add(radioButton4);

        radioButton = new JRadioButton("O simpla joaca online");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        titledBorder = new TitledBorder("5");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox1.add(box);
        ///          ///

        ///   Box6   ///
        box = Box.createVerticalBox();

        label = new JLabel("Ce informatii nu trebuie dezvaluite pe Internet?");
        label.setBorder(labelBorder);
        label.setFont(font);
        box.add(label);

        JCheckBox checkBox9 = new JCheckBox("Modelul calculatorului");
        checkBox9.setBorder(emptyBorder);
        checkBox9.setFont(font);
        box.add(checkBox9);

        JCheckBox checkBox10 = new JCheckBox("Adresa de locuinta");
        checkBox10.setBorder(emptyBorder);
        checkBox10.setFont(font);
        box.add(checkBox10);

        JCheckBox checkBox11 = new JCheckBox("Datele din pasaport");
        checkBox11.setBorder(emptyBorder);
        checkBox11.setFont(font);
        box.add(checkBox11);

        JCheckBox checkBox12 = new JCheckBox("Numele animalului de companie");
        checkBox12.setBorder(emptyBorder);
        checkBox12.setFont(font);
        box.add(checkBox12);

        JCheckBox checkBox13 = new JCheckBox("Datele cardului bancar");
        checkBox13.setBorder(emptyBorder);
        checkBox13.setFont(font);
        box.add(checkBox13);

        JCheckBox checkBox14 = new JCheckBox("Numarul fisei medicale");
        checkBox14.setBorder(emptyBorder);
        checkBox14.setFont(font);
        box.add(checkBox14);

        titledBorder = new TitledBorder("6");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox2.add(box);
        ///          ///

        ///   Box7   ///
        box = Box.createVerticalBox();
        buttonGroup = new ButtonGroup();

        label = new JLabel("Ce este Internet Phishing-ul ?");
        label.setBorder(labelBorder);
        label.setFont(font);
        box.add(label);

        radioButton = new JRadioButton("O joaca in care trebuie sa prinzi pesti");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        JRadioButton radioButton5 = new JRadioButton("Crearea unor site-uri fake ce pot fura datele");
        radioButton5.setBorder(emptyBorder);
        radioButton5.setFont(font);
        buttonGroup.add(radioButton5);
        box.add(radioButton5);

        radioButton = new JRadioButton("Crearea unor virusi ce pot fura datele");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        radioButton = new JRadioButton("Analiza unor cookie file-uri pentru a extrage date personale");
        radioButton.setBorder(emptyBorder);
        radioButton.setFont(font);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        titledBorder = new TitledBorder("7");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox2.add(box);
        ///          ///

        ///   Box8   ///
        box = Box.createVerticalBox();

        label = new JLabel("O parola sigura trebuie sa contina minim ... caractere");
        label.setFont(font);
        box.add(label);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 8, 4);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.setFont(font);
        slider.setMaximumSize(new Dimension(1250,100));
        box.add(slider);

        titledBorder = new TitledBorder("8");
        titledBorder.setTitleFont(font);
        titledBorder.setBorder(emptyBorder);
        box.setBorder(titledBorder);

        mainBox2.add(box);
        ///          ///

        ///   Box9   ///
        box = Box.createVerticalBox();

        label = new JLabel("Daca iti vine un mesaj Gmail cu rugamintea sa accesezi un link :  ");
        label.setFont(font);
        box.add(label);

        JCheckBox checkBox15 = new JCheckBox("Accesezi link-ul");
        checkBox15.setBorder(emptyBorder);
        checkBox15.setFont(font);
        box.add(checkBox15);

        JCheckBox checkBox16 = new JCheckBox("Trimiti acest mesaj tuturor prietenilor");
        checkBox16.setBorder(emptyBorder);
        checkBox16.setFont(font);
        box.add(checkBox16);

        JCheckBox checkBox17 = new JCheckBox("Stergi mesajul");
        checkBox17.setBorder(emptyBorder);
        checkBox17.setFont(font);
        box.add(checkBox17);

        JCheckBox checkBox18 = new JCheckBox("Raspunzi la acest mesaj");
        checkBox18.setBorder(emptyBorder);
        checkBox18.setFont(font);
        box.add(checkBox18);

        JCheckBox checkBox19 = new JCheckBox("Trimiti mesajul in Spam");
        checkBox19.setBorder(emptyBorder);
        checkBox19.setFont(font);
        box.add(checkBox19);

        titledBorder = new TitledBorder("9");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox2.add(box);
        ///          ///

        ///   Box10  ///
        box = Box.createVerticalBox();
        buttonGroup = new ButtonGroup();

        label = new JLabel("URL-ul corect este :  ");
        label.setFont(font);
        label.setBorder(labelBorder);
        box.add(label);

        radioButton = new JRadioButton("https://faceboók.com");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        JRadioButton radioButton6 = new JRadioButton("https://facebook.com");
        radioButton6.setFont(font);
        radioButton6.setBorder(emptyBorder);
        buttonGroup.add(radioButton6);
        box.add(radioButton6);

        radioButton = new JRadioButton("https://fàcebook.com");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        radioButton = new JRadioButton("htpps://facebook.com");
        radioButton.setFont(font);
        radioButton.setBorder(emptyBorder);
        buttonGroup.add(radioButton);
        box.add(radioButton);

        titledBorder = new TitledBorder("10");
        titledBorder.setTitleFont(font);
        box.setBorder(titledBorder);

        mainBox2.add(box);
        ///          ///
        ///   Check Button   ///
        JButton button = new JButton("   Afisare rezultat   ");
        button.setFont(font);

        label = new JLabel("   ");
        label.setBorder(new EmptyBorder(20,0,0,10));

        mainBox2.add(label);
        mainBox2.add(button);
        ///                  ///
        ///   ProgressBar   ///
        label = new JLabel("Rezultatul final (%) : ");
        label.setFont(font);
        label.setBorder(new EmptyBorder(30,0,10,10));
        mainBox2.add(label);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(0);
        progressBar.setBorder(emptyBorder);

        JLabel labelMark = new JLabel();
        labelMark.setFont(font);
        labelMark.setVisible(false);

        mainBox2.add(progressBar);
        mainBox2.add(labelMark);
        ///                 ///
        panel1.add(mainBox1);
        panel2.add(mainBox2);


        mainPanel.add(panel1);
        mainPanel.add(panel2);


        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        setContentPane(scrollPane);

        ///   Write To File   ///




        ///                   ///
        button.addActionListener(e -> {
            if (radioButton1.isSelected()){
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (radioButton2.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (radioButton3.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (radioButton4.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (radioButton5.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (radioButton6.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (slider.getValue() == 8) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (!checkBox1.isSelected() && !checkBox2.isSelected() && checkBox3.isSelected() &&
                    !checkBox4.isSelected() && !checkBox5.isSelected() && checkBox6.isSelected() &&
                    !checkBox7.isSelected() && checkBox8.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (!checkBox9.isSelected() && checkBox10.isSelected() && checkBox11.isSelected() &&
                    !checkBox12.isSelected() && checkBox13.isSelected() && !checkBox14.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (!checkBox15.isSelected() && !checkBox16.isSelected() && checkBox17.isSelected() &&
                    !checkBox18.isSelected() && checkBox19.isSelected()) {
                progressBar.setValue(progressBar.getValue() + 10);
            }
            if (progressBar.getValue()/10 == 0){
                labelMark.setText("Nota : " + "1");
            } else {
                labelMark.setText("Nota : " + progressBar.getValue()/10);
            }
            labelMark.setVisible(true);
            button.setEnabled(false);

            try (FileWriter writer = new FileWriter("Results.txt", true)) {
                if (progressBar.getValue()/10 == 0){
                    writer.write(textField.getText() + " : 1\n" );
                } else {
                    writer.write(textField.getText() + " : " + progressBar.getValue()/10 + "\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}



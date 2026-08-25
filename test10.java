import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


class test10 
{
JFrame f;

String imagepath;
File selectfile1;
ImageIcon img20;
Object val2;
String selectedType="";

JPanel p1, p2 ,p3, p4, p5, p6, p7;
JTextField tf1, tf2, tf3, tf4, tf5,tf6,tf7,tf8,tf9,tf10,tf11;
JPasswordField pas, pas2, pas3;
JButton b,b1,b2,b3,b4,b5, b6, b7,b8,b9, b10,b11,b12,photo,view,student,staff;
JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
JRadioButton r1,r2,r3,r4;
JComboBox cb1,cb2,cb3;
JMenu m1;          //m2,m3,m4;
JMenuItem i1,i2,i3,i4;
JMenuBar mb;
JTable jt,jt1;
//Container c=getContentPane();
JScrollPane sp1,sp2,sp3;
DefaultTableModel dm,dm1;
Connection con;

//constructor
test10() {
f = new JFrame("User Login");

ImageIcon img1=new ImageIcon("clg10.jpg");
Image im1=img1.getImage();

ImageIcon img2=new ImageIcon("p5.jpg");
Image im2=img2.getImage();

ImageIcon img3=new ImageIcon("clg13.jpg");
Image im3=img3.getImage();

ImageIcon img4=new ImageIcon("p13.jpg");
Image im4=img4.getImage();

ImageIcon img5=new ImageIcon("clg1.jpg");
Image im5=img5.getImage();

ImageIcon img6=new ImageIcon("clg2.jpg");
Image im6=img6.getImage();

ImageIcon img7=new ImageIcon("clg3.jpeg");
Image im7=img7.getImage();

ImageIcon img8=new ImageIcon("lg5.gif");

ImageIcon img9=new ImageIcon("te1.jpg");
ImageIcon img10=new ImageIcon("stu2.jpg");
ImageIcon img11=new ImageIcon("hm4.jpg");

ImageIcon img12=new ImageIcon("un1.jpg");
Image im10=img12.getImage();

ImageIcon img13=new ImageIcon("J4o.gif");
Image im11=img13.getImage();

//ImageIcon img13=new ImageIcon();


l1 = new JLabel("Enter your name");
l1.setBounds(700,350,250,20);
l1.setFont(new Font("Serif",Font.BOLD,24));
tf1 = new JTextField();
tf1.setBounds(950, 350, 250, 30);
tf1.setToolTipText("enter Name");
tf1.setFont(new Font("Serif",Font.BOLD,20));

l2 = new JLabel("Enter your mail id");
l2.setBounds(700, 400, 250, 30);
l2.setFont(new Font("Serif",Font.BOLD,24));
tf2 = new JTextField();
tf2.setBounds(950, 400, 250, 30);
tf2.setToolTipText("enter mail id");
tf2.setFont(new Font("Serif",Font.BOLD,20));

l4 = new JLabel("Password");
l4.setBounds(700, 450, 250, 30);
l4.setFont(new Font("Serif",Font.BOLD,24));
pas = new JPasswordField();
pas.setBounds(950, 450, 250, 30);
pas.setToolTipText("password");

l5 = new JLabel("your mail_id");
l5.setBounds(700,300,250,30);
l5.setFont(new Font("Serif",Font.BOLD,24));
tf3 = new JTextField();
tf3.setBounds(950, 300, 250, 30);
tf3.setToolTipText("mailId");
tf3.setFont(new Font("Serif",Font.BOLD,20));


l6 = new JLabel("user name");
l6.setBounds(700, 350, 250, 30);
l6.setFont(new Font("Serif",Font.BOLD,24));
tf4 = new JTextField();
tf4.setBounds(950, 350, 250, 30);
tf4.setToolTipText("name");
tf4.setFont(new Font("Serif",Font.BOLD,20));


l7 = new JLabel("create Password");
l7.setBounds(700, 400, 250, 30);
l7.setFont(new Font("Serif",Font.BOLD,24));
pas2 = new JPasswordField();
pas2.setBounds(950, 400, 250, 30);
pas2.setToolTipText("password");

l8 = new JLabel("confrim Password");
l8.setBounds(700, 450, 250, 30);
l8.setFont(new Font("Serif",Font.BOLD,24));
pas3 = new JPasswordField();
pas3.setBounds(950, 450, 250, 30);
pas3.setToolTipText("password");

l10 = new JLabel("Student Name:");
l10.setBounds(700,200,250,20);
l10.setFont(new Font("Serif",Font.BOLD,24));
tf5=new JTextField();
tf5.setBounds(950, 200, 250, 30);
tf5.setToolTipText("Enter your name");

l9 = new JLabel("Register Number:");
l9.setBounds(700,300,250,20);
l9.setFont(new Font("Serif",Font.BOLD,24));
tf6=new JTextField();
tf6.setBounds(950, 300, 250, 30);
tf6.setToolTipText("Enter your Register No");

l11 = new JLabel("RIGISTER FORM");
l11.setBounds(850,90,300,40);
l11.setFont(new Font("Serif",Font.BOLD,30));

Font mf=new Font("Arial",Font.PLAIN,20);

l12 = new JLabel("Gender:");
l12.setBounds(700,390,300,40);
l12.setFont(new Font("Serif",Font.BOLD,24));

r1=new JRadioButton("Male");
r1.setBounds(950,400,100,30);
r1.setFont(mf);
r2=new JRadioButton("Female");
r2.setBounds(1050,400,100,30);
r2.setFont(mf);
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);

l13 = new JLabel("Department:");
l13.setBounds(700,490,300,40);
l13.setFont(new Font("Serif",Font.BOLD,24));

String dept[]={"CSE","IT","MECH","AIDS","ECE","EEE"};
cb1=new JComboBox(dept);
cb1.setBounds(950,490,100,40);

l15 = new JLabel("Batch:");
l15.setBounds(700,690,300,40);
l15.setFont(new Font("Serif",Font.BOLD,24));

String bt[]={"2028","2027","2026","2025","2024","2023"};
cb2=new JComboBox(bt);
cb2.setBounds(950,690,100,40);

l14 = new JLabel("Phone Number:");
l14.setBounds(700,590,250,20);
l14.setFont(new Font("Serif",Font.BOLD,24));
tf7=new JTextField();
tf7.setBounds(950, 590, 250, 30);
tf7.setToolTipText("Enter your phone No");

l16 = new JLabel("RIGISTER FORM");
l16.setBounds(850,90,300,40);
l16.setFont(new Font("Serif",Font.BOLD,30));

l17 = new JLabel("Staff Name:");
l17.setBounds(700,200,250,20);
l17.setFont(new Font("Serif",Font.BOLD,24));
tf8=new JTextField();
tf8.setBounds(950, 200, 250, 30);
tf8.setToolTipText("Enter your name");

l18 = new JLabel("Staff ID:");
l18.setBounds(700,300,250,20);
l18.setFont(new Font("Serif",Font.BOLD,24));
tf9=new JTextField();
tf9.setBounds(950, 300, 250, 30);
tf9.setToolTipText("Enter your Id_No");


l19 = new JLabel("Gender:");
l19.setBounds(700,390,300,40);
l19.setFont(new Font("Serif",Font.BOLD,24));

r3=new JRadioButton("Male");
r3.setBounds(950,400,100,30);
r3.setFont(mf);
r4=new JRadioButton("Female");
r4.setBounds(1050,400,100,30);
r4.setFont(mf);
ButtonGroup bg1=new ButtonGroup();
bg1.add(r3);
bg1.add(r4);

l20 = new JLabel("Language:");
l20.setBounds(700,490,300,40);
l20.setFont(new Font("Serif",Font.BOLD,24));

String lag[]={"TAMIL","MALAYALAM","KANADAM","TELUGU","HINDI"};
cb3=new JComboBox(lag);
cb3.setBounds(950,490,100,40);

l21 = new JLabel("Phone Number:");
l21.setBounds(700,590,250,20);
l21.setFont(new Font("Serif",Font.BOLD,24));
tf10=new JTextField();
tf10.setBounds(950, 590, 250, 30);
tf10.setToolTipText("Enter your phone No");

l23 = new JLabel(img8);
l23.setBounds(700,90,500,200);

  
tf11 = new JTextField();
tf11.setBounds(120,150,150,30);
tf11.setFont(new Font("Serif",Font.BOLD,24));


/*************************BUTTON**************************/
b = new JButton("LogIn");
b.setBounds(730, 550, 200, 50);

b1=new JButton("SingIn");
b1.setBounds(980, 550, 200, 50);

b2=new JButton("register");
b2.setBounds(980, 550, 200, 50);

b3=new JButton(img10);
b3.setBounds(200, 250, 220, 220);

b4=new JButton(img9);
b4.setBounds(200, 500, 220, 220);

b5=new JButton("Submit");
b5.setBounds(1500, 700, 200, 50);

b6=new JButton("Back");
b6.setBounds(200, 700, 200, 50);

b7=new JButton("Back");
b7.setBounds(200, 700, 200, 50);

b8=new JButton("Submit");
b8.setBounds(1500, 700, 200, 50);

b9=new JButton(img11);
b9.setBounds(1500,400,220,220);

b10=new JButton("Search");
b10.setBounds(300,150,100,30);

b11=new JButton("Delete");
b11.setBounds(420,150,100,30);

b12=new JButton("Sort");
b12.setBounds(540,150,100,30);

student=new JButton("Student");
student.setBounds(70,50,100,30);

staff=new JButton("Staff");
staff.setBounds(190,50,100,30);

view=new JButton("VIEW");
view.setBounds(680,150,100,30);

photo =new JButton("photo");
photo.setBounds(700, 700, 200, 50);

/**************************************panel***********************************/
m1=new JMenu("MENU");
mb=new JMenuBar();
mb.setBounds(0,0,300,200);
i1=new JMenuItem("HOME");
i2=new JMenuItem("Gallery");
i3=new JMenuItem("ACADEMICS");
i4=new JMenuItem("FEE PAYMENT");
m1.add(i1);
m1.add(i2);
m1.add(i3);
m1.add(i4);
mb.add(m1);
p1 = new JPanel(){
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.drawImage(im1, 0, 0, getWidth(), getHeight(),this);
}
};
p1.setLayout(null);
p1.setBounds(0, 0, 2000,950);


p1.add(l1);
p1.add(tf1);
p1.add(l2);
p1.add(tf2);
p1.add(l4);
p1.add(pas);
p1.add(b);
p1.add(b1);
p1.add(l23); 

p2 = new JPanel(){
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.drawImage(im3, 0, 0, getWidth(), getHeight(),this);
}
};
p2.setLayout(null);
p2.setBounds(0, 0, 2000,950);
p2.add(b3);
p2.add(b4);
p2.add(b9);
//p2.add(l23);
//p2.add(mb);
//p2.setJMenuBar(mb);
p2.setVisible(false); 


p3=new JPanel(){
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.drawImage(im2,0,0,getWidth(),getHeight(),this);
}};
p3.setBounds(0, 0, 2000,950);
p3.setLayout(null);

p3.add(l5);
p3.add(tf3);
p3.add(l6);
p3.add(tf4);
p3.add(l7);
p3.add(pas2);
p3.add(l8);
p3.add(pas3);
p3.add(b2);
p3.setVisible(false);

p4=new JPanel(){
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.drawImage(im4,0,0,getWidth(),getHeight(),this);
}};

p4.setLayout(null);
p4.setBounds(0, 0, 2000,950);
p4.add(b6);
p4.add(photo);
p4.add(l10);
p4.add(tf5);
p4.add(l9);
p4.add(tf6);
p4.add(b8);
p4.add(l11);
p4.add(r1);
p4.add(r2);
p4.add(l12);
p4.add(l13);
p4.add(l14);
p4.add(tf7);
p4.add(cb1);
p4.add(l15);
p4.add(cb2);
//p4.add(mb);
p4.setVisible(false);

p5=new JPanel(){
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.drawImage(im4,0,0,getWidth(),getHeight(),this);
}};

p5.setLayout(null);
p5.setBounds(0, 0, 2000,950);
p5.add(b7);
p5.add(l16);
p5.add(l17);
p5.add(l18);
p5.add(l19);
p5.add(l20);
p5.add(l21);
p5.add(tf8);
p5.add(tf9);
p5.add(tf10);
p5.add(r3);
p5.add(r4);
p5.add(cb3);
p5.add(b5);
p5.setVisible(false);

l22 = new JLabel("ABCD University");
l22.setBounds(850,70,600,60);
l22.setFont(new Font("Serif",Font.BOLD,50));

p6=new JPanel(){
protected void paintComponent(Graphics g){
super.paintComponent(g);

//g.drawImage(im11,0,0,getWidth(),getHeight(),this);
g.drawImage(im5,200,160,500,500,this);
g.drawImage(im6,720,160,500,500,this);
g.drawImage(im7,1240,160,500,500,this);
g.drawImage(im10,300,700,1000,500,this);
}};
p6.add(l22);
p6.setLayout(null);
p6.setBounds(0,0,2000,950);

p6.setVisible(false);
//p6.setSize(2000,1000);//p6.setPreferredSize(new Dimension(1800, 1500));//sp1=new JScrollPane(p6);
//p6.setBounds(0,0,2000,950);


String c1[]={"SNAME","REGNO","GENDER","DEPT","PHNO","BATCH"};
dm = new DefaultTableModel(c1,10);
jt=new JTable(dm);
sp2=new JScrollPane(jt);
sp2.setBounds(350, 300, 900,180 );
jt.setRowHeight(30);

String c2[]={"SNAME","SID","GENDER","LAG","PHNO"};
dm1 = new DefaultTableModel(c2,10);
jt1=new JTable(dm1);
sp3=new JScrollPane(jt1);
sp3.setBounds(350, 300, 900,180 );
jt1.setRowHeight(30);



p7=new JPanel();
p7.setLayout(null);
p7.add(tf11);
p7.add(b10);
p7.add(b11);
p7.add(b12);
p7.add(view);
p7.add(student);
p7.add(staff);
p7.setBounds(0,0,2000,950);
p7.add(sp2);
p7.add(sp3);
p7.setVisible(false);
                  /*********************BUTTON ACTION******************/
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
checkdetails();
}
});

b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e){
p1.setVisible(false);
p3.setVisible(true);
  p6.setVisible(false);

}});

b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
newuser();
}
});

b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
p2.setVisible(false);
p4.setVisible(true);
  p6.setVisible(false);

}});

b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
p2.setVisible(false);
p5.setVisible(true);
  p6.setVisible(false);
}});

b5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e){
sdetails();
}});

b6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e){
p2.setVisible(true);
p4.setVisible(false);
  p6.setVisible(false);
}});

b7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e){
p2.setVisible(true);
  p6.setVisible(false);
p5.setVisible(false);
}});

b8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
studentDetails();
}});

b9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
p7.setVisible(true);
p2.setVisible(false);
  p6.setVisible(false);
//homework();
}});

student.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
homework1();
selectedType="student";
sp2.setVisible(true);
sp3.setVisible(false);
}});
staff.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
homework2();
selectedType="staff";
sp2.setVisible(false);
sp3.setVisible(true);
}});

i1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
p2.setVisible(true);
p4.setVisible(false);
p5.setVisible(false);
  p6.setVisible(false);
p7.setVisible(false);
}});
i2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
p6.setVisible(true);
p2.setVisible(false);
p4.setVisible(false);
p5.setVisible(false);
p7.setVisible(false);
}});

b10.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(selectedType.equals("student")){
searchdetail();
}
else if(selectedType.equals("staff")){
searchdetail1();
}
}});

b11.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(selectedType.equals("student")){
del();
}
else if(selectedType.equals("staff")){
del1();
}

}});

b12.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(selectedType.equals("student")){
sortbysub();
}
else if(selectedType.equals("staff")){
sort1();
}
}});

photo.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
JFileChooser fc=new JFileChooser();
fc.setDialogTitle("Selected photo");
fc.setAcceptAllFileFilterUsed(true);
int result=fc.showOpenDialog(f);
if(result==JFileChooser.APPROVE_OPTION)
{
selectfile1 = fc.getSelectedFile();
imagepath=selectfile1.getPath();
}
}
});

view.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
photoview();
}});



f.add(p1);
f.add(p2);
f.add(p3);
f.add(p4);
f.add(p5);
f.add(p6);
f.add(p7);
//f.add(sp1);
f.setSize(2000,1000);
//f.setLayout(null);
f.setVisible(true);
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
con = DriverManager.getConnection(url, "ar2", "ar2321");
}catch(Exception e){
e.getStackTrace();
}
}
/****************************************************CHECKLIST********************************/
void checkdetails() {
String username = tf1.getText();
String mailId = tf2.getText();
String password = new String(pas.getPassword());
try{
String sql = "SELECT * FROM user1 WHERE username=? AND mail_id=? AND password=?";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, username);
pst.setString(2, mailId);
pst.setString(3, password);

ResultSet rs = pst.executeQuery();

if(rs.next()){
p2.setVisible(true);   
p1.setVisible(false);  
if (p1.isVisible()||p3.isVisible()) /*p5.isVisible()) */
{
f.setJMenuBar(null);
}
else {
f.setJMenuBar(mb);
}
}
else
{
JOptionPane.showMessageDialog(f, "Invalid Username, Mail ID, or Password!");
}
//con.close();
} catch (Exception ex) {
JOptionPane.showMessageDialog(f, "ERROR: " + ex.getMessage());
}
}
/**************************************************NEW_USER********************************************************************/
void newuser() {
String username = tf4.getText();
String mailId = tf3.getText();
String password = new String(pas2.getPassword());
String cpass = new String(pas3.getPassword());

if(!password.equals(cpass)){
JOptionPane.showMessageDialog(f, "Password not match!!");
return;
}
else{
try {
String sql1 = "INSERT INTO user1 (username,mail_id,password) VALUES (?,?,?)";
PreparedStatement pst = con.prepareStatement(sql1);
pst.setString(1, username);
pst.setString(2, mailId);
pst.setString(3, password);

int row1 = pst.executeUpdate();

if (row1>0)
{
JOptionPane.showMessageDialog(f, "Registered successfully!");
p1.setVisible(true);   
p3.setVisible(false);  
} 
else
{
JOptionPane.showMessageDialog(f, "Invalid details!");
}
} catch (Exception ex) {
JOptionPane.showMessageDialog(f, "ERROR: " + ex.getMessage());
}
}
}
/************************************************************Student Details*******************************/
void studentDetails(){
String sname=tf5.getText();
String regno=tf6.getText();
String gender = "";
if (r1.isSelected()) {
    gender = "Male";
} else if (r2.isSelected()) {
    gender = "Female";
}
String phno=tf7.getText();
String dept=(String) cb1.getSelectedItem();
String batch=(String) cb2.getSelectedItem();

if(sname.equals("")||regno.equals("")||phno.equals("")){
JOptionPane.showMessageDialog(f, "all fields are required!");
return;
}
if(phno.length()>10 || phno.length()<10){
JOptionPane.showMessageDialog(f, "enter valid phone number");
}
else if(phno.length()==10){
try{
String sql2="Insert into studetail(sname,regno,gender,dept,phno,batch,photo)values (?,?,?,?,?,?,?)";
PreparedStatement pst1 = con.prepareStatement(sql2);
pst1.setString(1,sname);
pst1.setString(2,regno);
pst1.setString(3,gender);
pst1.setString(4,dept);
pst1.setString(5,phno);
pst1.setString(6,batch);
File file1=new File(imagepath);
FileInputStream fs= new FileInputStream(file1);
pst1.setBinaryStream(7,fs,(int)file1.length());
int row2=pst1.executeUpdate();

if(row2>0){
JOptionPane.showMessageDialog(f, "your details saved successfully!!");

}

}
catch (Exception e) {
        JOptionPane.showMessageDialog(f,"Error:" +e.getMessage());
    }
}
}
/****************************************staff detail*********************/
void sdetails(){
String sname=tf8.getText();
String sid=tf9.getText();
String gender = "";
if (r3.isSelected()) {
    gender = "Male";
} else if (r4.isSelected()) {
    gender = "Female";
}
String phno=tf10.getText();
String lagn=(String) cb3.getSelectedItem();

if(sname.equals("")||sid.equals("")||phno.equals("")){
JOptionPane.showMessageDialog(f, "all fields are required!");
return;
}
if(phno.length()>10 || phno.length()<10){
JOptionPane.showMessageDialog(f, "enter valid phone number");
}
else if(phno.length()==10){
try{
String sql2="Insert into staff(sname,sid,gender,lagn,phno)values (?,?,?,?,?)";
PreparedStatement pst1 = con.prepareStatement(sql2);
pst1.setString(1,sname);
pst1.setString(2,sid);
pst1.setString(3,gender);
pst1.setString(4,lagn);
pst1.setString(5,phno);

int row2=pst1.executeUpdate();

if(row2>0){
JOptionPane.showMessageDialog(f, "your details saved successfully!!");

}

}
catch (Exception e) {
        JOptionPane.showMessageDialog(f,"Error:" +e.getMessage());
    }
}
}


void homework1(){
try{
String sql1="Select * from studetail";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql1);
dm.setRowCount(0);
while(rs.next()){

Object[] row1=new Object[8];
for(int i=1;i<=7;i++){
row1[i-1]=rs.getObject(i);
}
dm.addRow(row1);
}
}catch(Exception e)
{
e.getStackTrace();
}
}

void homework2(){
try{
String sql1="Select * from staff";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql1);

dm1.setRowCount(0);
 
while(rs.next()){
Object[] row10=new Object[6];
for(int i=1;i<=5;i++){
row10[i-1]=rs.getObject(i);
}
dm1.addRow(row10);
}
}catch(Exception e)
{
e.getStackTrace();
}
}



void searchdetail() {
try {
String sf = tf11.getText(); 
String sql2 = "select * from studetail where sname='"+sf+"'";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql2);
dm.setRowCount(0); // clear previous table data
while (rs.next()) {
Object[] row1 = new Object[8]; 
for (int i = 1; i <= 7; i++) {
row1[i - 1] = rs.getObject(i);
}
dm.addRow(row1); 
}
} catch (Exception e) {
e.printStackTrace();
}
}

void searchdetail1() {
try {
String sf = tf11.getText(); 
String sql2 = "select * from staff where sname='"+sf+"'";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql2);
dm1.setRowCount(0); // clear previous table data
while (rs.next()) {
Object[] row10 = new Object[6]; 
for (int i = 1; i <= 5; i++) {
row10[i - 1] = rs.getObject(i);
}
dm1.addRow(row10); 
}
} catch (Exception e) {
e.printStackTrace();
}
}



void sortbysub() {
try {
String sql = "SELECT * FROM studetail ORDER BY LOWER(sname)";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
dm.setRowCount(0); 
while (rs.next()) {
Object[] row1 = new Object[8];
for (int i = 1; i <= 7; i++) {
row1[i - 1] = rs.getObject(i);
}
dm.addRow(row1);
}
} catch (Exception e) {
e.printStackTrace();
}
}

void sort1() {
try {
String sql = "SELECT * FROM staff ORDER BY LOWER(sname)";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
dm1.setRowCount(0); 
while (rs.next()) {
Object[] row10 = new Object[6];
for (int i = 1; i <= 5; i++) {
row10[i - 1] = rs.getObject(i);
}
dm1.addRow(row10);
}
} catch (Exception e) {
e.printStackTrace();
}
}

void del()
{
try{
int selectrow=jt.getSelectedRow();
Statement st = con.createStatement();
if(selectrow!=-1)
{
Object val1=dm.getValueAt(selectrow,0);
String sqld="delete from studetail where sname='"+val1+"'"; 

int dset=st.executeUpdate(sqld); 
dm.removeRow(selectrow);
}
else{
JOptionPane.showMessageDialog(null, "rows are not selected.");
}}catch(Exception e)
{
e.printStackTrace();
}
}

void del1()
{
try{
int selectrow=jt.getSelectedRow();
Statement st = con.createStatement();
if(selectrow!=-1)
{
Object val1=dm1.getValueAt(selectrow,0);
String sqld="delete from studetail where sname='"+val1+"'"; 

int dset=st.executeUpdate(sqld); 
dm1.removeRow(selectrow);
}
else{
JOptionPane.showMessageDialog(null, "rows are not selected.");
}}catch(Exception e)
{
e.printStackTrace();
}
}


/***********************************************************viewing photo********************************/
void photoview(){
try{
int selectrow1=jt.getSelectedRow();
Statement st=con.createStatement();
if(selectrow1!=-1)
{
val2=dm.getValueAt(selectrow1,0);

String sqlv="Select photo from studetail where sname='"+val2+"'";
ResultSet rs1=st.executeQuery(sqlv);
if(rs1.next()){
Blob blob=rs1.getBlob("photo");
InputStream is=blob.getBinaryStream();
ByteArrayOutputStream os= new ByteArrayOutputStream();
byte[] buffer=new byte[4096];
int bnum=-1;
while((bnum=is.read(buffer))!=-1){
os.write(buffer,0,bnum);
}
byte[] buffer2=os.toByteArray();
img20=new ImageIcon(buffer2);
}
}
JOptionPane.showMessageDialog(null,"",val2+" Photo View",JOptionPane.INFORMATION_MESSAGE,img20);
}
catch(Exception e)
{
e.printStackTrace();
}
}

public static void main(String[] arg) 
{
new test10();
}
}

package Lessons_Java_Start;

//Урок по Java 96: Swing 1: HelloWorld
//https://www.youtube.com/watch?v=VsVw5ow8Ynw&index=98&list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX
//Урок по Java 97: Swing 2: JComponent
//https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&index=99
//How to add an image to a JPanel?
//https://stackoverflow.com/questions/299495/how-to-add-an-image-to-a-jpanel
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class TestForm {


    public static void main(String[] args) {
JFrame jFrame = getFrame();

jFrame.add(new MyComponent());
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo info : infos) {
            System.out.println(info.getName());
            System.out.println(info.getClassName());
        }

    }

    static class MyComponent extends JComponent {
        private BufferedImage image3;
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Rockwell Extra Bold", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("Hello world", 50, 50);
            Point2D p1 = new Point2D.Double(275, 20);
            Point2D p2 = new Point2D.Double(145, 150);
            Point2D p3 = new Point2D.Double(200, 175);
            Point2D p4 = new Point2D.Double(278, 258);

            Line2D l2 = new Line2D.Double(70, 70, 190, 190);
            Line2D l3 = new Line2D.Double(p1, p2);
            Line2D l4 = new Line2D.Double(p2, p3);
            Line2D l5 = new Line2D.Double(p3, p4);
            Color color = new Color(255, 25, 2);
            g2.setColor(color);
            g2.draw(l2);
            g2.draw(l3);
            g2.draw(l4);
            g2.draw(l5);
            Ellipse2D el = new Ellipse2D.Double(70, 70, 270, 170);
            g2.setPaint(new Color(120, 15, 63));
            g2.draw(el);
//            g2.fill(el);
            Rectangle2D r2 = new Rectangle2D.Double(70, 70, 190, 190);
            g2.draw(r2);
            Rectangle2D r3 = new Rectangle2D.Double();
            r3.setFrameFromDiagonal(p1, p2);
            g2.draw(r3);
            Ellipse2D el2 = new Ellipse2D.Double();
            el2.setFrameFromDiagonal(p1, p2);
            g2.draw(el2);
            try {
                URL url = new URL("https://docs.oracle.com/javase/10/dcommon/img/1-java.png");
                Image image = new ImageIcon(url).getImage();

                g2.drawImage(image, 220, 150, null);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }




                Image image2 = new ImageIcon("D:\\UniverInfopulse\\JAVA\\eclipse-workspace\\Java_Start\\src\\images\\java.png").getImage();
//            try {
////                image3 = ImageIO.read(new File("images/buildJava.jpg")); //относительный путь не сработал
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            g2.drawImage(image2, 220, 275, null);
            g2.drawImage(image3, 10, 15, null);

        }
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 150, dimension.height / 2 - 150, 600, 600);
        jFrame.setTitle("My app");
        return jFrame;
    }
}

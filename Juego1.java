import javax.swing.*;
import javax.tools.JavaFileObject.Kind;

import java.awt.*;
import java.awt.event.*;


//dos elementos muy sencillos, controlar uno de ellos por medio de teclado
public class Juego1 extends JFrame
{
    private Player player;
    private GameObject[] objects;
    private int collectedObjects = 0;

    public Juego1()
    {
        setTitle("JUEGO1");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        player = new Player(50,50);

        objects = new GameObject[3];
        objects[0] = new GameObject(200,200);
        objects[1] = new GameObject(100,100);
        objects[2] = new GameObject(300,300);

        JPanel panel = new JPanel()
        {
            //@Override
            protected void paintComponent(Graphics g)
            {
                super.paiintComponent(g);
                draw(g);

            }
        };

        panel.setFocusable(true);
        panel.addKeyListener(new KeyAdapter() {
            public void KeyPressed(KeyEvent e)
            {
                player.move(e.getKeyCode());
                checkCollision();
                panel.repaint();
            }
        });
        
        add(panel);
    }

}
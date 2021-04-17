package com.game.tank;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: Eason
 * @Date: 2021/4/17 10:49 下午
 */
public class TankFrame extends Frame {

    private static final Integer GAME_WIDTH = 400;
    private static final Integer GAME_HEIGHT = 600;

    public TankFrame(){
        setVisible(true);
        setTitle("坦克大战游戏");
        setResizable(false);
        setSize(GAME_WIDTH,GAME_HEIGHT);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("window closed");
                System.exit(0);
            }
        });

        addKeyListener(new MyKeyListener());


    }

    Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        // repaint函数调用的时候会触发update执行
        if(offScreenImage==null){
            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);
        }
        Graphics goffScrean = offScreenImage.getGraphics();
        paint(goffScrean);
    }

    @Override
    public void paint(Graphics g){

        g.setColor(new Color(0,0,0));
        g.fillRect(100,100,20,20);
    }

    private class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased-"+e.getKeyCode());
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:

                    break;
                case KeyEvent.VK_RIGHT:

                    break;
                case KeyEvent.VK_UP:

                    break;
                case KeyEvent.VK_DOWN:

                    break;
                default:
                    break;
            }
        }
    }

}


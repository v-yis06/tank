package com.game.tank;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TankApplication {

    public static void main(String[] args) {
        TankFrame frame = new TankFrame();

        Thread t = new Thread(()->{
            while (true){
                try {
                    Thread.sleep(50);
                    frame.repaint();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

    }

}

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel{

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * 5/9);
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    Thread gameThread; //since were implementing the runnable interface
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;


    public GamePanel(){

    }

    //create a new ball on the screen
    //call this method whenever we want to reset a level
    public void newBall() {

    }

    //create a new paddles on the screen
    //call this method whenever we want to reset a new level
    public void newPaddles() {

    }

    public void paint(Graphics g) {

    }

    //
    public void draw(Graphics g) {

    }


    //move things after each iteration of the game loo[
    public void move() {

    }

    public void checkCollision() {

    }

    public void run() {

    }

    //action listener
    public class AL extends KeyAdapter{

        public void keyPressed(KeyEvent e) {

        }
        public void keyReleased(KeyEvent e) {

        }
    }
}

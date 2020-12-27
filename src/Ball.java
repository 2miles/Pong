import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ball extends Rectangle{

    Random random;
    int xVelocity;  //how fast the ball is going to move along the x axis
    int yVelocity;  //how fast the ball is going to move along the y axis
    int initialSpeed = 2;


    public Ball(int x, int y, int width, int height) {
        super(x,y,width, height);
        random = new Random();
        int randomXDirection = random.nextInt(2); //either 0 or 1
        if(randomXDirection == 0)
            --randomXDirection;
        setXDirection(randomXDirection * initialSpeed);

        int randomYDirection = random.nextInt(2); //either 0 or 1
        if(randomYDirection == 0)
            --randomYDirection;
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move () {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, height, width);
    }
}

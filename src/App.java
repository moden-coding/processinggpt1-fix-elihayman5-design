import processing.core.*;
import processing.core.PApplet;

public class App extends PApplet {
    float circleX;
    float circleY = 50;
    float circleSize = 70;
    float velocity = 0;
    float acceleration = 0.3f;

    int rect1x = 50;
    int rect1y = 300;
    int rectW = 350;
    int rectH = 30;

    // determines when the circle touches the squares

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {

        size(1000, 1500);
    }

    public void setup() {
        background(5, 0, 0);

    }

    // }

    public void draw() {
        background(255);

        // gravity code
        velocity += acceleration;
        circleY += velocity;
        acceleration = 2f;
        velocity = .02f;

        fill(0, 255, 0);
        rect(rect1x, rect1y, rectW, rectH);

        // collision part
        if (circleOverlapsrect(circleX, circleY, circleSize, rect1x, rect1y, rectW, rectH)) {
            velocity = 0;
            circleY = rect1y - circleSize / 2;
        }
        fill(0, 255, 0);
        rect(500, 300, 500, 30);
        fill(0, 255, 0);
        rect(0, 450, 250, 30);
        fill(0, 255, 0);
        rect(355, 450, 250, 30);
        fill(0, 255, 0);
        rect(0, 600, 300, 30);
        fill(0, 255, 0);
        rect(400, 600, 450, 30);
        fill(0, 255, 0);
        rect(0, 800, 650, 30);

        fill(0, 0, 215);
        circleX = mouseX;
        circle(mouseX, circleY, circleSize);

        if (circleY > 900) {
            circleY = 50;
        }
    }

    boolean circleOverlapsrect(float circleX, float circleY, float cr, float rx, float ry, float rw, float rh) {
        float closestX = constrain(circleX, rect1x, rect1x + rectW);
        float closestY = constrain(circleY, rect1y, rect1y + rectH);
        float distance = dist(circleX, circleY, closestX, closestY);
        return distance < cr / 2;

    }

}
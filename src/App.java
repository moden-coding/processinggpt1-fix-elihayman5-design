import processing.core.*;
import processing.core.PApplet;

// public class App extends PApplet {

//     public static void main(String[] args) {
//         PApplet.main("App");
//     }

//     public void settings() {
//         size(1000, 1000); // Set window size to 800x600
//     }

//     public void setup() {
//         background(200); // Light gray background (0 = black, 255 = white)
//     }

//     public void draw() {
//         // Your drawing code can go here
//     }
// }import processing.core.PApplet;

public class App extends PApplet {
    float circleX = 400;
    float circleY = 200;
    float circleSize = 70;
    float velocity;
    float acceleration;
     int rect1x=0;
     int rect1y=300;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        acceleration = .02f;
        velocity = .02f;
        size(1000, 3000); // Set window size to 800x600
    }

    public void setup() {
        background(5, 0, 0); // Redbackground

    }

    // public void draw() {
    // fill(0, 0, 255);
    // stroke(0);
    // strokeWeight(5);
    // ellipse(100,75, 150, 50); // x, y, width, height
    // fill(0, 255, 0);
    // rect(100, 150, 200, 100);
    // fill(255,0,0);
    // triangle(100,150, 700, 200, 500,400);

    // }

    public void draw() {
        background(255);
        velocity += acceleration;

        circleY += velocity;
        if (circleY >= 700) {
            circleY = 700;
            velocity = 0;
        }
        fill(0,0,215);
        circle(mouseX, circleY, circleSize);
        if(circleY > rect1y) {
             
        }

        

        fill(0, 0, 200); // Clear the screen each frame
        // ellipse(mouseX, 150, 70, 70);
        fill(0, 255, 0);
        rect(0, 300, 350, 30);
        // fill(0, 255, 0);
        // rect(500, 300, 500, 30);
        // fill(0, 255, 0);
        // rect(0, 450, 250, 30);
        // fill(0, 255, 0);
        // rect(355, 450, 250, 30);
        // fill(0, 255, 0);
        // rect(0, 600, 300, 30);
        // fill(0, 255, 0);
        // rect(400, 600, 450, 30);
        // fill(0, 255, 0);
        // rect(0, 800, 650, 30);

        // Draws a circle that follows the mouse
    }

    // Draw the triangle with the given vertices

    // x, y, width, height
    // Your drawing code can go here
}

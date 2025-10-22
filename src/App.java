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
    


    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        acceleration = .1f;
        velocity = .1f;
        size(1000, 1000); // Set window size to 800x600
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

        circle(circleX, circleY, circleSize);
        
        
        

        fill(0, 0, 200); // Clear the screen each frame
        // ellipse(mouseX, 150, 70, 70);
        fill(0, 255, 0);
        rect(0, 200, 350, 30);
        fill(0, 255, 0);
        rect(500, 200, 500, 30);
        fill(0, 255, 0);
        rect(0, 350, 250, 30);
        fill(0, 255, 0);
        rect(355, 350, 250, 30);
        fill(0, 255, 0);
        rect(0, 500, 300, 30);
        fill(0, 255, 0);
        rect(400, 500, 450, 30);
        fill(0, 255, 0);
        rect(0, 700, 650, 30);

        // Draws a circle that follows the mouse
    }

    // Draw the triangle with the given vertices

    // x, y, width, height
    // Your drawing code can go here
}

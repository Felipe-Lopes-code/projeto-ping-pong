package projeto.pong.cena;

import com.jogamp.opengl.GL2;
/**
 *
 * @author Kakugawa
 */
public class Barra {
    private double rX;
    private double rY;

    public double getrX() {
        return rX;
    }

    public void setrX(double rX) {
        this.rX = rX;
    }

    public double getrY() {
        return rY;
    }

    public void setrY(double rY) {
        this.rY = rY;
    }
    
    public Barra(double rX){
        this.rX = rX;
        this.rY = rX;
    }
    
    public Barra(double rX, double rY){
        this.rX = rX;
        this.rY = rY;
    }

    public void draw(GL2 gl) {
        gl.glBegin(GL2.GL_POLYGON);
            gl.glVertex2f(-0.3f, -1);
            gl.glVertex2f(-0.3f, -0.95f);
            gl.glVertex2f(0.3f, -0.95f);
            gl.glVertex2f(0.3f, -1);
            gl.glVertex2f(-0.3f, -1);
        gl.glEnd();
            
        gl.glEnd();
    }
}

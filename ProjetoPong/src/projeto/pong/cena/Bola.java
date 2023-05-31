package projeto.pong.cena;

import com.jogamp.opengl.GL2;
/**
 *
 * @author Kakugawa
 */
public class Bola {
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
    
    public Bola(double rX){
        this.rX = rX;
        this.rY = rX;
    }
    
    public Bola(double rX, double rY){
        this.rX = rX;
        this.rY = rY;
    }

    public void draw(GL2 gl) {
        //Para 1/2 circulo: Math.PI
        double limite = 2 * Math.PI;
        double i, cX = 0, cY = 0;

        gl.glBegin(GL2.GL_POLYGON);
            for (i = 0; i < limite; i += 0.01) {
                gl.glVertex2d(cX + rX * Math.cos(i),
                        cY + rY * Math.sin(i));
            }
        gl.glEnd();
    }
}

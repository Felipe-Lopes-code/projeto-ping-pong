package projeto.pong.input;
import projeto.pong.cena.Cena;
import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
/**
 *
 * @author Kakugawa
 */
public class KeyBoard implements KeyListener{
    private Cena cena;
    private static final int setaCima = 150;
    private static final int setaBaixo = 152;
    
    public KeyBoard(Cena cena){
        this.cena = cena;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {        
        System.out.println("Key pressed: " + e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            System.exit(0);
        /***
        if(e.getKeyChar() == 'a')
            System.out.println("Pressionou tecla a");
        
         if(e.getKeyChar() == 'A')
            cena.setAnguloZ(cena.getAnguloZ() - 15);
        if(e.getKeyChar() == 'a')
            cena.setAnguloZ(cena.getAnguloZ() + 15);

        if(e.getKeyCode() == setaCima){
            System.out.println("SETA PARA CIMA");
            cena.setAnguloZ(cena.getAnguloZ() - 15);
        }
        if(e.getKeyCode() == setaBaixo){
            System.out.println("para baixo");
            cena.setAnguloZ(cena.getAnguloZ() + 15);
        }
        ***/
        if(e.getKeyChar() == 'a')
            cena.setAnguloX(cena.getAnguloX() - 0.05f);
        if(e.getKeyChar() == 'd')
            cena.setAnguloX(cena.getAnguloX() + 0.05f);
        
    }

    @Override
    public void keyReleased(KeyEvent e) { }

}

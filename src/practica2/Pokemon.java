
package practica2;
import javax.swing.*;

public class Pokemon extends Thread{
    private Personajes pokemon1;
    private Personajes pokemon2;
    private JTextPane bitacora;
    
    public Pokemon(Personajes pokemon1, Personajes pokemon2, JTextPane bitacora){
    this.pokemon1 = pokemon1;
    this.pokemon2= pokemon2;
    this.bitacora = bitacora;
    }
    
    @Override
    public void run(){
        while(pokemon1.getHp()>0 && pokemon2.getHp()>0){
            try{
                Thread.sleep(100 /pokemon1.getVelocidad());
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            int dano = pokemon1.getAtaque() - pokemon2.getDefensa();
            if (dano<0 )dano = 0;
            
            pokemon2.setHp(pokemon2.getHp()-dano);
            
            String mensaje = pokemon1.getNombre()+"Ataca a "+pokemon2.getNombre()
                    +"Causandole "+dano+"de daño "+"Hp restante: "+pokemon2.getNombre()
                    +" "+pokemon2.getHp();
            
            SwingUtilities.invokeLater(()->{
                bitacora.setText(bitacora.getText()+mensaje);
        });
        }
        
        if(pokemon2.getHp()<=0 || pokemon1.getHp()<=0){
            SwingUtilities.invokeLater(()->{
                bitacora.setText(bitacora.getText()+pokemon2.getNombre());
            });
    }
    }
}

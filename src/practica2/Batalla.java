
package practica2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Batalla {
    private int numero;
    private String personaje1;
    private String personaje2;
    private String ganador;
    private String fecha;
    
    public Batalla(int numero, String personaje1, String personaje2, String ganador, String fecha){
        this.numero = numero;
        this.personaje1 =personaje1;
        this.personaje2 = personaje2;
        this.ganador = ganador;
    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.fecha = LocalDateTime.now().format(dtf);
    }

    Batalla(int i, String personaje1, String personaje2, String ganador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getHistorial(){
        return "Numero de Batalla: "+ numero+
                "Fecha: "+fecha+
                "Participantes: "+personaje1 + "Vs "+personaje2+
                "Ganador"+ganador;
    }
          
    
}

//https://github.com/antwonio2/IPC1_Practica2_202100285.git

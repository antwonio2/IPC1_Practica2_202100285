
package practica2;
import javax.swing.JOptionPane;

public class Gestor {
    private Personajes[] personajes = new Personajes[100];
    private int total = 0;
    private Batalla[] batallas= new Batalla[100];
    private int totalBatallas = 0;

    public void agregarPokemon(String nombre, String arma, int hp, int ataque, int velocidad, int agilidad, int defensa){
    if (total>=personajes.length){
        JOptionPane.showMessageDialog(null, "No se pueden agregar mas Pokemones");
        return;
    }
       
    for (int i=0; i<total; i++){
        if(personajes[i].getNombre().equalsIgnoreCase(nombre)){
            JOptionPane.showMessageDialog(null, "El HP debe estar entre 100 y 500.");
            return;
        }
    }
   if (ataque < 10 || ataque > 100) {
        JOptionPane.showMessageDialog(null, "El ataque debe estar entre 10 y 100.");
        return;
    }

    if (velocidad < 1 || velocidad > 10) {
        JOptionPane.showMessageDialog(null, "La velocidad debe estar entre 1 y 10.");
        return;
    }

    if (agilidad < 1 || agilidad > 10) {
        JOptionPane.showMessageDialog(null, "La agilidad debe estar entre 1 y 10.");
        return;
    }

    if (defensa < 1 || defensa > 50) {
        JOptionPane.showMessageDialog(null, "La defensa debe estar entre 1 y 50.");
        return;
    }

    
    int id = total + 1;
    personajes[total] = new Personajes(id, nombre, arma, hp, ataque, velocidad, agilidad, defensa);
    total++;

    JOptionPane.showMessageDialog(null, "Pokémon agregado con éxito: " + nombre);
}
    
    public Personajes buscarId(int id){
        for(int i =0;i<total; i++){
            if(personajes[i].getId()==id){
                return personajes[i];
            }
        }
        return null;
    }
    public boolean eliminarPokemon(int id){
        for (int i=0; i<total; i++){
            if(personajes[i].getId()== id){
                for(int j = i; j<total -1;j++){
                    personajes[j]= personajes[j+1];
                }
                personajes[total-1]=null;
                total--;
                return true;
            }
        }
        return false;
    }
    //visualizacion en el textpane
    public String listarPokemones(){
        if (total ==0){ return"No hay pokemones guardados";
        }  
    
    String lista = " ";
    for (int i =0; i<total; i++){
        Personajes p = personajes[i];
        
         lista = lista + "ID: " + p.getId()
                     + " | Nombre: " + p.getNombre()
                     + " | Arma: " + p.getArma()
                     + " | HP: " + p.getHp()
                     + " | Ataque: " + p.getAtaque()
                     + " | Velocidad: " + p.getVelocidad()
                     + " | Agilidad: " + p.getAgilidad()
                     + " | Defensa: " + p.getDefensa();
    }
    return lista;
    }

    public void registrarBatalla(String personaje1, String personaje2, String ganador) {
        if (totalBatallas >= batallas.length) {
        JOptionPane.showMessageDialog(null, "No se pueden registrar más batallas");
        return;
}

        batallas[totalBatallas] = new Batalla(totalBatallas + 1, personaje1, personaje2, ganador);
        totalBatallas++;
    }
    
    public String listarBatallas(){
        if (totalBatallas ==0){
            return "No hay batallas registradas";
        }
        String historial ="";
        for (int i =0; i<totalBatallas; i++){
            historial+=batallas[i].getHistorial();
        }
        return historial;
}
    
    public Personajes getPersonaje(int index) {
    if (index >= 0 && index < total) {
        return personajes[index];
    }
    return null;
}

    public int getTotal(){return total;}
    public Personajes[] getPersonajes(){return personajes;}
}

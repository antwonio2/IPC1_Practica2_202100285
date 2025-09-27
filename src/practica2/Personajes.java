
package practica2;

public class Personajes {
    private int id;
    private String nombre;
    private String arma;
    private int hp;
    private int ataque;
    private int velocidad;
    private int agilidad;
    private int defensa;
            
    public Personajes(int id, String nombre, String arma, int hp, int ataque, int velocidad, int agilidad, int defensa){
    this.id = id;
    this.nombre = nombre;
    this.arma = arma; 
    this.hp = hp;
    this.ataque = ataque;
    this.velocidad = velocidad;
    this.agilidad = agilidad;
    this.defensa = defensa;
    }
    
    public int getId() {
    return id;}
    
    public String getNombre(){
    return nombre;}
    
    public String getArma(){
    return arma;}
    
    public int getHp(){
    return hp;}
    
    public int getAtaque(){
    return ataque;}
    
    public int getVelocidad(){
    return velocidad;}
    
    public int getAgilidad(){
    return agilidad;}
    
    public int getDefensa(){
    return defensa;}
    
    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public void setArma(String arma) {
        this.arma = arma;}

    public void setHp(int hp) {
        this.hp = hp;}

    public void setAtaque(int ataque) {
        this.ataque = ataque;}

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;}

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;}

    public void setDefensa(int defensa) {
        this.defensa = defensa;}
    
}

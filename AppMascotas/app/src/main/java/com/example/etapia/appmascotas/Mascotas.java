package com.example.etapia.appmascotas;

/**
 * Created by Etapia on 25/11/2016.
 */

public class Mascotas {
    private String nombre;
    private int contador;
    private int foto;

   public Mascotas ( String nombre, int contador, int foto){
       this.nombre = nombre;
       this.contador = contador;
       this.foto = foto;
   }

    public String getNombre(){return nombre;}
    public void setNombre( String nombre){this.nombre = nombre;}

    public int getContador(){return contador;}
    public void setContador( int contador){this.contador = contador;}

    public int getFoto() {return foto;}
    public void setFoto(int foto) {this.foto = foto;}

}

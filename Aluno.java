package com.mycompany.programacaoorientadaaobjetos;

public class Aluno {
    
    //Atributos
    private String nome;
    private float media;
    
    //Métodos
    public boolean verificarMedia(float mediaGeral){
        if(media >= mediaGeral)
            return true;
        else
            return false;
    }
    
    public void  setNome(String n){
        nome = n;     
    }
    
    public String getNome(){
        return nome;
    }
    
    public void  setMedia(float m){
        media = m;     
    }
    
    public float getMedia(){
        return media;
    }
}

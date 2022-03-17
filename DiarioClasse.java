package com.mycompany.programacaoorientadaaobjetos;
import java.util.Scanner;
public class DiarioClasse {
    
    Scanner input = new Scanner(System.in);
        String nomeCurso, nomeProfessor;
        
        
        System.out.println("digite nome do curso: ");
        nomeCurso = input.nextLine();
        System.out.println("digite nome do professor: ");
        nomeProfessor = input.nextLine();
        
       
        System.out.println(apresentaMensagem + "Nome do curso: " + "Nome do professor: ");
    
    
    
    //Métodos set e get
    public void setValor(float valor){
         this.valor = valor;
        this.conta = conta;
    }

    public float getValor() {
        return valor;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    
    //Demais métodos
    
    public void credita(float valorCredito) {
        this.valor = this.valor + valorCredito;
    }
    
    public void debita(float valorDebito){
        this.valor = this.valor + valorDebito;
    }
    
    public float consultaSaldo(){
        return valor;
    }
    
}

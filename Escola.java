package com.mycompany.programacaoorientadaaobjetos;

import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nomeDigitado;
        
        Aluno a1 = new Aluno();
        System.out.println("digite seu nome: ");
        nomeDigitado = input.nextLine();
        
        
        a1.setNome(nomeDigitado);
        System.out.println("Nome do usuário: " + a1.getNome());
        
        
        
        
    }
    
}

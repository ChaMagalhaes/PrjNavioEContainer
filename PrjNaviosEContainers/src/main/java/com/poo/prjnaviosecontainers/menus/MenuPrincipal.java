package com.poo.prjnaviosecontainers.menus;

import java.util.Scanner;

/**
 *
 * @author Charles
 */
public class MenuPrincipal {
    
    public void mostrarMenuPrincipal(){
        
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        while(opcao != 0){
            System.out.println("==========MENU==========");
            System.out.println("1 - Acessar dados container");
            System.out.println("2- Acessar dados Navio");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1 -> MenuDadosContainer;
                case 2 -> MenuDadosNavio;
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opcao invalida.");
            }
        }
        scanner.close();
    }
}

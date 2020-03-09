/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticaconjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aluno
 */
public class PraticaConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Conjuntos sem repetição
        */
        
        //Set<String> nomes = new HashSet<String>();
        //Set<String> nomes = new LinkedHashSet<String>();
        Set<String> nomes = new TreeSet<String>();
        
        nomes.add("Fulano");
        nomes.add("Sicrano");
        nomes.add("Beltrano");
        
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criararvore;
import arvoreAvl.ArvoreAvl;

/**
 *
 * @author Matheus HS
 */
public class CriarArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreAvl arvoreAvl = new ArvoreAvl();
        
        arvoreAvl.inserir(100);
        arvoreAvl.inserir(90);
        
        System.out.println(arvoreAvl.raiz.getChave());
        System.out.println(arvoreAvl.raiz.getFilhoE().getChave());
    }
    
}

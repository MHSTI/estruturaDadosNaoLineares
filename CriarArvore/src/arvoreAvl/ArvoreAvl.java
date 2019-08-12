/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreAvl;

/**
 *
 * @author Matheus HS
 */
public class ArvoreAvl {
    
    public NoAvl raiz;
    
    public void inserir(int valor){
        
        NoAvl no = new NoAvl(valor);
        inserirNo(this.raiz, no);
    }
        
    private void inserirNo(NoAvl noComparado, NoAvl noInserido){
        
        //se a árvore estiver vazia, "comparar" vira o nó raiz;
        if (noComparado == null){
            this.raiz = noInserido;
        }
  
        else{
            //se o nó inserido for menor que o nó comparado, ele vai pra esquerda;
            if(noComparado.getChave() > noInserido.getChave()){
                //se o nó for folha;
                if(noComparado.getFilhoE() == null){
                    //define como filho esquerdo;
                    noComparado.setFilhoE(noInserido);
                    noInserido.setPai(noComparado);
                    analisarFatorB(noComparado);
                }
                //se não for folha;
                else{
                    //analisa o próximo nó;
                    inserirNo(noComparado.getFilhoE(), noInserido);
                }
            }
            //Senão, o nó inserido vai pra direita;
            else{
                //se o nó for folha;
                if(noComparado.getFilhoD() == null){
                    //define como filho direito;
                    noComparado.setFilhoD(noInserido);
                    noInserido.setPai(noComparado);
                    analisarFatorB(noComparado);
                }
                else{
                    //analisa o próximo nó;
                    inserirNo(noComparado.getFilhoD(), noInserido);
                }
            }
            
        }
    }

    public void analisarFatorB(NoAvl no){
        
    }
    
    private void setFatorB(NoAvl no){
        no.setFatorB(altura(no.getFilhoD()));
    }
}
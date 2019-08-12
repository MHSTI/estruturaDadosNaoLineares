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
public class NoAvl {
    int chave;
    int fatorB;
    NoAvl pai;
    NoAvl filhoE;
    NoAvl filhoD;
    
    public NoAvl(int chave){
        this.chave = chave;
        this.fatorB = 0;
        setFilhoD(setFilhoE(setPai(null)));
    }
    
    public NoAvl setPai(NoAvl pai){
        this.pai = pai;
        return pai;
    }
    public NoAvl getPai(){
        return this.pai;
    }
    
    public NoAvl setFilhoE(NoAvl filhoE){
        this.filhoE = filhoE;
        return filhoE;
    }
    public NoAvl getFilhoE(){
        return this.filhoE;
    }
    
    public NoAvl setFilhoD(NoAvl filhoD){
        this.filhoD = filhoD;
        return filhoD;
    }
    public NoAvl getFilhoD(){
        return this.filhoD;
    }
    
    public void setFatorB(int fatorB){
        this.fatorB = fatorB;
    }
    public int getFatorB(){
        return this.fatorB;
    }
    
    public void setChave(int chave){
        this.chave = chave;
    }
    public int getChave(){
        return this.chave;
    }
}

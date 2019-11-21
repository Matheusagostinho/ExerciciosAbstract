/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public  abstract class Professores {
    private String nome;

    public Professores(String nome) {
        this.nome = nome;
    }
    
    public abstract double calculaSalarioLiquido();
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
     
     
}

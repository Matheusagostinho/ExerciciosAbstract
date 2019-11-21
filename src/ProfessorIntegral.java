/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class ProfessorIntegral  extends Professores{

    private double salario;
    
    public ProfessorIntegral(String nome, double s) {
        super(nome);
        this.setSalario(s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaSalarioLiquido() {
        return this.getSalario() - this.getSalario()*0.11;
        
    }
    
    
}

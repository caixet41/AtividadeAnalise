/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalvaConversa;

/**
 *
 * @author caixe
 */
public abstract class ProcessaConversa {
    private  void CopiaConversa(){
    
        System.out.println("Copiando a conversa");
    }
    
    private void SalvarConversa(){
        System.out.println("Salvando a conversa");
    }
    
    protected abstract void exportar();
    
    public void constroi(){
         CopiaConversa();
         SalvarConversa();
         exportar();
    
    }
}

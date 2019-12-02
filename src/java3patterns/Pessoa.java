
package java3patterns;


public class Pessoa {
    private  EnviaMensagem enviaMensagem = new ViaSms();
    
    public void SetEnvia(EnviaMensagem novoEnvia){
        this.enviaMensagem =  novoEnvia;
    }
    
    public void envia(){
        enviaMensagem.enviar();
    }
}

import iPhone.IPhone;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello!!");
        
        IPhone iphone7 = new IPhone();

        System.out.println("\nTelefone");
        iphone7.ligar();
        iphone7.atender();
        iphone7.iniciarCorreioVoz();
        
        System.out.println("\nMusica");
        iphone7.selecionarMusica();
        iphone7.tocar();
        iphone7.pausar();

        System.out.println("\nNavegador");
        iphone7.abrirNovaAba();
        iphone7.exibirPagina();
        iphone7.atualizarPagina();
        
    
    }
}

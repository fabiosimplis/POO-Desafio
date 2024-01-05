package iPhone;

import AparelhoTelefone.Telefone;
import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;

public class IPhone implements Telefone, Navegador, ReprodutorMusical{

    @Override
    public void tocar() {
        
        System.out.println("Tocar Musica!!!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Musica!!!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Seleciona Musica!!!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibe Pagina!!!");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abre nova aba no Navegador!!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiza pagina no Navegador!!!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligar Telefone!!!");
    }

    @Override
    public void atender() {
        System.out.println("Atender chamadas!!!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acessar Correio de Voz!!!");
    }
    
}
package DesafioIPhone.Aplicativos.Aplicativos;

import DesafioIPhone.Aplicativos.ApTelefonico.AparelhoTelefonico;
import DesafioIPhone.Aplicativos.NavInternet.NavegadorInternet;
import DesafioIPhone.Aplicativos.RepMusical.ReprodutorMusical;

public class apps implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void reproduzir() {
        System.out.println("Reprodutor Musical");
    }

    public void navegar() {
        System.out.println("Navegador de internet");
    }

    public void falar() {
        System.out.println("Aparelho telefônico");
    }

}

package DesafioIPhone.Celular;

import DesafioIPhone.Aplicativos.ApTelefonico.AparelhoTelefonico;
import DesafioIPhone.Aplicativos.Aplicativos.apps;
import DesafioIPhone.Aplicativos.NavInternet.NavegadorInternet;
import DesafioIPhone.Aplicativos.RepMusical.ReprodutorMusical;

public class CelPhone {
    public static void main(String[] args) {
        apps aplicativos = new apps();

        AparelhoTelefonico ligarFalar = aplicativos;
        ReprodutorMusical ouvirMusica = aplicativos;
        NavegadorInternet sites = aplicativos;

        ligarFalar.falar();
        ouvirMusica.reproduzir();
        sites.navegar();
    }
}

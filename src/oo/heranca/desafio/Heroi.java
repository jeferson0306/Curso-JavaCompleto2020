package oo.heranca.desafio;

public class Heroi extends Jogador {
    boolean atacar(Jogador oponente) {

        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        boolean ataque4 = super.atacar(oponente);
        boolean ataque5 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3 || ataque4 || ataque5;

    }
}



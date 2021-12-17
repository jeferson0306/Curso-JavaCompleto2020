package oo.heranca.desafio;

public class Jogador {

    int vida = 100;
    int x;
    int y;

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            return true;
        } else {
            return false;
        }
    }
    boolean andar(String direcao) {
        if("norte".equalsIgnoreCase(direcao)) {
            y++;
        }
        return true;
    }

}

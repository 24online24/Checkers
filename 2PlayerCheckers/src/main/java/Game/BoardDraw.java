/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import java.awt.Color;
import static Game.MainGame.g;

/**
 *
 * @author rares
 */
public class BoardDraw {

    BoardDraw() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(j * 100, i * 100, 100, 100);
            }
        }
    }

/*
    void startPlayers1() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    g.setColor(Color.RED);
                    g.fillOval(j * 100 + 25, i * 100 + 25, 50, 50);
                }
            }
        }
    }

    void startPlayers2() {
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    g.setColor(Color.WHITE);
                    g.fillOval(j * 100 + 25, i * 100 + 25, 50, 50);
                }
            }
        }
    }*/
}

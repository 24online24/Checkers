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
    
    public void highlight(int x, int y){
            g.setColor(Color.GREEN);
            g.fillRect(x*100, y*100, 100, 100);
    }
}

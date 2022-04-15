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
public class Player {

    boolean team;
    int x, y;
    Color color;

    Player(int x, int y, boolean team) {
        this.x = y * 100 + 25;
        this.y = x * 100 + 25;
        this.team = team;
        if (team) {
            color = Color.RED;
        } else {
            color = Color.WHITE;
        }
        g.setColor(color);
        g.fillOval(this.x, this.y, 50, 50);
    }
}

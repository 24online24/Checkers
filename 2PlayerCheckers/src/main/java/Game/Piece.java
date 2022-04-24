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
abstract class Piece {

    boolean team;
    int x, y;
    Color color;

    public Piece(int x, int y, boolean team) {
        this.x = x * 100 + 50;
        this.y = y * 100 + 50;
        this.team = team;
        if (team) {
            color = Color.RED;
        } else {
            color = Color.GREEN;
        }
    }

    public void draw() {
        g.setColor(color);
        fill();
    }

    public void delete() {
        g.setColor(Color.BLACK);
        fill();
    }

    void fill() {
        g.fillOval(this.x - 25, this.y - 25, 50, 50);
    }

    abstract void move(int x, int y);

    abstract void highlight();

    public void highlightON() {
        g.setColor(color);
        highlight();
    }

    void highlightOFF() {
        g.setColor(Color.BLACK);
        highlight();
    }
}

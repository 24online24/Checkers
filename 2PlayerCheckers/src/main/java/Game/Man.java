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
public class Man extends Piece {

    public Man(int x, int y, boolean team) {
        super(x, y, team);
    }

    @Override
    void move(int x, int y) {
        highlightOFF();
        delete();
        this.x = x * 100 + 50;
        this.y = y * 100 + 50;
        g.setColor(this.color);
        draw();
    }
    
    @Override
    void highlight(){
        
    }
}

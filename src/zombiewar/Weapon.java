/*
 * CSC422 - Summer 2019 
 * Zombie War Group Project
 * Authors: Mike Nelson, Myra Ausherman, Peter Vang, Vishal Barot, Jason Lundquist.
 * 
 */
package zombiewar;

//import java.util.Random;

/**
 *
 * @author mike
 */
public abstract class Weapon {
    private int damage, accuracy;
    
    //default constructor
    Weapon() {
        this.accuracy = 0;
        this.damage = 0;
    }
    //parameterized constructor
    Weapon(int dmg, int acc) {
        this.accuracy = acc;
        this.damage = dmg;
    }
    
    //getters and setters for damage and accuracy
    // no need for name attribute for weapons
    public int getDamage() {
        return damage;
    }
    public void setDamage(int i) {
        this.damage = i;
    }
    
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int i) {
        this.accuracy = i;
    }
}
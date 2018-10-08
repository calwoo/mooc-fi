/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calvi
 */
public class Counter {
    private int count;
    private boolean check;
    public Counter(int startingValue, boolean check) {
        this.count = startingValue;
        this.check = check;
    }
    public Counter(int startingValue) {
        this.count = startingValue;
        this.check = false;
    }
    public Counter(boolean check) {
        this.count = 0;
        this.check = check;
    }
    public Counter() {
        this.count = 0;
        this.check = false;
    }
    
    public int value() {
        return this.count;
    }
    
    public void increase() {
        this.count++;
    }
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.count += increaseAmount;
        }
    }
    
    public void decrease() {
        this.count--;
        if (this.check && (this.count < 0)) {
            this.count = 0;
        }
    }
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.count -= decreaseAmount;
            if (this.check && (this.count < 0)) {
                this.count = 0;
            }
        }
        
    }
}

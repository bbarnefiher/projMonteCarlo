package com.company;
import java.util.*;
public class MonteCarlo {
    int h;
    int k;
    int r;
    double raindropX;
    double raindropY;
    public MonteCarlo(int k, int h, int r){
        this.h = h;
        this.k = k;
        this.r = r;
    }

    public double nextRainDrop_x(){
        Random rand = new Random();
        raindropX = rand.nextDouble() * k;
        return raindropX;
    }

    public double nextRainDrop_y(){
        Random rand = new Random();
        raindropY = rand.nextDouble() * h;
        return raindropY;
    }

    public boolean insideCircle(int x, int y){

        if ((x-h)*(x-h) + (y-k)*(y-k)<=r*r){

            return true;
        }
        else {
            return false;
        }
    }
}

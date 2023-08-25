package org.academiadecodigo.nanderthals.GameCharacters;

import org.academiadecodigo.nanderthals.CollisionDetector;
import org.academiadecodigo.simplegraphics.pictures.Picture;


import java.awt.*;

abstract class Character {

private Picture character;
    public Character() {


    }


    public int getHeight(){
        return character.getHeight();
    }

    public int getHumanCordX(){
        return character.getX();
    }

    public int getHumanCordY(){
        return character.getY();
    }

    public void deletePicture(){
        character.translate(0,-2000);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

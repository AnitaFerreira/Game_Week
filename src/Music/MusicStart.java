package org.academiadecodigo.nanderthals.Music;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
public class MusicStart {


    private Clip clip;

    public void setMusic() {
        try {
            URL audioUrl = getClass().getResource("/Resources/music.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioUrl);

            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void play(){
        clip.start();

    }
    public  void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }
    public void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }




}

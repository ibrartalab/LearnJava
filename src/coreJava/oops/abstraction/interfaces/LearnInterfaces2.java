package coreJava.oops.abstraction.interfaces;

public class LearnInterfaces2 {
    static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Ibrar");
        smartPhone.canTakePicture();
        smartPhone.canRecordAudio();
        smartPhone.canPlayAudio();
        smartPhone.canRecordVideo();
        smartPhone.canPlayVideo();
    }
}
/**
 * With camera component(interface in language terms) is created
 * to achieve taking picture and recording videos of something and anything.
 * But we can't use it alone, so we need to implement all his features(methods)
 * inside smartphone.
 */
interface Camera{
    void canTakePicture();
    void canRecordVideo();
}
/**
 * We also need some sort of audio managment system to add into
 * our smartphone to record and play audios.
 */
interface AudioSystem{
    /**
     * as we know that all methods are public and all properties
     * are public static and final, so we can skip it for speed.
     */
    void canRecordAudio();
    void canPlayAudio();
}
/**
 * Media player may have varied numbers of features(methods) but for now we
 * just define one that playing video.
 */
interface MediaPlayer{
    void canPlayVideo();
}

class SmartPhone implements Camera,AudioSystem,MediaPlayer{
    /**
     * As we all know that a smartphone has several features and those
     * features are actually available in the form of components.
     * So, we need to combine them to get the maximum of user experience from it,
     * For that we need to implement Camera, AudioSystem, and MediaPlayer.
     */
    private final String userName;

    public SmartPhone(String name){
        this.userName = name;
    }

    @Override
    public void canRecordAudio() {
        System.out.printf("%s is recording audio of himself!\n",userName);
    }

    @Override
    public void canPlayAudio() {
        System.out.printf("%s is playing song...!\n",userName);
    }

    @Override
    public void canTakePicture() {
        System.out.printf("%s is taking picture of someone-else.\n",userName);
    }

    @Override
    public void canRecordVideo() {
        System.out.printf("%s is recording a video of someone-else.\n",userName);
    }

    @Override
    public void canPlayVideo(){
        System.out.printf("%s is watching a movie.\n",userName);
    }
}


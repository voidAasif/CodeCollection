package code;

interface gps {
    void homeLocation();
    void workLocation();
}
interface camera {
    void photo();
    void video();
}
interface mediaPlayer {
    void play();
    void pause();

    String[] songList();
}

class cellPhone {
    public void acceptCall(){
        System.out.println("Connectiong...");
    }
    public void endCall(){
        System.out.println("Disconnect");
    }
}

class smartPhone extends cellPhone implements gps, camera, mediaPlayer {
    //gps;
    public void homeLocation(){
        System.out.println("Locating Home");
    }
    public void workLocation(){
        System.out.println("Locating work");
    }

    //camera;
    public void photo(){
        System.out.println("Taking photo");
    }
    public void video(){
        System.out.println("Recording video");
    }

    //mediaPlayer;
    public void play(){
        System.out.println("Playing music");
    }
    public void pause(){
        System.out.println("Pause music");
    }
    public String[] songList(){
        String[] songs = {"abc", "efg", "hij"};
        return songs; 
    }
}


public class j048_practice57 {
    public static void main(String[] args){
        smartPhone sm = new smartPhone(); //can only use smartPhone methods;

        sm.homeLocation(); //gps
        sm.workLocation();

        sm.photo();  //camera
        sm.video();

        sm.play();  //media player
        sm.pause();
        for(String ele: sm.songList()){
            System.out.print(ele);
            System.out.print(", ");
        }
        System.out.println();

        sm.acceptCall();  //cell phone
        sm.endCall();

        //Dynamic Method Dispatch in interface;
        //gps g = new smartPhone(); //can only use gps methods;
        //camera gcam = new smartPhone(); // can only use camera methods;
        //it is like opning a camera app;
    }
}

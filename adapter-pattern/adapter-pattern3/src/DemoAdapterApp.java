import media.*;
public class DemoAdapterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp4", " mp4 song");
		audioPlayer.play("mp3", " mp3 song");
		audioPlayer.play("vlc", " vlc song");
		audioPlayer.play("mgep", " mgep song");
	}

}

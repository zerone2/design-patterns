package adapter;

import advencemedia.AdvenceMediaPlayer;
import advencemedia.Mp4Player;
import advencemedia.VlcPlayer;
import media.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvenceMediaPlayer advenceMediaPlayer;

	public MediaAdapter(String audioType) {
		// TODO Auto-generated constructor stub
		if (audioType.equalsIgnoreCase("vlc"))
			advenceMediaPlayer = new VlcPlayer();

		else if (audioType.equalsIgnoreCase("mp4"))
			advenceMediaPlayer = new Mp4Player();
	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub

		if (audioType.equalsIgnoreCase("vlc"))
			advenceMediaPlayer.playVlc(fileName);

		else if (audioType.equalsIgnoreCase("mp4"))
			advenceMediaPlayer.playMp4(fileName);
	}

}

package com.gmail.andersoninfonet.multimedia;

import android.media.MediaPlayer;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

	private MediaPlayer mp = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		mp = MediaPlayer.create(MainActivity.this, R.raw.bebe_arrota_peida);
		
		/* para buscar arquivo de audio fora da aplicação
		mp = new MediaPlayer();
		try {
			mp.setDataSource("/sdcard/musica.mp3");
			mp.prepare();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		VideoView video = (VideoView) findViewById(R.id.videoView1);
		MediaController mc = new MediaController(this);
		mc.setAnchorView(video);
		video.setMediaController(mc);
		video.setVideoPath("/sdcard/luana.mp4");
		video.start();
		video.pause();
		video.getDuration();
		video.getCurrentPosition();
		
	}


	public void PlayClick(View v){
		mp.start();
	}
	
	public void PauseClick(View v){
		mp.pause();
	}
}

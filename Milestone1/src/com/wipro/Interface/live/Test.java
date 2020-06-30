package com.wipro.Interface.live;

import com.wipro.Interface.music.Playable;
import com.wipro.Interface.music.string.Veena;
import com.wipro.Interface.music.wind.Saxophone;
public class Test {
	public static void main(String[] args) {
		Playable pv=new Veena();
		pv.play();
		Playable ps=new Saxophone();
		ps.play();
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
	}
}

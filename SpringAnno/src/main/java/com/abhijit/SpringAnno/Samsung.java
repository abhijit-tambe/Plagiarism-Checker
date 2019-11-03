package com.abhijit.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	@Qualifier("mediaTek")
	private MobileProcessor mp;
	
	public MobileProcessor getMp() {
		return mp;
	}

	public void setMp(MobileProcessor mp) {
		this.mp = mp;
	}

	public void config()
	{
		System.out.println("Octa core , 4gb ram  ,12mp camera");
		mp.process();
	}
}

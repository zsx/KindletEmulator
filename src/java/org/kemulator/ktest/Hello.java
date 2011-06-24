package org.kemulator.ktest;

import javax.swing.JButton;
//import com.amazon.kindle.kindlet.ui.KButton;

import com.amazon.kindle.kindlet.AbstractKindlet;
import com.amazon.kindle.kindlet.KindletContext;

public class Hello extends AbstractKindlet {
	public void create(KindletContext ctx){
		//KButton button = new KButton("hello");
		JButton button = new JButton("hello");
		ctx.getRootContainer().add(button);
	}
	public void start(){
	}
	public void stop(){
	}
	public void destroy(){
	}
}

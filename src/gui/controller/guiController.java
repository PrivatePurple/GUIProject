package gui.controller;

import gui.model.Duck;
import gui.view.FirstFrame;

public class guiController
{
	private Duck myDuck;
	private FirstFrame appFrame;
	
	public guiController()
	{
		myDuck = new Duck();
		
		appFrame = new FirstFrame(this);
	}

	public void start()
	{
		
	}

}

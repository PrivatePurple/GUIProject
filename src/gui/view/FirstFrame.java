package gui.view;

import javax.swing.JFrame;
import gui.controller.guiController;

public class FirstFrame extends JFrame
{
	private guiController appController;
	private FirstPanel appPanel;
	
	public FirstFrame(guiController appController)
	{
		
		super();
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("My first GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
}

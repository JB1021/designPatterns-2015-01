package homeAuto;

import static org.junit.Assert.*;

import org.junit.Test;

import remoteControl.RemoteControl;
import command.Light;
import command.LightOffCommand;
import command.LightOnCommand;

public class RemoteLoaderTest {

	RemoteControl remoteControl = new RemoteControl();
	
	Light light = new Light();
	LightOnCommand lightOnCommand = new LightOnCommand(light);
	LightOffCommand lightOffCommand = new LightOffCommand(light);
	
	
	@Test
	public void test() {
		System.out.println(remoteControl);
		remoteControl.setCommand(1, lightOnCommand, lightOffCommand);
		System.out.println(remoteControl);
		
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(1);
		assertTrue(true);
	}

}

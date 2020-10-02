import com.ayush.command.impl.LightOffCommand;
import com.ayush.command.impl.LightOnCommand;
import com.ayush.command.impl.StereoOffCommand;
import com.ayush.command.impl.StereoOnWithCd;
import com.ayush.reciever.Light;
import com.ayush.reciever.Stereo;
import com.ayush.remote.controller.RemoteController;

public class TestingRemoteController {
	
	public static void main(String[] args) {
		RemoteController controller = new RemoteController();
		
		Light livingRoomLight = new Light("Living Room"); 
		Light kitchenLight = new Light("Kitchen");
		
		Stereo stereo = new Stereo();
		
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		
		StereoOnWithCd stereoOnCommand = new StereoOnWithCd(stereo);
		StereoOffCommand offCommand = new StereoOffCommand(stereo);
		
		controller.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		controller.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		controller.setCommand(2, stereoOnCommand, offCommand);
		
		
		controller.onButtonPressed(2);
		controller.onButtonPressed(3);
		controller.onButtonPressed(1);
		controller.onButtonPressed(0);
		
		controller.offButtonPressed(3);
		controller.offButtonPressed(0);
		controller.offButtonPressed(2);
		controller.offButtonPressed(1);
	}

}

package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.Victor;

public class Arms {

	private Arms instance;
	public Arms Create() {
		if (instance == null) {
			instance = new Arms();
		}
		return instance;
	}
	private Arms() {
	}
	
	//18-19 declare arm Victors (which I think will always run together)
		Victor arm1 = new Victor(4);
		Victor arm2 = new Victor(6);
		
		
		public void SetArms(double armPower) {
			//24-27 sets min/max wheel power to -1 and 1
					if (armPower > 1) {
						armPower = 1;
					} else if (armPower < -1) {
						armPower = -1;
					}
				//30-31 sets arm motors to right joystick position
					arm1.set(armPower);
					arm2.set(armPower);
		}
		
}

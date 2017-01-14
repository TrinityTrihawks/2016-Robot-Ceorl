package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

public class Wheels {
	
		private Wheels instance;
		public Wheels Create() {
			if (instance == null) {
				instance = new Wheels();
			}
			return instance;
		}
		private Wheels() {
			
		}
	
	//21-24 declare Victors
	Victor flWheel = new Victor(3);
	Victor frWheel = new Victor(0);
	Victor blWheel = new Victor(1);
	Victor brWheel = new Victor(2);
	
	public void SetAllWheels(double wheelPower) {
	//91-94 sets min/max wheel power to -1 and 1
			if (wheelPower > 1) {
				wheelPower = 1;
			} else if (wheelPower < -1) {
				wheelPower = -1;
			}
	//28-31 sets wheels to left joystick position
	flWheel.set(wheelPower);
	frWheel.set(wheelPower);
	blWheel.set(wheelPower);
	brWheel.set(wheelPower);
	}
}

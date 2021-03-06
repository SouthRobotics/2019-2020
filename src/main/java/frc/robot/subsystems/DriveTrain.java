/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.commands.TeleOp;

public class DriveTrain extends SubsystemBase {

  public void initDefaultCommand() 
	{
      setDefaultCommand(new TeleOp());
	}
  public DriveTrain() {
    setDefaultCommand(new TeleOp());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void MoveTeleOp(double leftSpeed, double rightSpeed) {
		Constants.dDrive.tankDrive(leftSpeed, rightSpeed);
	}

}

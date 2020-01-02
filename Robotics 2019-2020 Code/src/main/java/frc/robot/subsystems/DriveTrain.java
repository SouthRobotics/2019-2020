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

  private Talon RMotor1 = new Talon(Constants.RMotor1_Channel);
  private Talon RMotor2 = new Talon(Constants.RMotor2_Channel);
  private Talon RMotor3 = new Talon(Constants.RMotor3_Channel);
  private SpeedControllerGroup RightMotors = new SpeedControllerGroup(RMotor1, RMotor2, RMotor3);

  private Talon LMotor1 = new Talon(Constants.LMotor1_Channel);
  private Talon LMotor2 = new Talon(Constants.LMotor2_Channel);
  private Talon LMotor3 = new Talon(Constants.LMotor3_Channel);
  private SpeedControllerGroup LeftMotors = new SpeedControllerGroup(RMotor1, RMotor2, RMotor3);

  private DifferentialDrive dDrive = new DifferentialDrive(LeftMotors, RightMotors);

  public DriveTrain() {
    setDefaultCommand(new TeleOp(dDrive));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void MoveTeleOp() {

    

  }
}

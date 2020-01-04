/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.commands.TeleOp;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static int teleOpMode = 0;

	public static final int RJoy_PORT = 0;
	public static final int LJoy_PORT = 1;
	public static final int RMotor1_Channel = 0;
	public static final int RMotor2_Channel = 2;
	public static final int RMotor3_Channel = 1;
	public static final int LMotor1_Channel = 14;
	public static final int LMotor2_Channel = 13;
	public static final int LMotor3_Channel = 15;
	public static Talon RMotor1 = new Talon(Constants.RMotor1_Channel);
	public static Talon RMotor2 = new Talon(Constants.RMotor2_Channel);
	public static Talon RMotor3 = new Talon(Constants.RMotor3_Channel);

	public static SpeedControllerGroup RightMotors = new SpeedControllerGroup(RMotor1, RMotor2, RMotor3);

	public static Talon LMotor1 = new Talon(Constants.LMotor1_Channel);
	public static Talon LMotor2 = new Talon(Constants.LMotor2_Channel);
	public static Talon LMotor3 = new Talon(Constants.LMotor3_Channel);
	public static SpeedControllerGroup LeftMotors = new SpeedControllerGroup(LMotor1, LMotor2, LMotor3);

	public static DifferentialDrive dDrive = new DifferentialDrive(LeftMotors, RightMotors);

}

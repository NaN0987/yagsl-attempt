// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

// Subsystems
import frc.robot.subsystems.SwerveSubsystem;
import frc.robot.subsystems.NavSubsystem;

// Commands
import frc.robot.commands.DefaultDrive;

// Constants
import frc.robot.Constants.IOConstants;


import java.util.concurrent.TimeUnit;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  
  private final SwerveSubsystem m_chassisSubsystem = new SwerveSubsystem();

  private final NavSubsystem m_navSubsystem;

  final XboxController m_driverController = new XboxController(IOConstants.kDriverPort);
  
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  public AHRS ahrs;

  double kInitialPitchOffset;
  

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    try {
      ahrs = new AHRS(SPI.Port.kMXP);
      ahrs.enableLogging(true);
    } 
    catch (RuntimeException ex) {
      DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
    }

    //Get the initial pitch of the NavX (Since the robot will be slightly tilted)
    try {
      TimeUnit.SECONDS.sleep(2);
      kInitialPitchOffset = ahrs.getPitch();
    } 
    catch (InterruptedException e) {
      DriverStation.reportError("An error in getting the navX Pitch: " + e.getMessage(), true);
    }

    //Pass NavX and initial pitch into Nav subsystem
    m_navSubsystem = new NavSubsystem(ahrs, kInitialPitchOffset);


    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}

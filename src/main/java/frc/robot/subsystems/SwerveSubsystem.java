package frc.robot.subsystems;

//Motor libraries
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

//Constants
import frc.robot.Constants.ChassisConstants;

//Swerve libraries
import java.io.File;
import edu.wpi.first.wpilibj.Filesystem;
import swervelib.parser.SwerveParser;
import swervelib.SwerveDrive;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveSubsystem extends SubsystemBase {

    File swerveJsonDirectory = new File(Filesystem.getDeployDirectory(),"swerve");
    SwerveDrive swerveDrive  = new SwerveParser(swerveJsonDirectory).createSwerveDrive();


    public SwerveSubsystem(){
        // m_leftFront.restoreFactoryDefaults();
        // m_rightFront.restoreFactoryDefaults();
        // m_rightRear1.restoreFactoryDefaults();
        // m_rightRear2.restoreFactoryDefaults();
        // m_leftRear1.restoreFactoryDefaults();
        // m_leftRear2.restoreFactoryDefaults();

        // m_leftFront.setOpenLoopRampRate(0.25);
        // m_rightFront.setOpenLoopRampRate(0.25);
        // m_rightRear1.setOpenLoopRampRate(0.25);
        // m_rightRear2.setOpenLoopRampRate(0.25);
        // m_leftRear1.setOpenLoopRampRate(0.25);
        // m_leftRear2.setOpenLoopRampRate(0.25);

        // m_leftFront.setSmartCurrentLimit(ChassisConstants.kCurrentLimit);
        // m_rightFront.setSmartCurrentLimit(ChassisConstants.kCurrentLimit);
        // m_rightRear1.setSmartCurrentLimit(ChassisConstants.kCurrentLimit);
        // m_rightRear2.setSmartCurrentLimit(ChassisConstants.kCurrentLimit);
        // m_leftRear1.setSmartCurrentLimit(ChassisConstants.kCurrentLimit);
        // m_leftRear2.setSmartCurrentLimit(ChassisConstants.kCurrentLimit);
        
        // m_leftFront.setIdleMode(IdleMode.kCoast);
        // m_rightFront.setIdleMode(IdleMode.kCoast);
        // m_rightRear1.setIdleMode(IdleMode.kCoast);
        // m_rightRear2.setIdleMode(IdleMode.kCoast);
        // m_leftRear1.setIdleMode(IdleMode.kCoast);
        // m_leftRear2.setIdleMode(IdleMode.kCoast);
        
        // m_leftFront.setInv3erted(false);
        // m_rightFront.setInverted(true);
        // m_leftRear1.setInverted(false);
        // m_leftRear2.setInverted(false);
        // m_rightRear1.setInverted(true);
        // m_rightRear2.setInverted(true);

        // m_leftFront.burnFlash();
        // m_rightFront.burnFlash();
        // m_leftRear1.burnFlash();
        // m_leftRear2.burnFlash();
        // m_rightRear1.burnFlash();
        // m_rightRear2.burnFlash();

        // resetEncoders();

    }

    //This is called every 20ms
    @Override
    public void periodic(){
        // SmartDashboard.putNumber("LF_Speed",m_leftFront.get());
        // SmartDashboard.putNumber("RF_Speed",m_rightFront.get());
        // SmartDashboard.putNumber("RR1_Speed",m_rightRear1.get());
        // SmartDashboard.putNumber("RR2_Speed",m_rightRear2.get());
        // SmartDashboard.putNumber("LR1_Speed",m_leftRear1.get());
        // SmartDashboard.putNumber("LR2_Speed",m_leftRear2.get());
    }
}

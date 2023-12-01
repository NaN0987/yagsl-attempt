// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class ChassisConstants {
        public static final int kLeftFrontDrivePort = 2;
        public static final int kLeftFrontSpinPort = 2;

        public static final int kRightFrontDrivePort = 2;
        public static final int kRightFrontSpinPort = 2;

        public static final int kLeftBackDrivePort = 2;
        public static final int kLeftBackSpinPort = 2;

        public static final int kRightBackDrivePort = 2;
        public static final int kRightBackSpinPort = 2;

        public static final int kCurrentLimit = 40; // 40A current limit for motors 

        //public static final double kdriftOffset = 0; // account for drift when driving straight

        /**
         * NOTE: now some of our motors are connected together in a gear box, while others aren't.
         * If we still want to try to convert motor rotations to actual measurements, then we are 
         * going to have to completely rework this.
         */
        
        public static final double kWheelDiameter = 7.5;
        public static final double kGearRatio = 16.444;
        
        // Wheel diameter * pi / gear ratio
        //public static final double kInchesToRotationsConversionFactor = kWheelDiameter * Math.PI / kGearRatio;
    }
    
    public static final class IOConstants {
        public static final int kDriverPort = 0;
        public static final int kCoDriverPort = 1;
        public static final double kTriggerThreshold = 0.5;
    }
}

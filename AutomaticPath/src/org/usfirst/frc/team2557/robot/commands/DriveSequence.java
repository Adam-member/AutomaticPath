package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveSequence extends CommandGroup {

    public DriveSequence() {
    
//    	addSequential(new AutoDriveCommand(0, -0.7, -101));
RobotMap.backLeft.setEncPosition(0);
    	addSequential(new AutoDriveCommand(-0.4, 0, 600));
   
//    	addSequential(new AutoDriveCommand(0, 0.5, -5));

    
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}

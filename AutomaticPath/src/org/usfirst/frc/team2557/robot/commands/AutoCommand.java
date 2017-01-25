package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoCommand extends Command {

    public AutoCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
   
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.rightDriveEncoder.reset();
    	RobotMap.leftDriveEncoder.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.autoSubsystem.AutoSub();
    	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (RobotMap.rightDriveEncoder.get() <= -500 && RobotMap.leftDriveEncoder.get() <= -500) || Timer.getMatchTime() > 4;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.rightDriveEncoder.reset();
    	RobotMap.leftDriveEncoder.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

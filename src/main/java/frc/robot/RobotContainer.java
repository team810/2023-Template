package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.IO.IO;

public class RobotContainer
{
    public RobotContainer()
    {

        IO.Initialize();
    }

    public Command getAutonomousCommand()
    {

        return null;
    }
}

package org.usfirst.frc.team5414.robot.paths;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Waypoint;
import static org.usfirst.frc.team5414.robot.paths.AutoPathsConstants.DRIVETRAIN_LENGTH;

public class RightSideFarSwitchPaths {

    public static Waypoint[] toSwitch = new Waypoint[]{
            new Waypoint(0.0, 0.0, Pathfinder.d2r(0.0)),
            new Waypoint((4.9784 - DRIVETRAIN_LENGTH) - 1.0, 0.0, Pathfinder.d2r(0.0)),
            new Waypoint((4.9784 - DRIVETRAIN_LENGTH) + 1.0, 0.95, Pathfinder.d2r(90.0)),
            new Waypoint((4.9784 - DRIVETRAIN_LENGTH) + 0.1, 0.9, Pathfinder.d2r(180.0)),
    };

}

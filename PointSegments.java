/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.util.path_finder;
import jaci.pathfinder.Trajectory.Segment;


public class PointSegments {
    public Segment leftPoint, rightPoint;
    public double angle;

    public PointSegments(Segment leftSegments, Segment rightSegments, double angle) {
        this.angle = angle;
        this.leftPoint = leftSegments;
        this.rightPoint = rightSegments;
    }
}

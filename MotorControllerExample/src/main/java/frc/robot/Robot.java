// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TimedRobot;

/**
 * This sample program shows how to control a motor using a joystick. In the operator control part
 * of the program, the joystick is read and the value is written to the motor.
 *
 * <p>Joystick analog values range from -1 to 1 and speed controller inputs also range from -1 to 1
 * making it easy to work together.
 */
public class Robot extends TimedRobot {
  private static final int kMotorPort = 0;
  private static final int kJoystickPort = 0;

  private SpeedController m_motor;
  private Joystick m_joystick;

  @Override
  public void robotInit() {
    m_motor = new PWMVictorSPX(kMotorPort);
    m_joystick = new Joystick(kJoystickPort);
  }

  @Override
  public void teleopPeriodic() {
    m_motor.set(m_joystick.getY());
  }
}

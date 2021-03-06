// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LEDeez;

public class HellaMasculineLED extends CommandBase {
  /** Creates a new HellaMasculineLED. */
  LEDeez m_led;
  Timer m_timer;

  public HellaMasculineLED(LEDeez l) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_led = l;
    m_timer = new Timer();
    addRequirements(m_led);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_timer.reset();
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_timer.get() < 0.2) {
      m_led.purpleBlueWhite();
    }
    if (m_timer.get() < 0.4) {
      m_led.purpleBlueWhite2();
    }
    if (m_timer.get() < 0.6) {
      m_led.purpleBlueWhite3();
    }
    if (m_timer.get() > 0.8) {
      m_timer.reset();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

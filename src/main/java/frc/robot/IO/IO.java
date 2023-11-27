package frc.robot.IO;

import edu.wpi.first.wpilibj.XboxController;
import frc.lib.StadiaController;

import java.util.HashMap;
import java.util.function.Supplier;

public class IO {
    private static final XboxController primary = new XboxController(0);
    private static final StadiaController secondary = new StadiaController(1);

    private static final HashMap<Controls ,Supplier<Double>> controlsJoystick = new HashMap<>();
    private static final HashMap<Controls ,Supplier<Boolean>> controlsButtons = new HashMap<>();

    public static void Initialize()
    {
        controlsJoystick.put(Controls.drive_x, primary::getLeftX);
        controlsJoystick.put(Controls.drive_y, primary::getLeftY);
        controlsJoystick.put(Controls.drive_theta, primary::getRightX);
    }

    /**
     * @param key The key specifies what control you want.
     * @return This will return a supplier for current value of the joystick input.
     */
    public static Supplier<Double> getJoystickValue(Controls key)
    {
        return controlsJoystick.get(key);
    }
    /**
     * @param key The key specifies what control you want.
     * @return This will return a supplier for current value of the button input.
     */
    public static Supplier<Boolean> getButtonValue(Controls key)
    {
        return controlsButtons.get(key);
    }
}

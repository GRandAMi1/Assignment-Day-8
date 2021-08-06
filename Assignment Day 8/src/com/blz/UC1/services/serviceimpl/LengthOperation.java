package com.blz.UC1.services.serviceimpl;

import com.blz.UC1.dto.UserInputs;
import com.blz.UC1.services.LengthInterface;

public class LengthOperation implements LengthInterface {
    UserInputs obj = new UserInputs();
    public double lenLineOne() {
 //       Coordinates();
        double lenFirstLine = Math.sqrt(Math.pow((obj.getX2() - obj.getX1()), 2) + Math.pow((obj.getY2() - obj.getY1()), 2));
        return lenFirstLine;
    }
}

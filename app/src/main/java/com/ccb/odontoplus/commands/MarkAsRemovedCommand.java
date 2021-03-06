package com.ccb.odontoplus.commands;

import android.util.Log;

import com.ccb.odontoplus.model.ServiceContext;

public class MarkAsRemovedCommand implements ICommand {

    private static final String COMMAND = "PiezaExtirpada";
    private static final String RAW_COMMAND = "pieza extirpada";

    @Override
    public boolean matches(String voiceCommands) {
        if (voiceCommands == null) {
            return false;
        }
        voiceCommands = voiceCommands.replace(RAW_COMMAND,COMMAND);
        String[] split = voiceCommands.split(" ");
        if (voiceCommands.length() < 2) {
            return false;
        }
        try{
            Integer.parseInt(split[1]);
        } catch (Exception e){
            return false;
        }
        return split[0].equals(COMMAND);
    }

    @Override
    public String execute(String voiceCommands, ServiceContext context) {

        voiceCommands = voiceCommands.replace(RAW_COMMAND,COMMAND);
        String[] split = voiceCommands.split(" ");
        String pieza = split[1];
        Log.i("Command",COMMAND+" "+pieza);
        return "";
    }
}



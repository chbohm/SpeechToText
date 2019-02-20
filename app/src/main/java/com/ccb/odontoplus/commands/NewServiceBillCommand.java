package com.ccb.odontoplus.commands;

import android.util.Log;

import com.ccb.odontoplus.model.ServiceContext;

public class NewServiceBillCommand implements ICommand{
    private static final String RAW_COMMAND = "nuevo servicio";
    private static final String COMMAND = "NuevoServicio";

    @Override
    public boolean matches(String voiceCommands) {
        if (voiceCommands == null) {
            return false;
        }
        voiceCommands = voiceCommands.replace(RAW_COMMAND,COMMAND);
        String[] split = voiceCommands.split(" ");
        return split[0].equals(COMMAND);
    }

    @Override
    public String execute(String voiceCommands, ServiceContext context) {
        Log.i("Command","Nuevo Servicio");
        context.save();
        context.newService();
        return "";
    }
}

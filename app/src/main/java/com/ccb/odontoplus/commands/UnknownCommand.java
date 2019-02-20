package com.ccb.odontoplus.commands;

import android.util.Log;

import com.ccb.odontoplus.model.ServiceContext;

public class UnknownCommand implements ICommand{

    @Override
    public boolean matches(String voiceCommands) {
        return true;
    }

    @Override
    public String execute(String voiceCommands, ServiceContext context) {
        Log.i("Command","Comando desconocido");
        return "";
    }
}

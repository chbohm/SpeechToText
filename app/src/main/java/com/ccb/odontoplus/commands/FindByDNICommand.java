package com.ccb.odontoplus.commands;

import android.util.Log;

import com.ccb.odontoplus.model.ServiceContext;

public class FindByDNICommand implements ICommand {

    private static final String RAW_COMMAND = "buscar por d n i";
    private static final String COMMAND = "BuscarPorDNI";

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
    public String execute(String voiceCommands , ServiceContext context) {

        voiceCommands = voiceCommands.replace(RAW_COMMAND,COMMAND);
        String[] split = voiceCommands.split(" ");
        String dni = split[1];
        Log.i("Command","Buscando por DNI "+dni);
        return "";
    }
}

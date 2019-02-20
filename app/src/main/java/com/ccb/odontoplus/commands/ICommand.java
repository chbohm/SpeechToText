package com.ccb.odontoplus.commands;

import com.ccb.odontoplus.model.ServiceContext;

import java.util.List;

public interface ICommand {
    public boolean matches(String voiceCommands);

    public String execute(String voiceCommands, ServiceContext context);
}

package com.ccb.odontoplus.commands;

import com.ccb.odontoplus.model.ServiceContext;
import com.google.common.collect.Lists;

import java.util.List;

public class VoiceCommandExecutor {

    private List<ICommand> commands = Lists.newArrayList();

    public VoiceCommandExecutor() {
        commands.add(new FindByDNICommand());
        commands.add(new NewServiceBillCommand());
        commands.add(new MarkToRemoveCommand());
        commands.add(new UnknownCommand());
    }


    public void matchAndExecute(String voiceCommand, ServiceContext context) {
        // voiceCommand = VoiceUtils.translateNumbers(voiceCommand);
        boolean match = false;
        for(ICommand command : commands) {
            if (command.matches(voiceCommand)) {
                command.execute(voiceCommand, context);
                break;
            }
        }

    }


}

package k4unl.minecraft.pvpToggle.commands;

//Disabled for now
public class CommandPvpToggleClient {/* implements Command {

    @Override
    public void register(LiteralArgumentBuilder<CommandSource> argumentBuilder) {

    }

    @Override
    public String getName() {
        
        return "pvpui";
    }

    @Override
    public boolean canUse(CommandSource commandSource) {
        return false;
    }

    @Override
    public String getUsage(ICommandSender p_71518_1_) {
        
        return "pvpui location <x> <y>|own enable/disable|other enable/disable";
    }
    
    @Override
    public List getAliases() {
        
        return new ArrayList<String>() {
        };
    }
    
    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("open")) {
                //ClientHandler.setOpenGui(true);
                //Ask for the list of areas beforehand.
                PvpToggle.networkHandler.sendToServer(new PacketRequestData(true, true, true));
            }
        }else if (args.length == 2) {
            if (args[0].toLowerCase().equals("own")) {
                if (args[1].toLowerCase().equals("enable")) {
                    PvPConfig.INSTANCE.setBool("renderOwnIcon", "ui", true);
                    sender.sendMessage(new TextComponentString("Own rendering is now " + TextFormatting.GREEN + "enabled."));
                } else if (args[1].toLowerCase().equals("disable")) {
                    PvPConfig.INSTANCE.setBool("renderOwnIcon", "ui", false);
                    sender.sendMessage(new TextComponentString("Own rendering is now " + TextFormatting.RED + "disabled."));
                }
            } else if (args[0].toLowerCase().equals("other")) {
                if (args[1].toLowerCase().equals("enable")) {
                    PvPConfig.INSTANCE.setBool("renderOtherIcon", "ui", true);
                    sender.sendMessage(new TextComponentString("Other person rendering is now " + TextFormatting.GREEN + "enabled."));
                } else if (args[1].toLowerCase().equals("disable")) {
                    PvPConfig.INSTANCE.setBool("renderOtherIcon", "ui", false);
                    sender.sendMessage(new TextComponentString("Other person rendering is now " + TextFormatting.RED + "disabled."));
                }
            }
        } else if (args.length == 3) {
            if (args[0].toLowerCase().equals("location")) {
                int x = Integer.parseInt(args[1]);
                int y = Integer.parseInt(args[2]);
                PvPConfig.INSTANCE.setInt("x", "ui", x);
                PvPConfig.INSTANCE.setInt("y", "ui", y);
            }
        } else {
            sender.sendMessage(new TextComponentString(getUsage(sender)));
        }
    }
    
    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        
        return true;
    }
    
    
    @Override
    public List getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
        
        List<String> ret = new ArrayList<String>();
        
        if (args[0].toLowerCase().equals("own") || args[0].toLowerCase().equals("other")) {
            ret.add("enable");
            ret.add("disable");
        } else {
            ret.add("own");
            ret.add("other");
            ret.add("location");
        }
        
        return ret;
    }
    
    @Override
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
        
        return false;
    }
    
    @Override
    public int compareTo(ICommand o) {
        
        return 0;
    }*/
}
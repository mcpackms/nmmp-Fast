public static void main(String[] args) throws IOException {
    String subCommand;
    String[] newArgs;

    if (args.length < 1) {
        // 默认使用 apk 子命令，且没有额外参数
        subCommand = "apk";
        newArgs = new String[0];
    } else {
        subCommand = args[0];
        newArgs = Arrays.copyOfRange(args, 1, args.length);
    }

    switch (subCommand) {
        case "apk":
            ApkMain.main(newArgs);
            break;
        case "aab":
            AabMain.main(newArgs);
            break;
        case "aar":
            AarMain.main(newArgs);
            break;
        default:
            System.err.println("Unknown subcommand");
            System.exit(-1);
    }
}
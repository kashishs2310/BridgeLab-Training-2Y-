interface LightAction {
    void execute();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Motion detected! Turning lights ON softly.");
        LightAction nightTrigger = () -> System.out.println("It's night! Activating warm night mode.");
        LightAction voiceCommand = () -> System.out.println("Voice command received: Turning lights OFF.");

        // Execute actions
        motionTrigger.execute();
        nightTrigger.execute();
        voiceCommand.execute();
    }
}

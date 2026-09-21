public class Client {

    public static void main(String[] args) {
        assembleYurt(new SteppeYurtFactory());
        assembleYurt(new MountainYurtFactory());
    }

    private static void assembleYurt(YurtFactory factory) {
        Frame frame = factory.createFrame();
        Stove stove = factory.createStove();
        System.out.println(frame.describe() + " + " + stove.describe());
    }
}

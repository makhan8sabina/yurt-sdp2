public class SteppeYurtFactory implements YurtFactory {
    @Override
    public Frame createFrame() {
        return new SteppeFrame();
    }

    @Override
    public Stove createStove() {
        return new SteppeStove();
    }
}

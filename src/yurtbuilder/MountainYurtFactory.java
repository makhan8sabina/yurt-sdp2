public class MountainYurtFactory implements YurtFactory {
    @Override
    public Frame createFrame() {
        return new MountainFrame();
    }

    @Override
    public Stove createStove() {
        return new MountainStove();
    }
}

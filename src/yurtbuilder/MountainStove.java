package yurtbuilder;

/** Concrete Product, mountain family. */
public class MountainStove implements Stove {
    @Override
    public String describe() {
        return "high-output stove for cold climate";
    }
}

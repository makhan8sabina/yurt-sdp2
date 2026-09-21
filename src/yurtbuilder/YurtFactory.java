package yurtbuilder;

/**
 * Abstract Factory: one creation method per product type in the
 * family (Frame, Stove). Guarantees that whatever family a client
 * picks, the resulting Frame and Stove are compatible with each other.
 */
public interface YurtFactory {
    Frame createFrame();
    Stove createStove();
}

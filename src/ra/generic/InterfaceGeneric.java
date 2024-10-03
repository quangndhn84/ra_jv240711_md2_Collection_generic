package ra.generic;

public interface InterfaceGeneric<G> {
    void read();

    void create(G obj);

    void update(G obj);

    void delete(G obj);
}

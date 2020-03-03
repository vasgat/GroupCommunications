package eu.h2020.helios_social.modules.groupcommunications.utils;

public abstract class Identifier {

    private final byte[] identifier;

    public Identifier(byte[] id) {
        this.identifier = id;
    }

    public byte[] getId() {
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Identifier && (this.identifier == ((Identifier) o).getId());
    }

}

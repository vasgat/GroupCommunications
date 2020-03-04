package eu.h2020.helios_social.modules.groupcommunications.utils;

public class PeerId extends Identifier {
    /**
     * Label for hashing peers to calculate their identifiers.
     */
    public static final String LABEL = "eu.h2020.helios_social.modules.groupcommunications.lib/PEER_ID";

    public PeerId(byte[] id) {
        super(id);
    }
}

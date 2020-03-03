package eu.h2020.helios_social.modules.groupcommunications.utils;

public class MessageId extends Identifier {

    /**
     * Label for hashing messages to calculate their identifiers.
     */
    public static final String LABEL = "eu.h2020.helios_social.modules.groupcommunications.lib/MESSAGE_ID";

    MessageId(byte[] id) {
        super(id);
    }
}

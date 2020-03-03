package eu.h2020.helios_social.modules.groupcommunications.utils;

public class GroupId extends Identifier {

    /**
     * Label for hashing groups to calculate their identifiers.
     */
    public static final String LABEL = "eu.h2020.helios_social.modules.groupcommunications.lib/GROUP_ID";


    public GroupId(byte[] id) {
        super(id);
    }

}

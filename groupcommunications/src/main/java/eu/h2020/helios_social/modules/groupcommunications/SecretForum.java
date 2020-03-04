package eu.h2020.helios_social.modules.groupcommunications;


import eu.h2020.helios_social.modules.groupcommunications.utils.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

/**
 * A Non-sharable Forum (Private/Secret Forum)
 */
public class SecretForum extends Group {

    private String name;
    private final byte[] salt;
    private final ContactId owner;

    /**
     * Contracts a new instance of SecretForum
     * @param id GroupId of the SecretForum
     * @param name name of the forum
     * @param owner owner/creator of the SecretForum (cannot change)
     * @param salt
     */
    public SecretForum(GroupId id, String name, ContactId owner, byte[] salt) {
        super(id);
        this.name = name;
        this.owner = owner;
        this.salt = salt;
    }

    /**
     * Get tbe name of the Forum
     * @return
     */
    public String getName() {
        return name;
    }

    public byte[] getSalt() {
        return salt;
    }

    /**
     * Get Peer Identifier of Forum Owner
     * @return Contact Identifier
     */
    public ContactId getOwner() {
        return owner;
    }

    /**
     * Change Forum's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}

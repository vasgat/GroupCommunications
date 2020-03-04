package eu.h2020.helios_social.modules.groupcommunications;

import androidx.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications.utils.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

/**
 * A Sharable Forum
 */
public class Forum extends Group {

    private String name;
    private final byte[] salt;
    private ContactId administrator;

    /**
     * Creates a sharable Forum with a given name and salt
     * @param id GroupId of the Forum
     * @param name name of the forum
     * @param administrator Peer Identifier of the administrator of the forum (admin can be change)
     * @param salt
     */
    public Forum(GroupId id, String name, @Nullable ContactId administrator, byte[] salt) {
        super(id);
        this.name = name;
        this.administrator = administrator;
        this.salt = salt;
    }

    /**
     *
     * @return name of the Forum
     */
    public String getName() {
        return name;
    }

    public byte[] getSalt() {
        return salt;
    }

    /**
     * Returns the Peer Identifier of the Peer with administrator rights
     * @return
     */
    public ContactId getForumOwner() {
        return administrator;
    }

    /**
     * Updates administator of the Forum
     * @param contactId
     */
    public void setForumOwner(@Nullable ContactId contactId) {
        this.administrator = contactId;
    }

    /**
     * Updates Forum name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}

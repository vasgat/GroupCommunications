package eu.h2020.helios_social.modules.groupcommunications;

import eu.h2020.helios_social.modules.groupcommunications.utils.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

public class Forum extends Group {

    private String name;
    private final byte[] salt;
    private ContactId owner;

    public Forum(GroupId id, String name, ContactId owner, byte[] salt) {
        super(id);
        this.name = name;
        this.owner = owner;
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public byte[] getSalt() {
        return salt;
    }

    public ContactId getForumOwner() {
        return owner;
    }

    public void setForumOwner(ContactId contactId) {
        this.owner = contactId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

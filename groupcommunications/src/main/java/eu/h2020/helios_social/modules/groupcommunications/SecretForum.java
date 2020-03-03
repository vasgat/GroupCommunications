package eu.h2020.helios_social.modules.groupcommunications;


import eu.h2020.helios_social.modules.groupcommunications.utils.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

public class SecretForum extends Group {

    private String name;
    private final byte[] salt;
    private final ContactId creator;

    public SecretForum(GroupId id, String name, ContactId creator, byte[] salt) {
        super(id);
        this.name = name;
        this.creator = creator;
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public byte[] getSalt() {
        return salt;
    }

    public ContactId getCreator() {
        return creator;
    }

    public void setName(String name) {
        this.name = name;
    }
}

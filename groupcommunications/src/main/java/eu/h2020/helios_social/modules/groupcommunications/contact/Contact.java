package eu.h2020.helios_social.modules.groupcommunications.contact;

import androidx.annotation.Nullable;

public abstract class Contact {
    private final ContactId id;
    private final String nickname;

    public Contact(ContactId id, @Nullable String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public ContactId getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Contact && id.equals(((Contact) o).id);
    }
}

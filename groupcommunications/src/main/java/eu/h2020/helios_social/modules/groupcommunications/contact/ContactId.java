package eu.h2020.helios_social.modules.groupcommunications.contact;

import androidx.annotation.Nullable;

public class ContactId {

    private final int id;

    public ContactId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(@Nullable Object o) {
        return o instanceof ContactId && id == ((ContactId) o).id;
    }
}

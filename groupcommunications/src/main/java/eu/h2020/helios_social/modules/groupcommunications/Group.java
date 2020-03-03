package eu.h2020.helios_social.modules.groupcommunications;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

public abstract class Group {

    protected GroupId id;

    public Group(GroupId id) {
        this.id = id;
    }

    public GroupId getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Group && id.equals(((Group) o).id);
    }

}

package eu.h2020.helios_social.modules.groupcommunications;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

/**
 * A Group can be considered an independent synchronization scope
 */
public abstract class Group {

    protected GroupId id;

    /**
     * Each group should characterized by a unique Identifier
     * @param id
     */
    public Group(GroupId id) {
        this.id = id;
    }

    /**
     *
     * @return the unique identifier of the group
     */
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

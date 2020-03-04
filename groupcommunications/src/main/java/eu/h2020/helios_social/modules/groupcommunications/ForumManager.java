package eu.h2020.helios_social.modules.groupcommunications;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

/**
 * Interface for Forum Manager
 */
public interface ForumManager {

    /**
     * Allows User to create a new Forum with a given name
     * @param name
     * @return
     */
    Forum addForum(String name);

    /**
     * Subscribes to the given forum
     * @param forum
     */
    void subscribeToForum(Forum forum);

    /**
     * Unsubscribes from the given forum
     * @param forum
     */
    void unsubscribeFromForum(Forum forum);

    /**
     *
     * @param gid group unique Identifier
     * @return the forum with the given id
     */
    Forum getForum(GroupId gid);

    /**
     *
     * @return all forums user is subscribed to
     */
    Collection<Forum> getAllForums();

    /**
     * Returns all members of the given Forum
     * @param groupId
     * @return s collection of Forum Member
     */
    Collection<ForumMember> getForumMembers(GroupId groupId);
}

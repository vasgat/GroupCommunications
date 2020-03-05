package eu.h2020.helios_social.modules.groupcommunications.secretforum;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.forum.Forum;
import eu.h2020.helios_social.modules.groupcommunications.forum.ForumMember;
import eu.h2020.helios_social.modules.groupcommunications.forum.ForumMemberRole;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

/**
 * Interface for SecretForumManager
 */
public interface SecretForumManager {

    /**
     * Allows User to create a new Secret Forum with a given name
     * @param name
     * @return
     */
    SecretForum addSecretForum(String name);

    /**
     * Joins a Secret Forum
     * @param secretForum
     */
    void joinsSecretForum(SecretForum secretForum);

    /**
     * Deletes the given secret forum
     * @param secretForum
     */
    void deletesSecretForum(SecretForum secretForum);

    /**
     *
     * @param gid group unique Identifier
     * @return the secret forum with the given id
     */
    SecretForum getSecretForum(GroupId gid);

    /**
     *
     * @return all secret forums user is member
     */
    Collection<SecretForum> getAllSecretForums();

    /**
     * Returns all members of the given Secret Forum
     * @param groupId
     * @return s collection of Secret Forum Members
     */
    Collection<SecretForumMember> getSecretForumMembers(GroupId groupId);
}

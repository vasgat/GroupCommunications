package eu.h2020.helios_social.modules.groupcommunications.forum;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

/**
 * TODO: Add implementation for ForumManager
 */
public class ForumManagerImpl implements ForumManager {

    public ForumManagerImpl(ForumManager forumManager /*more variables are expected in the final version of ForumManagerImpl constructor*/) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Forum addForum(String name) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void subscribeToForum(Forum forum) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void unsubscribeFromForum(Forum forum) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Forum getForum(GroupId gid) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Collection<Forum> getAllForums() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Collection<ForumMember> getForumMembers(GroupId groupId) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public ForumMemberRole getRole(GroupId groupId) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

package eu.h2020.helios_social.modules.groupcommunications.forum;

import eu.h2020.helios_social.modules.groupcommunications.peer.Peer;
import eu.h2020.helios_social.modules.groupcommunications.peer.PeerInfo;

/**
 * A class for Forum members
 */
public class ForumMember {

    private Peer member;
    private ForumMemberRole role;

    public ForumMember(Peer peer, ForumMemberRole role) {
        this.member = peer;
        this.role = role;
    }

    /**
     * Returns true if the Member is also the administrator of the Forum
     *
     * @return
     */
    public boolean isAdministrator() {
        return role == ForumMemberRole.ADMINISTRATOR;
    }

    /**
     * Returns Member's Role
     *
     * @return
     */
    public ForumMemberRole getRole() {
        return role;
    }

    /**
     * Returns Member's Profile
     *
     * @return
     */
    public PeerInfo getMemberInfo() {
        return member.getPeerInfo();
    }

    /**
     * Updates Peer's role in the Forum
     * @param role
     */
    public void updateRole(ForumMemberRole role) {
        this.role = role;
    }


}

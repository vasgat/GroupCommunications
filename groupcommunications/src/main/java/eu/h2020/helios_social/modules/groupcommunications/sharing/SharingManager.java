package eu.h2020.helios_social.modules.groupcommunications.sharing;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.utils.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

public interface SharingManager {

    /**
     * Sends an invitation to share the given group with the given contact
     * @param groupId Identifier of the shared group
     * @param contactId Identifier of the contact the group is shared with
     * @param text small text included in the invitation
     * @param timestamp the invitation has been sent
     */
    void sendInvitation(GroupId groupId, ContactId contactId, String text, long timestamp);

    /**
     * Contact response to group invitation
     * @param groupId Identifier of the shared group
     * @param contactId Identifier of the contact the group is shared with
     * @param accept response of the contact to the invite (true if accepted false otherwise)
     */
    void respondToInvitation(GroupId groupId, ContactId contactId, boolean accept);

    /**
     *
     * @param groupId Identifier of the shared group
     * @return the contact Identifiers of the contacts the given group is shared with
     */
    Collection<ContactId> isSharedWith(GroupId groupId);

}

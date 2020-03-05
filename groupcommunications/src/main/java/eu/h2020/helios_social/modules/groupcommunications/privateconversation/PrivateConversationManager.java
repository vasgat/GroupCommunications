package eu.h2020.helios_social.modules.groupcommunications.privateconversation;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.Message;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;
import eu.h2020.helios_social.modules.groupcommunications.utils.MessageId;
import eu.h2020.helios_social.modules.groupcommunications.utils.PeerId;

public interface PrivateConversationManager {

    /**
     * Stores a Private Message
     * @param message
     */
    void storePrivateMessage(Message message);

    /**
     * Returns the Private Conversation Identifier with the given peer
     * @param peerId
     * @return
     */
    GroupId getConversationId(PeerId peerId);

    /**
     * Returns the Peer Identifier based on the Private Conversation Identifier
     * @param groupId
     * @return
     */
    PeerId getPeerId(GroupId groupId);

    /**
     * Returns all conversation {@Link Message}s with the given peer
     * @param peerId Peer Identifier
     * @return
     */
    Collection<Message> getAllMessages(PeerId peerId);

    /**
     * Deletes all messages related with the given peer
     * @param peerId
     */
    void deleteAllMessages(PeerId peerId);

    /**
     * Deletes the given set of messages related with the given per.
     * @param peerId
     */
    void deleteMessages(PeerId peerId, Collection<MessageId> messageIds);
}

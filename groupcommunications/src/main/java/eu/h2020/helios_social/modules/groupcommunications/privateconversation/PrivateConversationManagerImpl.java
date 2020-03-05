package eu.h2020.helios_social.modules.groupcommunications.privateconversation;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.Group;
import eu.h2020.helios_social.modules.groupcommunications.Message;
import eu.h2020.helios_social.modules.groupcommunications.peer.Peer;
import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;
import eu.h2020.helios_social.modules.groupcommunications.utils.MessageId;
import eu.h2020.helios_social.modules.groupcommunications.utils.PeerId;

/**
 * TODO: Add implementation for SecretForumFactoryImpl
 */
public class PrivateConversationManagerImpl implements PrivateConversationManager {

    public PrivateConversationManagerImpl(/*several variables are expected in the final version of PrivateConversationManagerImpl constructor*/) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Group addingContact(Peer peer) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void storePrivateMessage(Message message) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public GroupId getConversationId(PeerId peerId) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public PeerId getPeerId(GroupId groupId) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Collection<Message> getAllMessages(PeerId peerId) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void deleteAllMessages(PeerId peerId) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void deleteMessages(PeerId peerId, Collection<MessageId> messageIds) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

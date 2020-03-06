package eu.h2020.helios_social.modules.groupcommunications.sharing;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;
import eu.h2020.helios_social.modules.groupcommunications.utils.PeerId;

/**
 * TODO: Add implementation for SecretForumFactoryImpl
 */
public class SharingManagerImpl implements SharingManager {

    public SharingManagerImpl(/*several variables are expected in the final version of SharingManagerImpl*/){
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void sendInvitation(GroupId groupId, PeerId peerId, String text, long timestamp) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void respondToInvitation(GroupId groupId, PeerId peerId, boolean accept) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Collection<PeerId> isSharedWith(GroupId groupId) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

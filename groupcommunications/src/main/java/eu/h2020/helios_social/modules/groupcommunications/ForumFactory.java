package eu.h2020.helios_social.modules.groupcommunications;

import androidx.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications.utils.PeerId;

/**
 * A class for creating new sharable Forums
 */
public interface ForumFactory {

    /**
     * creates a sharable Forum with a given name
     *
     * @param name  of the Forum
     * @param administrator Peer Identifier of the peer that assigned as administrator of the forum
     * @return the created Forum
     */
    Forum createForum(@Nullable String name, PeerId administrator);

    /**
     * creates a sharable forum with a given name and salt
     *
     * @param name of the forum
     * @param administrator Peer Identifier of the peer that assigned as administrator of the forum
     * @param salt
     * @return the created Forum
     */
    Forum createForum(String name, @Nullable PeerId administrator, byte[] salt);
}

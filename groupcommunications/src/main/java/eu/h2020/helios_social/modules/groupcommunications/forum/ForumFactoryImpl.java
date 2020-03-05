package eu.h2020.helios_social.modules.groupcommunications.forum;

import androidx.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications.utils.PeerId;

/**
 * TODO: Add implementation for ForumFactory
 */
public class ForumFactoryImpl implements ForumFactory {

    @Override
    public Forum createForum(@Nullable String name, PeerId administrator) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public Forum createForum(String name, @Nullable PeerId administrator, byte[] salt) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

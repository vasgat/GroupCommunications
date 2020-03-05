package eu.h2020.helios_social.modules.groupcommunications.secretforum;

import androidx.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications.utils.PeerId;

/**
 * TODO: Add implementation for SecretForumFactoryImpl
 */
public class SecretForumFactoryImpl implements SecretForumFactory {

    @Override
    public SecretForum createSecretForum(@Nullable String name, @Nullable PeerId owner) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public SecretForum createSecretForum(@Nullable String name, @Nullable PeerId owner, byte[] salt) {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

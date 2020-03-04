package eu.h2020.helios_social.modules.groupcommunications;

import androidx.annotation.Nullable;

import eu.h2020.helios_social.modules.groupcommunications.utils.ContactId;

/**
 * A class for creating new non-sharable Forums (Private/Secret Forums)
 */
public interface SecretForumFactory {

    /**
     * Creates a non-sharable Forum (aka Secret Forum) with a given name
     * @param name of the Secret Forum
     * @param owner Peer Identifier of the owner/creator of the secret forum
     * @return the created Secret Forum
     */
    SecretForum createSecretForum(@Nullable String name, @Nullable ContactId owner);

    /**
     * creates a non-sharable forum (aka Secret Forum) with a given name and salt
     * @param name of the Secret Forum
     * @param owner Peer Identifier of the owner/creator of the secret forum
     * @param salt
     * @return
     */
    SecretForum createSecretForum(@Nullable String name, @Nullable ContactId owner, byte[] salt);
}

package eu.h2020.helios_social.modules.groupcommunications.forum;

import android.nfc.FormatException;

/**
 * Available Forum Member Roles
 */
public enum ForumMemberRole {

    ADMINISTRATOR(0),
    MODERATOR(1),
    PARTICIPANT(2),
    BLOCKED(3);

    private final int value;

    ForumMemberRole(int value) {
        this.value = value;
    }

    public static ForumMemberRole valueOf(int value) throws FormatException {
        for (ForumMemberRole role : values()) if (role.value == value) return role;
        throw new FormatException();
    }

    public int getInt() {
        return value;
    }
}

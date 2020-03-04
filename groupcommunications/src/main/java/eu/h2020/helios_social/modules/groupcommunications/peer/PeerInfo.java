package eu.h2020.helios_social.modules.groupcommunications.peer;

import android.graphics.Bitmap;

import androidx.annotation.Nullable;

import com.github.javafaker.Faker;

import eu.h2020.helios_social.core.profile.HeliosUserData;

/**
 * PeerInfo extends HeliosUserData. It can be considered as Profile for a Peer
 */
public class PeerInfo extends HeliosUserData {

    private Bitmap profilePicture;
    /**
     * Constructs a PeerInfo instance
     * @param alias peer nickname
     * @param realName peer realname
     */
    public PeerInfo(@Nullable String alias, String realName) {
        super.setValue("alias", alias);
        super.setValue("fakename", Faker.instance().funnyName().name());
        super.setValue("realname", realName);
    }

    /**
     *Returns the profile picture of the peer
     * @return
     */
    public Bitmap getProfilePicture() {
        return profilePicture;
    }

    /**
     * Updates the Users's profile picture
     * @param selectedPicture
     */
    public void updateProfilePicture(Bitmap selectedPicture) {
        this.profilePicture = selectedPicture;
    }

    /**
     * Returns Peer's nickname/alias
     * @return
     */
    public String getAlias() {
        return super.getValue("alias");
    }

    /**
     * Updates Peer's nickname/alias
     * @param alias
     */
    public void setAlias(String alias) {
        super.setValue("alias", alias);
    }

    /**
     * Returns Peer's fake name
     * @return
     */
    public String getFakeName() {
        return super.getValue("fakename");
    }

    /**
     * Set a custom fakename for the Peer
     * @param fakename
     */
    public void setFakeName(String fakename) {
        super.setValue("fakename", fakename);
    }

    /**
     * Updates Peer's real name
     */
    public void getRealName() {
        super.getValue("realname");
    }

    /**
     * Returns Peer's Real Name
     * @param realName
     */
    public void setRealName(String realName) {
        super.setValue("realname", realName);
    }
}

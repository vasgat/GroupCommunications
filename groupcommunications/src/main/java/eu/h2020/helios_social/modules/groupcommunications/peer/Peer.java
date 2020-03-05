package eu.h2020.helios_social.modules.groupcommunications.peer;

import androidx.annotation.Nullable;

import eu.h2020.helios_social.core.contextualegonetwork.Node;
import eu.h2020.helios_social.modules.groupcommunications.utils.PeerId;

/**
 * This class implements a peer.
 */
public class Peer {
    private final PeerId id;
    private PeerInfo peerInfo;
    private Node node;

    /**
     * @param id       Peer's Unique Identifier
     * @param peerInfo Some Information about the Peer
     */
    public Peer(PeerId id, @Nullable PeerInfo peerInfo) {
        this.id = id;
        this.peerInfo = peerInfo;
        this.node = new Node(id.getId().toString(), peerInfo);
    }

    public PeerId getId() {
        return id;
    }

    /**
     * Returns Peer Information
     * @return
     */
    public PeerInfo getPeerInfo() {
        return peerInfo;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Peer && id.equals(((Peer) o).id);
    }
}

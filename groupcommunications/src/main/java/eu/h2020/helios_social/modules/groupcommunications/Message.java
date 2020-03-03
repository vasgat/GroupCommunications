package eu.h2020.helios_social.modules.groupcommunications;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;
import eu.h2020.helios_social.modules.groupcommunications.utils.MessageId;

public class Message {

    private final MessageId id;
    private final GroupId groupId;
    private final long timestamp;
    private final Object body;

    public Message(MessageId id, GroupId groupId, long timestamp, Object body) {
        this.id = id;
        this.groupId = groupId;
        this.timestamp = timestamp;
        this.body = body;
    }

    public MessageId getId() {
        return id;
    }

    public GroupId getGroupId() {
        return groupId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Object getBody() {
        return body;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Message && id.equals(((Message) o).getId());
    }
}

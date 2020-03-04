package eu.h2020.helios_social.modules.groupcommunications;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;
import eu.h2020.helios_social.modules.groupcommunications.utils.MessageId;

/**
 * Represents a Message
 */
public class Message {

    private final MessageId id;
    private final GroupId groupId;
    private final long timestamp;
    private final MessageBody body;

    /**
     * Contracts a new instance of Message
     *
     * @param id        Message Identifier
     * @param groupId   Group Identifier of the group the message shared to
     * @param timestamp epoch timestamp of the message
     * @param body      message body
     */
    public Message(MessageId id, GroupId groupId, long timestamp, MessageBody body) {
        this.id = id;
        this.groupId = groupId;
        this.timestamp = timestamp;
        this.body = body;
    }

    /**
     *
     * @return the Message Identifier
     */
    public MessageId getId() {
        return id;
    }

    /**
     *
     * @return Group Identifier of the group the message shared to
     */
    public GroupId getGroupId() {
        return groupId;
    }

    /**
     *
     * @return epoch timestamp of the message
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @return the Message Body
     */
    public MessageBody getBody() {
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

package eu.h2020.helios_social.modules.groupcommunications;

import eu.h2020.helios_social.modules.groupcommunications.utils.GroupId;

/**
 * A class for creating new Messages
 */
public interface MessageFactory {

    /**
     * Create a new message given the Group Identifier the message is shared to, timestamp
     * and the message body
     *
     * @param groupId
     * @param timestamp epoch timestamp
     * @param messageBody
     * @return
     */
    Message createMessage(GroupId groupId, long timestamp, MessageBody messageBody);
}

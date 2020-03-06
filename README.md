# Helios Group Communications API #

| :warning: WARNING: This is a first version of Helios Group Communications API. Implementation is missing at this point. |
| --- |

## Introduction ##

The Group Communication API offers a set of functionalities for handling one-on-one and group communications over the p2p Helios network. It offers a Decentralized Group Management Protocol and supports different types of Groups (Forums & Secret Forums) and role assignment and management.

## API usage ##

See javadocs in javadoc directory

### Dependencies ###

This module depends on several Helios Core Modules found under eu.h2020.helios_social.core.

### PrivateConversationManager ###

`PrivateConversationManager` is responsible for handling one-on-one communications. Some usage examples can be found below.

```java
PrivateConversationManager conversationManager = new PrivateConversationManager();
//this method is called when a peer is added as a contact to create a new Group (groups are explained below)
conversationManager.addingContact(contactPeer);
//return all conversation Message(s) with the given peer
Collection<Message> conversation = conversationManager.getAllMessages(contactPeer.getId());
//deletes all messages related with the given peer
conversationManager.deleteAllMessages(contactPeer.getId());
//returns the private conversation identifier with the given peer
GroupId conversationId = conversationManager.getConversationId(anotherPeer);
```

### ForumManager ###

`ForumManager` is responsible for handling group conversations that can be considered public and they can be shared. Four different roles are supported: administrator, moderator, participant & blocked. `ForumFactory` is responsible for creating `Forum` instances and is given as input to the constructor of `ForumManager`. Some usage examples can be found below.

```java
ForumManagerImpl forumManager = new ForumManagerImpl(new ForumFactoryImpl());
//Create a new forum with the given name
Forum forum = forumManager.addForum("Helios Developers");
//Return user role in the given forum
ForumMemberRole role = forumManager.getRole(forum.getId());
//Returns all forums the peer is subscribed too
Set<Forum> subscribedForums = forumManager.getAllForums();
//Returns all forumMembers of the given forum
Set<ForumMember> forumMembers = forumManager.getForumMembers(forum.getId());
//subcribes to the given forum
forumManager.subscribeToForum(anotherForum);
//unsubscribed from the given forum
forumManager.unsubcribesFromForum(anotherForum);
```

### SecretForumManager ###
`SecretForumManager` is responsible for handling private group conversations that can not be shared. The creator of the `SecretForum` is the administrator and decides who is blocked and the only peer that can invite new participants and delete the conversation. `SecretForumFactory` is responsible for creating `SecretForum` instances and it is given as input to the constructor of `SecretForumManager`. Some usage examples can be found below.

```java
SecretForumManagerImpl secretForumManager = new SecretForumManagerImpl(new SecretForumFactoryImpl());
//Create a new secret forum with the given name
SecretForum secretForum = secretForumManager.addSecretForum("Helios WP5 Task Leaders");
//Returns all secret forums the peer is a member too
Set<SecretForum> secretForums = secretForumManager.getAllSecretForums();
//Returns all members of the given secret forum
Set<SecretForumMember> secretForumMembers = secretForumManager.getSecretForumMembers(forum.getId());
//joins a Secret Forum
forumManager.joinsSecretForum(anotherForum);
//deletes the given Secret Forum from his/her conversations
forumManager.deletesSecretForum(anotherForum);
```

### Group ###

`Group` can be considered as an independent synchonization scope that includes one or more peers. `Forum`s, `SecretForum`s extend `Group` class that have more specific properties. `GroupId` represents group's Identifier

```java
Group group = new Group(groupId);
```

### Message ###
`Message` object represents a message shared in a specific `Group` (sychronization scope). `MessageBody` represents the body of the message (can be text/attachment/anything else). `MessageId` represents message's Identifier

```java
Message message = new Message(messageId, group.getId(), timestamp, messageBody);
```

## Android Studio project structure ##

This Android Studio 3.5 project contains the following components:

* app - test application (nothing there yet)

* javadoc - Additional documentation files

* groupcommunications - Group Communications API implementation

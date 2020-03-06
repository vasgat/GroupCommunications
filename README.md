# Helios Group Communications API #

## Introduction ##

The Group Communication API offers a set of functionalities for handling one-on-one and group communications over the p2p Helios network. It offers a Decentralized Group Management Protocol and supports different types of Groups (Forums & Secret Forums) and role assignment and management.

## API usage ##

See javadocs in [javadocs.zip](javadoc/javadocs.zip).

### Dependencies ###

This module depends on several Helios Core Modules found under eu.h2020.helios_social.core.

### PrivateConversationManager ###

### ForumManager ###

For example,
```
ForumManagerImpl forumManager = new ForumManagerImpl(new ForumFactoryImpl());
//Create a new forum with the given name
Forum forum = forumManager.addForum("Helios Developers");
//Return user role in the given forum
ForumMemberRole role = forumManager.getRole(forum.getId());
//Returns all forums the peer is subscribed too
Set<Forum> subscribedForums = forumManager.getAllForums();
//Returns all forumMembers of the given forum
Set<ForumMember> forumMembers = forumManager.getForumMembers(forum.getId());
```

### SecretForumManager ###


For example,
```
TODO
```


## Android Studio project structure ##

This Android Studio 3.5 project contains the following components:

* app - test application (nothing there yet)

* javadoc - Additional documentation files

* groupcommunications - Group Communications API implementation

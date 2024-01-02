package com.myapp.UI;

public enum UserType {
    User,Admin,Moderator,Content_Creator,Friend_Follower,Guest,Advertiser,Analytics_User
}

   /* user types:

        1.User:
        Regular app users who create accounts to interact with content.
        Can post, like, comment, and share content.
        Have a profile with personal information and settings.

        2.Admin:
        Has elevated privileges to manage and moderate the platform.
        Can delete inappropriate content, suspend or ban users, and handle reported issues.
        Manages overall system settings and configurations.

        3.Moderator:
        Similar to admins but with restricted privileges.
        Monitors and moderates content and user interactions.
        Deals with reported content and user behavior.

        4.Content Creator:
        Users who generate and share content frequently.
        May have additional features or analytics related to their content.

        5.Follower/Friend:
        Represents the connection between users.
        Users can follow or be friends with others to see their updates.

        6.Guest/Anonymous User:
        Users who can access public content without creating an account.
        Limited access to certain features.

        7.API User:
        Represents accounts used for programmatic access to the API.
        Used by third-party developers or applications integrating with your API.

        8.Advertiser:
        Users who create and manage advertising campaigns on the platform.
        Access to analytics and metrics related to their advertisements.

        9.Analytics User:
        Users interested in platform analytics.
        Access to statistics, trends, and usage patterns.*/
/*
 * Seldon -- open source prediction engine
 * =======================================
 *
 * Copyright 2011-2015 Seldon Technologies Ltd and Rummble Ltd (http://www.seldon.io/)
 *
 * ********************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ********************************************************************************************
 */

package io.seldon.facebook.user;

import java.util.List;

/**
 * Created by dylanlentini on 21/03/2014.
 */

public class FacebookPagesFriendsResult {


    public FacebookPagesFriendsResult(List<FacebookPage> facebookPages, List<FacebookUser> facebookFriends)
    {
        this.facebookPages = facebookPages;
        this.facebookFriends = facebookFriends;
    }


    List<FacebookFriendPageFan> friendsPagesFans;
    List<FacebookUser> facebookFriends;
    List<FacebookPage> facebookPages;


    public List<FacebookFriendPageFan> getFriendsPagesFans()
    {
        return friendsPagesFans;
    }

    public List<FacebookUser> getFriends()
    {
        return facebookFriends;
    }

    public void setFriends(List<FacebookUser> facebookFriends)
    {
        this.facebookFriends = facebookFriends;
    }

    public void setPages(List<FacebookPage> facebookPages)
    {
        this.facebookPages = facebookPages;
    }

    public List<FacebookPage> getPages()
    {
        return facebookPages;
    }


}

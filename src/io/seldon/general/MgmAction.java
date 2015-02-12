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

package io.seldon.general;

import java.net.URI;
import java.util.Date;

/**
 * @author philipince
 *         Date: 26/10/2013
 *         Time: 15:12
 */
public class MgmAction {


    public enum MgmActionType {
        FB_REC_CLICK, NEW_USR_CONVERSION, EXISTING_USR_CONVERSION,
        EXISTING_USR_SHARE, NEW_USR_SHARE, IMPRESSION;
    }

    private final String primaryUserId;
    private final String secondaryUserId;
    private final Date dateOfAction;
    private final MgmActionType type;
    private final URI URI;

    public MgmAction(String primaryUserId, String secondaryUserId, Date dateOfAction, MgmActionType type,
                     URI URI, URI associatedURI) {
        this.primaryUserId = primaryUserId;
        this.secondaryUserId = secondaryUserId;
        this.dateOfAction = dateOfAction;
        this.type = type;
        this.URI = URI;
    }

    public String getPrimaryUserId() {
        return primaryUserId;
    }

    public String getSecondaryUserId() {
        return secondaryUserId;
    }

    public Date getDateOfAction() {
        return dateOfAction;
    }

    public MgmActionType getType() {
        return type;
    }
}

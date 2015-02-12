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

package io.seldon.facebook.user.algorithm;

import io.seldon.facebook.user.FacebookUsersAlgorithm;

import java.util.List;

/**
 * @author philipince
 *         Date: 11/10/2013
 *         Time: 17:15
 */
public class BaseMgmAlgorithmStore implements AlgorithmStore{

    private final List<FacebookUsersAlgorithm> onlineAlgos;
    private final List<FacebookUsersAlgorithm> offlineAlgos;

    public BaseMgmAlgorithmStore(List<FacebookUsersAlgorithm> onlineAlgos,
                                 List<FacebookUsersAlgorithm> offlineAlgos){
        this.onlineAlgos = onlineAlgos;
        this.offlineAlgos = offlineAlgos;
    }

    @Override
    public List<FacebookUsersAlgorithm> getAlgorithms(String client, String userId, boolean online){
        if(online){
            return onlineAlgos;
        } else {
            return offlineAlgos;
        }
    }


}

/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVocabLibRequest extends AbstractModel {

    /**
    * 词汇库名称
    */
    @SerializedName("VocabLibName")
    @Expose
    private String VocabLibName;

    /**
     * Get 词汇库名称 
     * @return VocabLibName 词汇库名称
     */
    public String getVocabLibName() {
        return this.VocabLibName;
    }

    /**
     * Set 词汇库名称
     * @param VocabLibName 词汇库名称
     */
    public void setVocabLibName(String VocabLibName) {
        this.VocabLibName = VocabLibName;
    }

    public CreateVocabLibRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVocabLibRequest(CreateVocabLibRequest source) {
        if (source.VocabLibName != null) {
            this.VocabLibName = new String(source.VocabLibName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VocabLibName", this.VocabLibName);

    }
}


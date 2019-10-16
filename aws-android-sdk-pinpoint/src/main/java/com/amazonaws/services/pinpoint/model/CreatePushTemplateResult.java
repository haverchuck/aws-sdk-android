/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class CreatePushTemplateResult implements Serializable {
    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     */
    private CreateTemplateMessageBody createTemplateMessageBody;

    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     *
     * @return <p>
     *         Provides information about an API request or response.
     *         </p>
     */
    public CreateTemplateMessageBody getCreateTemplateMessageBody() {
        return createTemplateMessageBody;
    }

    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     *
     * @param createTemplateMessageBody <p>
     *            Provides information about an API request or response.
     *            </p>
     */
    public void setCreateTemplateMessageBody(CreateTemplateMessageBody createTemplateMessageBody) {
        this.createTemplateMessageBody = createTemplateMessageBody;
    }

    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTemplateMessageBody <p>
     *            Provides information about an API request or response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePushTemplateResult withCreateTemplateMessageBody(
            CreateTemplateMessageBody createTemplateMessageBody) {
        this.createTemplateMessageBody = createTemplateMessageBody;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreateTemplateMessageBody() != null)
            sb.append("CreateTemplateMessageBody: " + getCreateTemplateMessageBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCreateTemplateMessageBody() == null) ? 0 : getCreateTemplateMessageBody()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePushTemplateResult == false)
            return false;
        CreatePushTemplateResult other = (CreatePushTemplateResult) obj;

        if (other.getCreateTemplateMessageBody() == null
                ^ this.getCreateTemplateMessageBody() == null)
            return false;
        if (other.getCreateTemplateMessageBody() != null
                && other.getCreateTemplateMessageBody().equals(this.getCreateTemplateMessageBody()) == false)
            return false;
        return true;
    }
}
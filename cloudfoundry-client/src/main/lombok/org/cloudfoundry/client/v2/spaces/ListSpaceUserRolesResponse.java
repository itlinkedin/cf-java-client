/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v2.spaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.ToString;
import org.cloudfoundry.client.v2.PaginatedResponse;

import java.util.List;

/**
 * The response payload for the Retrieving the roles of all Users in the Space operation
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class ListSpaceUserRolesResponse extends PaginatedResponse<UserSpaceRoleResource> {

    @Builder
    ListSpaceUserRolesResponse(@JsonProperty("next_url") String nextUrl,
                               @JsonProperty("prev_url") String previousUrl,
                               @JsonProperty("resources") @Singular List<UserSpaceRoleResource> resources,
                               @JsonProperty("total_pages") Integer totalPages,
                               @JsonProperty("total_results") Integer totalResults) {

        super(nextUrl, previousUrl, resources, totalPages, totalResults);
    }


}

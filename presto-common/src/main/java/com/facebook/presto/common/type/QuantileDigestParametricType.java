/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.common.type;

import java.util.List;
public class QuantileDigestParametricType
        extends StatisticalDigestParametricType
{
    public static final QuantileDigestParametricType QDIGEST = new QuantileDigestParametricType();

    @Override
    public String getName()
    {
        return StandardTypes.QDIGEST.getEnumValue();
    }

    @Override
    public Type getType(List<TypeParameter> parameters)
    {
        return new QuantileDigestType(parameters.get(0).getType());
    }
}
